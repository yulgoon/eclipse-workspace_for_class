package witharrayList;

import java.util.ArrayList; // ArrayList import

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>(); // ArrayList ��� ����

		Customer cutomerLee = new Customer(10010, "�̼���");
		Customer cutomerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer cutomerHong = new GoldCustomer(10030, "ȫ�浿"); // upcasting
		Customer cutomerYul = new GoldCustomer(10040, "������"); // upcasting
		Customer cutomerKim = new VIPCustomer(10050, "������", 12345); // upcasting

		// add method ����Ͽ� list �迭�� �Ҵ�
		customerList.add(cutomerLee); // 0
		customerList.add(cutomerShin); // 1
		customerList.add(cutomerHong); // 2
		customerList.add(cutomerYul); // 3
		customerList.add(cutomerKim); // 4

		System.out.println("===== ���� ���� ��� =====");

		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println("===== �������� ���ʽ� ����Ʈ ��� ======");

		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " ���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "���Դϴ�.");
			System.out.println(customer.showCustomerInfo());
		}
	}

}