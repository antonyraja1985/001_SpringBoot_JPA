package in.antony.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.antony.entity.Address;
import in.antony.entity.Employee;
import in.antony.repository.AddressRepository;
import in.antony.repository.EmployeeRepository;

@Service
public class EmployeeService {
   
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	public void deleteEmployee() {
		
		employeeRepository.deleteById(4);//deleted [child+parent] first child delete
		
	}
	
	public void getAddress() {
		
		Optional<Address> byId = addressRepository.findById(1);
		
		if(byId.isPresent()) {
			
			Address address = byId.get();
			System.out.println(address);
		}
		
	}
	
	
	public void getEmployee() {
		Optional<Employee> findById = employeeRepository.findById(1);//only parent retrive -if u want child fetchTyep-EAGER
		
		if(findById.isPresent()) {
			
			Employee employee = findById.get();
			
			List<Address> addressList = employee.getAddressList();               
		}
		
		
	}
	
	public void saveEmployee() {
		
		Employee employee=new Employee();
		employee.setEmployeeName("antony");
		employee.setEmployeeSalary(10000);
		
		Address address=new Address();		
		address.setCity("Chennai");
		address.setState("TN");
		address.setCountry("india");
		
		
		Address address1=new Address();		
		address1.setCity("Salem");
		address1.setState("TN");
		address1.setCountry("india");
		
		List<Address> addressList = Arrays.asList(address,address1);
		
		//association
		address.setEmployee(employee);//parent
		address1.setEmployee(employee);//parent
		
		employee.setAddressList(addressList);//child
		
		employeeRepository.save(employee);
		
		
		
	}
}
