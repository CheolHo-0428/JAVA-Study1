package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		customerLee.showCustomerInfo();
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 852);
//		customerKim.setCustomerID(10020);
//		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		customerKim.showCustomerInfo();
	}

}
