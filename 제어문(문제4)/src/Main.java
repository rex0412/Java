import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int firstNum = scanner.nextInt();
		int secondNum = firstNum % 10;
		if (firstNum < 1) {
			System.out.println("�� ���� ������ �Դϴ�.");
		}
		  else if (secondNum != 0) {
			System.out.println("�� ���� 10�� ����� �ƴմϴ�.");
		}
		  else if (secondNum == 0) {
			  System.out.println("�� ���� 10�� ��� �Դϴ�.");
		}
	}
}
