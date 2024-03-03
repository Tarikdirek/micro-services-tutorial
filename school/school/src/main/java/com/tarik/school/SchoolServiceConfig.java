package com.tarik.school;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class SchoolServiceConfig {

    @Value("${application.config.students-url}")
    private String studentsUrl;

}
