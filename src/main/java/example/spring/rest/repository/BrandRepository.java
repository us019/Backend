package example.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.spring.rest.entity.Brand;


@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
