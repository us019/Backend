package example.spring.rest.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")

@NoArgsConstructor
@Getter
@Setter
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customerId;
	
	@OneToOne
	@JoinColumn
	private User user;
	
	@Column(length = 50)
	private int name;
	
	@Column
	private String contactNumber;
	
	@Column
	private Date dob;

	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, User user, int name, String contactNumber, Date dob) {
		super();
		this.customerId = customerId;
		this.user = user;
		this.name = name;
		this.contactNumber = contactNumber;
		this.dob = dob;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", user=" + user + ", name=" + name + ", contactNumber="
				+ contactNumber + ", dob=" + dob + "]";
	}
	
	
	
//	private String address;
//	private String city;
//	private long phone;
	
	
	
}
