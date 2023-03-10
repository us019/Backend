package example.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.spring.rest.entity.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
