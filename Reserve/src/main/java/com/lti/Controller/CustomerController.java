package com.lti.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.Login;
import com.lti.dto.LoginStatus;
import com.lti.dto.RegisterStatus;
import com.lti.entity.Customer;
import com.lti.exception.CustomerServiceException;
import com.lti.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/register.api")
	@Transactional
	public RegisterStatus register(@RequestBody Customer customer) {
		try {
			int id = customerService.register(customer);
			RegisterStatus status = new RegisterStatus();
			status.setStatus(true);
			status.setRegisteredCustomerId(id);
			return status;
			//we should return some json instead
		}
		catch (CustomerServiceException e) {
			RegisterStatus status = new RegisterStatus();
			status.setStatus(false);
			status.setMessageIfAny(e.getMessage());
			return status; //we should return this error in json format instead
		}
		
	}
		@RequestMapping("/login.api")
		public LoginStatus login(@RequestBody Login login) {
			try {
				Customer customer=customerService.login(login);
				LoginStatus loginStatus=new LoginStatus();
				loginStatus.setStatus(true);
				loginStatus.setCustomerId(customer.getId());
				loginStatus.setCustomerName(customer.getName());
				return loginStatus;
			}
			catch(CustomerServiceException e) {
				LoginStatus loginStatus=new LoginStatus();
				loginStatus.setStatus(false);
				loginStatus.setMessageIfAny(e.getMessage());
				return loginStatus;
			}
		}
	

}