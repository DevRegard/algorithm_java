package chap2;

public class IntArray {
	public static void main (String[] args) {
		int[] a = new int[5]; //�ε��� 0 ~ 4
		
		a[1] = 452;
		a[2] = 42;
		a[4] = a[1] * 2;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i] );
		}
	}
}
