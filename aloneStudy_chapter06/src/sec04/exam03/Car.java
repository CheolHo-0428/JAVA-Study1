package sec04.exam03;

public class Car {
	//�ʵ�
	int gas;
	
	//������
	Car(){}
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas �ܷ�:" + gas + ")");
				gas = gas - 1;
			}
			else {
				System.out.println("����ϴ�.(gas �ܷ�:" + gas + ")");
				return;
			}
		}
	}
}