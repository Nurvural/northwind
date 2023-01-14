package kodlama.io.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.northwind.entities.concretes.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
