package com.firstconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("=============================================================");
        System.out.println("🚴‍♂️ 🚴‍♀️    Welcome to the Bikes Show-Room Server!    🚴‍♀️ 🚴‍♂️");
        System.out.println("=============================================================");
        System.out.println("Your bike inventory is ready to roll! 🏍️✨");
        System.out.println("Visit the application and start managing your bikes 🚀");
    }
}
