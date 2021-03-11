package ch02;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID;

	public VIPCustomer() {
		bonusRatio = 0.05;
		customerGrade = "VIP";
		salesRatio = 0.1;
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
