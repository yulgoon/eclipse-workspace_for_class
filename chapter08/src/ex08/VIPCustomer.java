package ex08;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {

		super(customerID, customerName);
		customerGrade = "VIP"; // Customer class�� �ʱ� ��� SILVER���� �Ϳ� VIP�� �����
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); // VIP ������ ��, ���� 10% ����
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ���� ��ȣ�� " + agentID + "�Դϴ�.";
	}

	public int getAgentID() {
		return agentID;
	}
}