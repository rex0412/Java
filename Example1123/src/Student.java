
public class Student {

	String name;
	int money;
	double weight;
	boolean rideInfo = false;
	boolean changeRide = false;
	String busName = null;
	String subwayName = null;

	void ride(Subway subway) {
		
	}
	
	void ride(Bus bus) {
		if (rideInfo) {
			// ž�»���
			System.out.println("���߱����� ž�� ���Դϴ�.");
		} else {
			// ž������ ���� ����
			if (changeRide == true) {
				if (money >= 450) {
					bus.money = 450;
					money -= 450;
					rideInfo = true;
					busName = bus.name;
				} else {
					System.out.println("���� �ܾ��� " + money + "���̶� ��Ž");
				}
			} else {
				if (money >= 900) {
					bus.money = 900;
					money -= 900;
					rideInfo = true;
					busName = bus.name;
				} else {
					System.out.println("���� �ܾ��� " + money + "���̶� ��Ž");
				}
			}
		}
	}

	void takeOff() {
		if (rideInfo) {
			rideInfo = false;
			System.out.println(busName + "���� ���Ƚ��ϴ�.");
			busName = null;
		} else {
			System.out.println("���� �׳� ���־��. �Ф�");
		}

	}

	// 1. ž�� ���¿��� �Ѵ�.
	// 2. ȯ���̶�� ���� ����ڰ� �ν��ؾߵ�.
	// 3. ���� ����
}
