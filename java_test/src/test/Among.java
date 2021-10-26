package test;

public class Among {

	//멤버
//	private int[] total = new int[10];
//	private int[] crew = new int[8]; 
//	private int[] imporster = new int[2];
	
	private static String[] member = {"red", "orange", "yellow", "green", "blue", 
							   "deepblue", "brown", "pubble", "pink", "black"};
	
	//시작
	public static void gameStart() {
		System.out.println("-----------------------------------");
		System.out.println("게임이 시작되었습니다.");
		System.out.println("-----------------------------------");
		
		System.out.println("\n");
		
		int peopleTotal = member.length;
//		int peopleTotal = 10;
		
		System.out.println("참여한 인원은 " + peopleTotal + "명");
		System.out.print("참가자는 ");
		for (int i = 0; i < member.length; i++) {
			System.out.print(member[i] + " ");
		}
		System.out.print("입니다 ");
	}
	
	//투표 시간
	public static void vote() {}
	
	//킬
	public static void kill() {}
		
	//투표 결과
	public static void voteResult() {} 
	
	//게임 결과
	public static void gameResult() {}
	
	public static void main(String[] args) {
		gameStart();
	}
}
