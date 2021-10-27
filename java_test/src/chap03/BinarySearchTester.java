package chap03;

import java.util.Arrays;

import testUtil.PrintUtil;

// Arrays.binarySearch 이진 검색
public class BinarySearchTester {

	public static void main(String[] args) {
		int[] x = PrintUtil.scanArrayASC("이진검색 (오른차순 입력)");
		int key = PrintUtil.searchKey();
		
		int idx = Arrays.binarySearch(x, key);
		
		if (idx < 0) System.out.println("\n검색하신 결과값은 존재하지 않습니다.");
		else System.out.println("\n" + key + "은(는) x[" + idx + "]에 있습니다.");
	}
}
