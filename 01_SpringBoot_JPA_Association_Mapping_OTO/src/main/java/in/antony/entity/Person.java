package in.antony.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "person_tbl")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	private String name;
	private String gender;
	
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL)	
	private Passport passport;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String gender) {
		super();
		
		this.name = name;
		this.gender = gender;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", gender=" + gender + ", passport=" + passport
				+ "]";
	}
	
	
	
	

}
