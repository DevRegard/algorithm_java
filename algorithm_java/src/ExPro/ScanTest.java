package ExPro;

import java.util.Scanner;

public class ScanTest {
	private static Scanner scan;

	public static void main (String[] dkfhakdfja) {
		
		try {
			scan = new Scanner(System.in);	

			System.out.println("���ڸ� 3�� �Է��ϼ���.");	
			System.out.printf("ù ��° :"); Long a = scan.nextLong();
			System.out.printf("�� ��° :"); Long b = scan.nextLong();
			System.out.printf("�� ��° :"); Long c = scan.nextLong();
			
			System.out.println("�Է��� ���ڴ� "+ a + ", " + b +", " + c + "�Դϴ�.");
			
		} catch (Exception e) {	System.out.println("���� �߻�"); }
		
		System.out.println("-------------------------");
		System.out.println("���� 3���� ������ �������� �����ϼ���!");
		System.out.println("(��, �ܾ��� ���� 3���� �����մϴ�.)");
		
		System.out.printf("���� : "); String d = scan.next(); String e = scan.next(); String f = scan.next();
		System.out.println("���� 3���� ������  \"" + d + " " + e + " " + f + "\" �Դϴ�.");
		
//		System.out.printf("���� : "); String[] d = {scan.next(),scan.next(),scan.next()};
//		System.out.println("���� 3���� ������  \"" + d + "\" �Դϴ�.");
			
		
	}
		
}
