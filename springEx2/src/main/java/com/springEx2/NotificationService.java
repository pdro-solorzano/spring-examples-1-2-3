package com.springEx2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public String imprimirSaludo() {
        return "Hola desde clase NotificationService";
    }
}
