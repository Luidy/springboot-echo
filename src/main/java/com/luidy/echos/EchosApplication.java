package com.luidy.echos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*@SpringBootApplication 는 @ComponentScan 에 붙어있으며
 @ComponentScan 통해서 아래로 내려가면서 스캔을 통해 Bean 이 등록되므로
 @SpringBootApplication 이 붙은 launcher class 는 패키지 루트에 위치해야함 */

/* @SpringBootApplication 는 @EnableAutoConfiguration 이 붙어있으며
 @EnableAutoConfiguration 통해서 설정을 위한 다양한 Bean 이 등록됨
 따라서 설정을 수동으로 지정하지 않아도 됨
 (spring-boot-autoconfiture 라이브러리에 자동 설정을 위한 클래스가 등록되어있음) */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EchosApplication {
    public static void main(String[] args) {
        SpringApplication.run(EchosApplication.class, args);
    }
}
