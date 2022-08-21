package com.springEx2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        NotificationService notService = (NotificationService) context.getBean("notificationService");
        UserService usrService = (UserService) context.getBean("userService");

        System.out.println(notService.imprimirSaludo());
        System.out.println(usrService.notificationService.imprimirSaludo());
    }
}