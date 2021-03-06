package ex08;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {

		super(customerID, customerName);
		customerGrade = "VIP"; // Customer class의 초기 등급 SILVER였던 것에 VIP로 덮어씌움
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); // VIP 고객일 때, 가격 10% 할인
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 상담원 번호는 " + agentID + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}
}
