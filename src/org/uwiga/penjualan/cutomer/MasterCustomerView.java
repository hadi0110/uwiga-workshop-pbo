package org.uwiga.penjualan.cutomer;


public class MasterCustomerView extends CustomerFrame {
	private MasterCustomerModel model;
	
	public MasterCustomerView(MasterCustomerModel parModel) {
		this.model = parModel;
		//1.Menginisailisasi variable
		initVariable();
		//2.Menginisialisasi atau membuat kondisi awal darisuatu form
		initForms();
	}
	
	public void initVariable(){
		//this.model = parModel;
	}
	
	public void initForms(){
		
	}
		
	public void reloadAll() {
		throw new UnsupportedOperationException();
	}

	public void reset() {
		getTextIdCust().setText("              ");
		getTextName().setText(" ");
		getTextAddress().setText(" ");
		getTextTransDate().setText(" ");
		getTextFind().setText(" ");
	}
	public static void main(String[] args) {
		MasterCustomerModel model = new MasterCustomerModel();
		MasterCustomerView f = new MasterCustomerView(model);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
