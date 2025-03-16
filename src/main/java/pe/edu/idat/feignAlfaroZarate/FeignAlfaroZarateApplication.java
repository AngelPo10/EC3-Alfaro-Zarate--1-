package pe.edu.idat.feignAlfaroZarate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignAlfaroZarateApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignAlfaroZarateApplication.class, args);
	}

}
