package example.spring.rest.entity;







import org.hibernate.annotations.JoinColumnOrFormula;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="user_table")
public class User extends BaseEntity {

	 @Column
	private String name;
	
	@Column(name="u_p")
	private String password;
	
	
	@Column(name="u_email" ,unique = true)
	private String email;
	
	@Column(name="u_role")
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="address_id")
	@JsonIgnoreProperties("user")
	Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User(String name, String password, String email, UserRole role, Address address) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.role = role;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", role=" + role + ", address="
				+ address + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
