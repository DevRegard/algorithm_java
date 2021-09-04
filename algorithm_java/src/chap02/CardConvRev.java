package chap02;

import java.util.Scanner;

//입력 받은 10진수를 2진수 ~ 36진수로 기수 변환
public class CardConvRev {

	public static int cardConvR(int x, int r, char[] d) {
		
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지값 저장
			x /= r; //x = x / r
			
		} while (x != 0);
		
		return digits;
	}
}
