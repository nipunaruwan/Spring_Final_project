package lk.ijse.carrent.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = "lk.ijse.carrent")
@EnableWebMvc
public class Webappconfig implements WebMvcConfigurer {


    @Bean
public ModelMapper modelMapper(){
        return new ModelMapper();

}
/*
@Bean
    public MultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
}

*/


}
