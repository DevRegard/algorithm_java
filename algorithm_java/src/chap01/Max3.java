package chap01;

import java.util.Scanner;

/**
 * @author utr16
 * 
 * 순차적 구조 : 순차적으로 실행되는 구조
 * 선택 구조 : 프로그램의 실행 흐름을 변경하는 if문에 해당
 *
 */
public class Max3 {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
	
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은 "+ max + "입니다.");
	}
}
