package in.antony.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.antony.entity.Passport;
import in.antony.entity.Person;
import in.antony.repository.PassportRepository;
import in.antony.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private PassportRepository passportRepository;
	
	
	public void savePerson() {
		
		Person p=new Person( "Antony", "Raja");
		Passport pp=new Passport("4521","10-04-2024", "10-04-2034");
		
		// associate person with passport
		p.setPassport(pp);
		
		// associate passport with person 
		pp.setPerson(p);
		
		//saving person record
		personRepository.save(p);
		
		System.out.println("person insertion completed.........");
	}
	
	public void getPerson() {
		
		Optional<Person> person = personRepository.findById(1);
		System.out.println(person);
	}
	
	public void getPassport(){
		 passportRepository.findById(1);
		
		
	}
}
