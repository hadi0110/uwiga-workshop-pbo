package org.uwiga.penjualan.cutomer;

public class MasterCustomerController {
	private MasterCustomerView view;
	private MasterCustomerModel model;
	
	public MasterCustomerController(MasterCustomerView parView, MasterCustomerModel parModel) {
		this.view = parView;
		view.reset();
	}
}
