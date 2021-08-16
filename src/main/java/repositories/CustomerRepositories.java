package repositories;

import entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositories extends JpaRepository<Customer,Long> {
}
