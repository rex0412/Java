
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
			// 탑승상태
			System.out.println("대중교통을 탑승 중입니다.");
		} else {
			// 탑승하지 않은 상태
			if (changeRide == true) {
				if (money >= 450) {
					bus.money = 450;
					money -= 450;
					rideInfo = true;
					busName = bus.name;
				} else {
					System.out.println("현재 잔액이 " + money + "원이라 못탐");
				}
			} else {
				if (money >= 900) {
					bus.money = 900;
					money -= 900;
					rideInfo = true;
					busName = bus.name;
				} else {
					System.out.println("현재 잔액이 " + money + "원이라 못탐");
				}
			}
		}
	}

	void takeOff() {
		if (rideInfo) {
			rideInfo = false;
			System.out.println(busName + "에서 내렸습니다.");
			busName = null;
		} else {
			System.out.println("저는 그냥 서있어요. ㅠㅠ");
		}

	}

	// 1. 탑승 상태여야 한다.
	// 2. 환승이라는 값을 사용자가 인식해야됨.
	// 3. 할인 적용
}
