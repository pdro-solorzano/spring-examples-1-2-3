package com.springEx2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
