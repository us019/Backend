package example.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.spring.rest.entity.Cart;
import example.spring.rest.entity.Product;


@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
