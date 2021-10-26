package chap03;

import testUtil.PrintUtil;

// 선형 검색
// 종료 조건 2가지 (검색 실패, 검색 성공)
public class SeqSearch {

	public static int seqSearch(int[] a, int n, int key) {
		
		int i = 0;
		
		while (true) {
			if (i == n) return -1; 		// 검색 실패 (-1 반환)
			if (a[i] == key) return i;	// 검색 성공 (위치[인덱스] 반환)
			i++;
		}
	}
	
	public static int seqSearchFor(int[] a, int n, int key) {
		for(int i = 0; i < n; i++)
			if (a[i] == key) return i;
		return -1;
	}
	
	public static void isKey(int index, int key) {
		if (index == -1) System.out.println("\n그 값의 요소는 없습니다.");
		else System.out.println("\n" + key + "은(는) x[" + index + "]에 있습니다.");
	}
	
	public static void main(String[] args) {
		
		int[] x = PrintUtil.scanArray("[선형 검색]\n"); // 배열 생성
		int num = x.length; 			// 길이
		int ky = PrintUtil.searchKey(); // 검색할 값
		
		int idx = seqSearch(x, num, ky); // 배열, 길이, 검색할 값
		
		isKey(idx, ky); // 검색 결과, 검색할 값
		
	}
	
	
}



/*검색할 값 저장 코드이였던 것*/
//		Scanner scan = new Scanner(System.in);
//		System.out.print("\n검색할 값 : ");
//		int ky = scan.nextInt();

/*검색 결과 코드 이였던 것*/
//		if (idx == -1) System.out.println("그 값의 요소는 없습니다.");
//		else System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");