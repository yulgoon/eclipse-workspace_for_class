package inheritance6;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		Customer customerKim = new Customer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		VIPCustomer customerShin = new VIPCustomer();
		customerShin.setCustomerID(10030);
		customerShin.setCustomerName("�Ż��Ӵ�");
		customerShin.bonusPoint = 30000;
		customerShin.setAgentID(3080);
		System.out.println(customerShin.showCustomerInfo());
		
	}
}