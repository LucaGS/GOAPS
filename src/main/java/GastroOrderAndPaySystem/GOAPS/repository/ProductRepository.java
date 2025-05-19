package GastroOrderAndPaySystem.GOAPS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import GastroOrderAndPaySystem.GOAPS.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
