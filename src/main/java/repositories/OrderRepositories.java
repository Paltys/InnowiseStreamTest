package repositories;

import entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepositories extends JpaRepository<Order,Long> {
}
