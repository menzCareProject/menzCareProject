package io.github.menzcare.backoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages ={"io.github.menzcare.backoffice", "io.github.menzcare.common"})
@EntityScan(basePackages = {"io.github.menzcare.common.domain"})
@EnableJpaRepositories(basePackages = {"io.github.menzcare.common.repositories"})
public class BackOfficeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackOfficeApplication.class, args);
    }

}
