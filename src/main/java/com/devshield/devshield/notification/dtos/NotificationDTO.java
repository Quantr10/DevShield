package com.devshield.devshield.notification.dtos;

import java.time.LocalDateTime;
import java.util.Map;

import com.devshield.devshield.enums.NotificationType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDTO {

    private Long id;

    private String subject;

    @NotBlank(message = "Recipient is required")
    private String recipient;

    private String body;

    private NotificationType type;

    private LocalDateTime createdAt;

    //for values/variables to be passed into email template to send
    private String templateName;
    private Map<String, Object> templateVariables;

}
