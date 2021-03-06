package witharrayList;

import java.util.ArrayList; // ArrayList import

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>(); // ArrayList 사용 선언

		Customer cutomerLee = new Customer(10010, "이순신");
		Customer cutomerShin = new Customer(10020, "신사임당");
		Customer cutomerHong = new GoldCustomer(10030, "홍길동"); // upcasting
		Customer cutomerYul = new GoldCustomer(10040, "이율곡"); // upcasting
		Customer cutomerKim = new VIPCustomer(10050, "김유신", 12345); // upcasting

		// add method 사용하여 list 배열에 할당
		customerList.add(cutomerLee); // 0
		customerList.add(cutomerShin); // 1
		customerList.add(cutomerHong); // 2
		customerList.add(cutomerYul); // 3
		customerList.add(cutomerKim); // 4

		System.out.println("===== 고객 정보 출력 =====");

		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println("===== 할인율과 보너스 포인트 계산 ======");

		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
			System.out.println(customer.showCustomerInfo());
		}
	}

}
