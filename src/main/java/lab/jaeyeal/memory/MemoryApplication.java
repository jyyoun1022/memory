package lab.jaeyeal.memory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MemoryApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MemoryApplication.class).run(args);
	}

}
