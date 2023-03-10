package example.spring.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import example.spring.rest.entity.User;
import jakarta.transaction.Transactional;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//	@Transactional
//	@Modifying
//
//	@Query("update User r set r.password = :password, r.email = :email, r.role = :role where r.userId = :userId")
//	void updateOneUser(Integer userId,int password,String email,String role);
//	
	
	public Optional<User> findByEmailAndPassword(String email, String password);

	

	
}
