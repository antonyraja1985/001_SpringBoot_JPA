package in.antony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.antony.entity.Address;
import in.antony.entity.Employee;

public interface AddressRepository  extends JpaRepository<Address, Integer>{

}
