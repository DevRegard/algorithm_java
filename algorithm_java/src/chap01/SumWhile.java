package chap01;

public class SumWhile {

	//While���� ����� 1���� n������ ��
	public static String sumWhile (int n) {
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("while���� ����Ǿ����ϴ�. i�� �������� " + i + "�Դϴ�.");
		
		return "1���� " + n + "������ ���� " + sum + "�Դϴ�. \n";
	}
	
	public static void main(String[] args) {
		System.out.println(sumWhile(5));
		System.out.println(sumWhile(18));
		System.out.println(sumWhile(86));
	}
}
