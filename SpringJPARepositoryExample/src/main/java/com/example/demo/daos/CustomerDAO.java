package com.example.demo.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer>{
	
}
