package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class List6 {

	public static void main(String[] args) {
		/*
		List, ArraList : 데이터 추가 빠름
		단점 : 검색 속도가 느림, 삭제 느림
		LinkList : 검색 속도가 배열 선언문 중에서는 가장 빠름
		데이터 추가 저장, 삭제 빠름
		단점 : 메모리 할당이 높음, 크기 변경을 못함
		*/
		Integer a[] = {1,2,3,4,5};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));
		System.out.println(ln); //출력값 [1, 2, 3, 4, 5]
		ln.add(2);
		System.out.println(ln); //출력값 [1, 2, 3, 4, 5, 2]
		
		ln.addFirst(2);
		
		String b[] = {"aa","bb","cc","dd"};
		LinkedList<String> ls = new LinkedList<>(Arrays.asList(b));
		ls.remove("cc");
		System.out.println(ls);
	}
}
