package io.mcore.myapp;

import java.security.Principal;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
public class BasicResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicResourceServerApplication.class, args);
	}
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	
	@RequestMapping("/data")
    public String readFoo() {
        return "read data " + UUID.randomUUID().toString();
    }

}
