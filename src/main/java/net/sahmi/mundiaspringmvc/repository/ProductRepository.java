package net.sahmi.mundiaspringmvc.repository;

import net.sahmi.mundiaspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
