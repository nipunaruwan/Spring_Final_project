package lk.ijse.carrent.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages ="lk.ijse.carrent.repo" )
@PropertySource("classpath:application.properties")
public class JPAConfig {



}
