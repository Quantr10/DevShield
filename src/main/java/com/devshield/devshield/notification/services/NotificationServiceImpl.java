package com.devshield.devshield.notification.services;

import java.nio.charset.StandardCharsets;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.devshield.devshield.auth_users.entity.User;
import com.devshield.devshield.enums.NotificationType;
import com.devshield.devshield.notification.dtos.NotificationDTO;
import com.devshield.devshield.notification.entity.Notification;
import com.devshield.devshield.notification.repo.NotificationRepo;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepo notificationRepo;
    private final JavaMailSender mailSender;
    private final TemplateEngine templateEngine;

    @Override
    @Async
    public void sendEmail(NotificationDTO notificationDTO, User user) {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, 
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name()
            );
            helper.setTo(notificationDTO.getRecipient());
            helper.setSubject(notificationDTO.getSubject());

            //use template if provided
            if(notificationDTO.getTemplateName() != null) {
                Context context = new Context();
                context.setVariables(notificationDTO.getTemplateVariables());
                String htmlContent = templateEngine.process(notificationDTO.getTemplateName(), context);
                helper.setText(htmlContent, true );
            } else {
                //if no template, send text body directly 
                helper.setText(notificationDTO.getBody(), true);
            }

            mailSender.send(mimeMessage);
            // save to db
            Notification notificationToSave = Notification.builder()
                .recipient(notificationDTO.getRecipient())
                .subject(notificationDTO.getSubject())
                .body(notificationDTO.getBody())
                .type(NotificationType.EMAIL)
                .user(user)
                .build();

            notificationRepo.save(notificationToSave);

        } catch (MessagingException e) {
            log.error(e.getMessage());
        }
    }
    
}
