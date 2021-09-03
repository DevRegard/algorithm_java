package ExPro;

import java.util.Scanner;

public class ScanTest {
	private static Scanner scan;

	public static void main (String[] dkfhakdfja) {
		
		try {
			scan = new Scanner(System.in);	

			System.out.println("숫자를 3개 입력하세요.");	
			System.out.printf("첫 번째 :"); Long a = scan.nextLong();
			System.out.printf("두 번째 :"); Long b = scan.nextLong();
			System.out.printf("세 번째 :"); Long c = scan.nextLong();
			
			System.out.println("입력한 숫자는 "+ a + ", " + b +", " + c + "입니다.");
			
		} catch (Exception e) {	System.out.println("오류 발생"); }
		
		System.out.println("-------------------------");
		System.out.println("숫자 3개의 패턴은 무엇인지 서술하세요!");
		System.out.println("(단, 단어의 수는 3개로 제한합니다.)");
		
		System.out.printf("서술 : "); String d = scan.next(); String e = scan.next(); String f = scan.next();
		System.out.println("숫자 3개의 패턴은  \"" + d + " " + e + " " + f + "\" 입니다.");
		
//		System.out.printf("서술 : "); String[] d = {scan.next(),scan.next(),scan.next()};
//		System.out.println("숫자 3개의 패턴은  \"" + d + "\" 입니다.");
			
		
	}
		
}
