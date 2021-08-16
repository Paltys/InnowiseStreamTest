package repositories;

import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepositories extends JpaRepository<Product,Long> {
}
