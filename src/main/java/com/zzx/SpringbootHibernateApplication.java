package com.zzx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
//@ServletComponentScan
public class SpringbootHibernateApplication {

    /**
     * 两种使用自定义servlet的方式
     *
     * @return
     */

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHibernateApplication.class, args);
    }
}
