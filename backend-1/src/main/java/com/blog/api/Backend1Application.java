package com.blog.api;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Backend1Application/* implements CommandLineRunner */{
//@Autowired
//private PasswordEncoder encoder;
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(encoder.encode("Da@9141525275"));
//		
	//}

	public static void main(String[] args) {
		SpringApplication.run(Backend1Application.class, args);
	}

    @Bean
    ModelMapper makeModelMapper() {
		return new ModelMapper();
	}
    

}