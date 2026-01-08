package org.example.simspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("org.example.simspring.beans")
public class AnnotationConfig {
}
