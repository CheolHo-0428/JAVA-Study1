package abstractex;

public class AutoCar extends Car {
	//�ʵ�
	//������
	//�޼ҵ�
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
		
	}

	@Override
	public void refuel() {
		System.out.println("�ֹ����� �����մϴ�.");
		
	}
	
	public void load() {
		System.out.println("���� �ƽ��ϴ�.");
	}
}