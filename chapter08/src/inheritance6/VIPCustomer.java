package inheritance6;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getAgentID() {
		return agentID;
	}

}
