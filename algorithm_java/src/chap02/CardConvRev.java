package chap02;

import java.util.Scanner;

//�Է� ���� 10������ 2���� ~ 36������ ��� ��ȯ
public class CardConvRev {

	public static int cardConvR(int x, int r, char[] d) {
		
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); //r�� ���� �������� ����
			x /= r; //x = x / r
			
		} while (x != 0);
		
		return digits;
	}
}
