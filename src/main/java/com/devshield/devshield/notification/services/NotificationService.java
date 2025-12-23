package com.devshield.devshield.notification.services;

import com.devshield.devshield.auth_users.entity.User;
import com.devshield.devshield.notification.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO, User user);
}
