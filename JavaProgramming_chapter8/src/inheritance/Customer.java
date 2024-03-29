package inheritance;

public class Customer {
	//필드
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//생성자
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER"; // 기본등급
		bonusRatio = 0.01; // 보너스 포인트 기본 적립 비율 
//		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	//메소드
	public int calPrice(int price) {
		bonusPoint = (int) (bonusPoint +(price * bonusRatio));
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + "입니다. ";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
		
}
