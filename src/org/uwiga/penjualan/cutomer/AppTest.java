package org.uwiga.penjualan.cutomer;

public class AppTest {
	
	public static void main(String[] args) {
		MasterCustomerModel model = new MasterCustomerModel();
		MasterCustomerView view = new MasterCustomerView(model);		
		MasterCustomerController f = new MasterCustomerController(view, model);
		view.setVisible(true);

	}
}
