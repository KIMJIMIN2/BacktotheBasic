package ch04;

public class VIPCustomer extends Customer {

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.01;

		System.out.println("VIP CUSTOMER() Call");

	}

	double salesRatio;
	


	private String agentID;

//	public VIPCustomer() {
//		bonusRatio = 0.05;
//		customerGrade = "VIP";
//		salesRatio = 0.1;
//
//		System.out.println("VIP customer() Call");
//	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint+= price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	public double getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}
