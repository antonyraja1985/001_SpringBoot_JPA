package in.antony.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="passport_tbl")
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportId;
	private String passportNum;
	private String issueDate;
	private String expiryDate;
	
	Passport(){
		
	}
	
	public Passport(String passportNum, String issueDate, String expiryDate) {
		super();
		
		this.passportNum = passportNum;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}

	@OneToOne()
	@JoinColumn(name = "person_Id")
	private Person person;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNum=" + passportNum + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + ", person=" + person + "]";
	}
	
	
	
	

}
