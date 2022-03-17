package com.lti.service;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.CustomerDao;
import com.lti.dto.Login;
import com.lti.entity.Customer;
import com.lti.exception.CustomerServiceException;

@Component
@Transactional
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;

	public int register(Customer customer) {
		if (customerDao.isCustomerPresent(customer.getEmail()))
			throw new CustomerServiceException("Customer already registered");
		else {
			Customer updatedCustomer = (Customer) customerDao.save(customer);
			return updatedCustomer.getId();
		}
		
	}
	public Customer login(Login login) {
		try {
			int id=customerDao.isValidUserV2(login.getEmail(), login.getPassword());
			Customer customer=customerDao.fetchById(Customer.class,id );
			return customer;
		}
		catch(NoResultException e){
			throw new CustomerServiceException("invalid email/password!");
			
		}
		
	}
}
