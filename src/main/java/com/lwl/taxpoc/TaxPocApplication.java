package com.lwl.taxpoc;

import com.lwl.taxpoc.entity.Role;
import com.lwl.taxpoc.entity.User;
import com.lwl.taxpoc.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class TaxPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxPocApplication.class, args);
	}
	@Bean
	public CommandLineRunner setupDefaultUser(UserService service) {
		return args -> {
			service.save(new User(
					"pkm", //username
					"pkm", //password
					Arrays.asList(new Role("USER"), new Role("ACTUATOR")),//roles
					true//Active
			));
		};
	}

	@Bean
	public PasswordEncoder getPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
