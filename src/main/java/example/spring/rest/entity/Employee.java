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
@Table(name="employee_table")

public class Employee {

	
//	employeeId int primary key auto_increment, 
//	employeeName varchar(50), 
//	DOB DATE,
//	Designation varchar(50)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int employeeId;
	
	@OneToOne
	@JoinColumn
	private User user;
	
	@Column(length = 50)
	private int name;
	
	@Column
	private String contactNumber;
	
	@Column
	private Date dob;
	
	@Column
	private String PANIdNumber;
	
	@Column
	private String bankAccountNumber;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getPANIdNumber() {
		return PANIdNumber;
	}

	public void setPANIdNumber(String pANIdNumber) {
		PANIdNumber = pANIdNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, User user, int name, String contactNumber, Date dob, String pANIdNumber,
			String bankAccountNumber) {
		super();
		this.employeeId = employeeId;
		this.user = user;
		this.name = name;
		this.contactNumber = contactNumber;
		this.dob = dob;
		PANIdNumber = pANIdNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", user=" + user + ", name=" + name + ", contactNumber="
				+ contactNumber + ", dob=" + dob + ", PANIdNumber=" + PANIdNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]";
	}
	
	
}
