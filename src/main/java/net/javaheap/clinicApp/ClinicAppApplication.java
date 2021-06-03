package net.javaheap.clinicApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ClinicAppApplication {

	@GetMapping("/")
	String home() {
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClinicAppApplication.class, args);
	}

}
