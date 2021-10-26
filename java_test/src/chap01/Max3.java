package chap01;

import testUtil.PrintUtil;

public class Max3 {

	static int max3 (int a, int b, int c) {
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("숫자 3개 중에서 가장 큰 수는 " + max + " 입니다.");
		
		return max;
	}
	
	static int max3Array (int[] a) {
		
//		a = new int[3];
		
		int max = a[0];
		if (a[1] > max) max = a[1];
		if (a[2] > max) max = a[2];
		
		System.out.println(); //줄바꿈
		System.out.println("숫자 3개 중에서 가장 큰 수는 " + max + " 입니다.");
		
		return max;
	}
	
	public static void main (String[] args) {
//		max3(321,345634,234532);
//		max3(321,345634,234532);
//		max3(321,345634,234532);
		
//		PrintUtil prin = new PrintUtil();
		
		int[] aa = PrintUtil.scanArray("세 수 중 가장 큰 값");
		
		max3Array(aa);
		PrintUtil.printArray(aa);
		 
	}
}
