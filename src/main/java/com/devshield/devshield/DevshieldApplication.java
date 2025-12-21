package com.devshield.devshield;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class DevshieldApplication {

	// private final NotificationService notificationService;

	public static void main(String[] args) {
		SpringApplication.run(DevshieldApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner() {
	// 	return args -> {
	// 		NotificationDTO notificationDTO = NotificationDTO.builder()
	// 			.recipient("quanttran10@gmail.com")
	// 			.subject("Test Email from DevShield")
	// 			.body("This is a test email sent from DevShield application.")
	// 			.type(NotificationType.EMAIL)
	// 			.build();
	// 		notificationService.sendEmail(notificationDTO, new User());
	// 	};
	// }
}
