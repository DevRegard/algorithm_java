package chap03;

import testUtil.PrintUtil;

public class SeqSearchSen {

	public static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key; // 보초
//		a[n-1] = key; // 보초
		// *디버깅 분석 결과 : a[n]은 존재하지 않기 때문에 오류 발생
		// *버그 해결 방법 : 보초 위치는 a[n-1] 이므로 여기에 key값 초기화
		// *n값이 x.length로 설정되어 있어서 책과 다른 결과가 발생 
		
		while (true) {
			if (a[i] == key) break;
			i++;
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		int[] x = PrintUtil.scanArraySen("[선형 검색 + 보초법]");
		int num = x.length - 1; //디버그 오류 결정적 원인 및 해결방법 (책내용과 일치)
		int key = PrintUtil.searchKey();
		
		int inx = seqSearchSen(x, num, key);
		SeqSearch.isKey(inx, key); //같은 패키지에서는 import문 없이 사용가능하다.
	}
}