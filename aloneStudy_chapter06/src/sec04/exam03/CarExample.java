package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState == true) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		boolean gasState1 = myCar.isLeftGas();
		if(gasState1) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}
		else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}