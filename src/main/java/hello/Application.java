package hello;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
public static void main(String[] args) {
    System.getProperties().put( "server.port", "%HTTP_PLATFORM_PORT%" );  //8181 port is set here
    SpringApplication.run(Application.class, args);
}
}
