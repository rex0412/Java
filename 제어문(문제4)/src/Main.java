import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int firstNum = scanner.nextInt();
		int secondNum = firstNum % 10;
		if (firstNum < 1) {
			System.out.println("이 값은 음수값 입니다.");
		}
		  else if (secondNum != 0) {
			System.out.println("이 값은 10의 배수가 아닙니다.");
		}
		  else if (secondNum == 0) {
			  System.out.println("이 값은 10의 배수 입니다.");
		}
	}
}
