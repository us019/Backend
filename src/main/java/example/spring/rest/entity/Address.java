package example.spring.rest.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="address")
@NoArgsConstructor
@Getter
@Setter
public class Address extends BaseEntity {
//
//	addressId int primary key auto_increment, 
//	customerId int NOT NULL, 
//	address varchar(250), 
//	city VARCHAR(50), 
//	PINcode int NOT NULL CHECK(PINcode REGEXP '^[0-9]{6}$'),
//	FOREIGN KEY (customerId) REFERENCES customers(customerId) 
	
	
	
	
	
//	@OneToOne
//	@JoinColumn(name="user_Id")
//	private User user;
	
	@Column
	private String addressLine;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private int PIN;
	
	@OneToOne(mappedBy="address")
	@JsonIgnoreProperties("address")
	private User user;

	public Address(String addressLine, String city, String state, int pIN, User user) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		PIN = pIN;
		this.user = user;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + ", state=" + state + ", PIN=" + PIN
				+ ", user=" + user + "]";
	}
	
	
	
}
