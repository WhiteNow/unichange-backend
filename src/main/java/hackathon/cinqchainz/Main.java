package hackathon.cinqchainz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("El servidor se está inicializando...");
        SpringApplication.run(Main.class, args);
    }
}
