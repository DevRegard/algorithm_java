package chap03;

// 이진 검색
// 제약 : 오름차순 배열만 유효
public class BinSearch {

	// 배열 a, 배열의 인덱스 n, 검색값 key
	// key와 일치하는 배열의 인덱스 반환
	public static int binSearch(int[] a, int n, int key) {
		
		int pl = 0;				// 첫 인덱스
		int pr = n - 1;			// 끝 인덱스
		int pc = (pl + pr) / 2; // 중간 인덱스
		
		do {
			if (a[pc] == key) return pc;		// 검색 성공
			else if (a[pc] < key) pl = pc + 1;	// 검색 범위 뒤쪽 절반
			else pr = pc - 1;					// 검색 범위 앞쪽 절반
		} while (pl <= pr);
		
		return -1;	// 검색 실패
	}
	
}
