package chap01;

public class Max3m {

	//Max3�� ����� �����ϴ� �޼��带 �����ϰ� �׽�Ʈ
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
	}
	
	//�޼��带 ���Ͽ� ������ �׽�Ʈ ȯ�� ����
	public static void main(String[] args) {
	System.out.println("max3(34,26,95)������ �ִ� : " + Max3m.max3(34, 26, 95) );
		
	}
}
