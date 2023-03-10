package example.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.spring.rest.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
