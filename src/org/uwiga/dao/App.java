package org.uwiga.dao;

import java.util.List;
import java.util.ArrayList;
import org.uwiga.model.Customer;

public class App {
	private CustomerDao customerManager;
	public App(){
		CustomerDao customerManager = new CustomerDaoImpl();
		Customer cust1 =new Customer();
		cust1.setIdCustomer("001");
		cust1.setName("Hadi");
		customerManager.saveOrUpdate(cust1);
		
		Customer cust2 =new Customer();
		cust2.setIdCustomer("002");
		cust2.setName("Sutik");
		customerManager.saveOrUpdate(cust2);
		
		List<Customer> keranjangcustomer = new ArrayList<>();
		keranjangcustomer = customerManager.findAll();
		for (Customer item : keranjangcustomer){
			System.out.println(item);
		} 
//		for (int i=0; i<keranjangcustomer.size(); i++){
//			Customer item = new Customer();
//			item = keranjangcustomer.get(i);
//			System.out.println(item);
//		}
		
		
	}
	public static void main(String[] args) {
		App f = new App();
		
	}
}
