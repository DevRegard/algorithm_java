package chap01;

public class Median {
	
	//세 값의 중앙값
	static int med3 (int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b; //a > b > c
			else if (a <= c) 
				return a; //c > a > b
			else 
				return c; //a > c > b
			
		else if (a > c)
			return a; //b > a > c
			
		else if (b > c)
			return c; //b > c > a
		
		else
			return b; //c < b > a
	}
	
	public static void main(String[] args) {
	
		System.out.println(med3(1,2,3));
		System.out.println(med3(3,2,1));
		System.out.println(med3(8,2,5));
		System.out.println(med3(12,98,123412));
		System.out.println(med3(56345,325243654,34235));
	}
}
