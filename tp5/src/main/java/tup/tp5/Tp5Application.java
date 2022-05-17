package tup.tp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tp5Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp5Application.class, args);
	}

	@GetMapping("/")
	public String hola() {
       
		String respuesta = "";

		String[] entradas = { "1", "2", "2", "4"};
        respuesta += "Cantidad de entradas: " + entradas.length;
		
		for (int i = 0; i < entradas.length; i++) {
        ;
		}
		return respuesta;
	}

}
