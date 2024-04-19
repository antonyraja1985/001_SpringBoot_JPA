package in.antony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.antony.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
