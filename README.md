<div align="center">
<h1>springboot-echo</h1>
<p>
This is spring boot echo server.
</p>
</div>

## Spring Boot 개요

- Enterprise Application 개발에 보편적으로 사용되며 Spring 기반 Application을 쉽게 생성할 수 있게 함
- 필요한 환경설정을 최소화로 하고, 비즈니스 로직에 집중할 수 있도록 함
- 내장된 Tomcat, Jetty, Undertow를 통해 독립적으로 실행 가능함

### Spring Boot Starters

- 개별적으로 설정해야했던 의존적인 라이브러리들의 관계를 자동적으로 설정함
- e.g. spring-boot-starter-web을 추가하면 `spring-web-*.jar`, `spring-webmvc-*.jar`, `tomcat-*.jar`, `jackson-databind-*.jar` 가 자동으로 추가됨

### Automatic Configucation

- Application 기능에 대한 자동 설정을 제공함
- e.g. JPA starter를 종속성에 추가하면 JPA와 관련된 설정을 자동으로 시도함

### Spring Boot Actuator

- Spring Application을 모니터링하기 위한 기능을 제공함
