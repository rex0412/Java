
public class Main {

	public static void main(String[] args) {
		Student pilsang = new Student();
		Student dongin = new Student();
		Student chanmi = new Student();
		Student sunho = new Student();
		Student daeyong = new Student();
		Student jungha = new Student();
		Student yoonsu = new Student();
		
		Bus bus370 = new Bus(370);
		Bus bus3413 = new Bus(3413);
		
		System.out.println("3413¿« µ∑ : "+bus3413.money);
		pilsang.money = 900;
		
		
		pilsang.ride(bus3413);
		pilsang.ride(bus3413);
		pilsang.takeOff();
		
		System.out.println("« ªÛ¿Ã¿« µ∑ : "+pilsang.money);
		System.out.println("3413¿« µ∑ : "+bus3413.money);
	}
}
