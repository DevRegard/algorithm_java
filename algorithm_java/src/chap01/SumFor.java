package chap01;

public class SumFor {

	//������ ��
	public static String sumFor (int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		return "1���� " + n + "������ ���� " + sum + "�Դϴ�. \n";
	}
	
	
	//�� ���� ���
	public static String sumFor2 (int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
			System.out.print(i+1 + "+");
		}
		
		System.out.print("=" + sum);
		System.out.println();
		
		return "1���� " + n + "������ ���� " + sum + "�Դϴ�. \n";
	}
	
	
	//���콺�� ����
	public static String sumFor3 (int n) { return ""; }
	
	
	//���� a,b�� �����Ͽ� �� ������ ��� ������ ��
	public static String sumFor4 (int n) { return ""; }
	
	
	public static void main(String[] args) {
		System.out.println(sumFor(10));
		System.out.println(sumFor(54745));
		System.out.println(sumFor(7685));
		
		System.out.println(sumFor2(7));
	}
}
