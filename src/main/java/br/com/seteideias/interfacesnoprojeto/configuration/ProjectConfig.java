package br.com.seteideias.interfacesnoprojeto.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class ProjectConfig {

    @Order(2)
    @Bean
    public String config1(){
        System.out.println("config1");
        return "config1";
    }

    @Order(1)
    @Bean
    public String config2(){
        System.out.println("config2");
        return "config2";
    }

}
