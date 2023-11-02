package com.example.bizsurveydomainpr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BizSurveyDomainPrApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizSurveyDomainPrApplication.class, args);
    }

}
