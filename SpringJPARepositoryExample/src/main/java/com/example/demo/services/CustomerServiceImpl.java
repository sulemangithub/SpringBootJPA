package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CrudRepository<Customer, Integer> repository;
	
	@Override
	public void saveCustomer(Customer customer) {
		repository.save(customer);
	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		Optional<Customer> op = repository.findById(id);
		return op.get(); 
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		List<Customer> list = new ArrayList<>();
		repository.findAll().forEach(customer->list.add(customer));
		return list;
	}

	@Override
	public void removeCustomerById(int id) {
		repository.deleteById(id);
		
	}

}
