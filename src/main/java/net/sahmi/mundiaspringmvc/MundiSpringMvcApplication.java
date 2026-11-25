package net.sahmi.mundiaspringmvc;

import net.sahmi.mundiaspringmvc.entities.Product;
import net.sahmi.mundiaspringmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;
import org.springframework.boot.security.autoconfigure.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;
import org.springframework.boot.security.autoconfigure.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.security.autoconfigure.web.servlet.ServletWebSecurityAutoConfiguration;

@SpringBootApplication
public class MundiSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MundiSpringMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ProductRepository productRepository) {
        return args -> {
            Product product = new Product();
            product.setName("Phone");
            product.setPrice(8000);
            product.setQuantity(10);
            productRepository.save(product);

            Product product2 = new Product();
            product2.setName("Computer");
            product2.setPrice(10000);
            product2.setQuantity(25);
            productRepository.save(product2);

            Product product3 = new Product();
            product3.setName("Printer");
            product3.setPrice(1200);
            product3.setQuantity(10);
            productRepository.save(product3);
        };
    }



}