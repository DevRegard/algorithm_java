package chap03;

import testUtil.PrintUtil;

// 이진 검색
// 제약 : 오름차순 배열만 유효
public class BinSearch {

	// 배열 a, 배열의 인덱스 n, 검색값 key
	// key와 일치하는 배열의 인덱스 반환
	public static int binSearch(int[] a, int n, int key) {
		
		int pl = 0;				// 첫 인덱스
		int pr = n - 1;			// 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2; // 중간 인덱스
			if (a[pc] == key) return pc;		// 검색 성공
			else if (a[pc] < key) pl = pc + 1;	// 검색 범위 뒤쪽 절반
			else pr = pc - 1;					// 검색 범위 앞쪽 절반
		} while (pl <= pr);
		
		return -1;	// 검색 실패
	}
	
	public static void main(String[] args) {
		int[] x = PrintUtil.scanArrayASC("이진 검색 (오름차순으로 입력)");
		int num = x.length;
		int key = PrintUtil.searchKey();
		
		int idx = binSearch(x, num, key);
		
		if (idx == -1) System.out.println("\n검색하신 결과값은 존재하지 않습니다.");
		else System.out.println("\n" + key + "은(는) x[" + idx + "]에 있습니다.");
	}
}

// 앞에 요소 보다 작으면 다시 입력 ~> PrintUtil API
// x[0] = PrintUtil.scanInt("첫 요소 입력");