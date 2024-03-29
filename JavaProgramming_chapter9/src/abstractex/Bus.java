package abstractex;

public class Bus extends Car {
	//필드
	//생성자
	//메소드
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");		
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전합니다.");	
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
}
