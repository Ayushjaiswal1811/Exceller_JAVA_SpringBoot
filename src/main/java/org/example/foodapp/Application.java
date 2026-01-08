package org.example.foodapp;

import org.example.foodapp.config.AppConfig;
import org.example.foodapp.controller.OrderController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

                ApplicationContext ctx =
                        new AnnotationConfigApplicationContext(AppConfig.class);

                OrderController controller = ctx.getBean(OrderController.class);
                controller.placeOrder();

        }

    }

