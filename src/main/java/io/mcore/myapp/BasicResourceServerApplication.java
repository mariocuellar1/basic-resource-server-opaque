package io.mcore.myapp;

import java.security.Principal;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BasicResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicResourceServerApplication.class, args);
	}

	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}

	@RequestMapping("/data")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String readData1() {
		return "read data " + UUID.randomUUID().toString();
	}

	@RequestMapping("/data1")
	@PreAuthorize("#oauth2.hasScope('write')")
	public String readData2() {
		return "read data " + UUID.randomUUID().toString();
	}

}
