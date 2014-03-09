package org.uwiga.dao;

import java.util.ArrayList;
import java.util.List;

import org.uwiga.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	//Tempat penyimpanan >> nantinya akan diganti database
	List<Customer> listCustomer = new ArrayList<>();
	
	@Override
	public void saveOrUpdate(Customer o) {
//		System.out.println(o.getIdCustomer());
//		System.out.println(o.getName());
		listCustomer.add(o);
	}

	@Override
	public void delete(Customer o) {
		listCustomer.add(o);
		
	}

	@Override
	public List<Customer> findAll() {
		
		return listCustomer;
	}

	@Override
	public List<Customer> findById() {
		return listCustomer;
	}
}
