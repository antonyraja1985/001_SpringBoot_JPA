package in.antony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.antony.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
