package com.devshield.devshield.notification.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devshield.devshield.notification.entity.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Long> {

}
