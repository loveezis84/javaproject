package java1;

import java.util.Scanner;

public class Class_array2 {
	//2개의 배열 값 - scoring.java 연계
	/*
	 응용문제2
	 "검색하고자 하는 이름을 적어주세요" 출력하게 됩니다.
	  검색어에 이순신이라고 검색을 하게 되면,
	  "이순신님은 80점 입니다." 라고 출력 되도록 합니다.
	  단, scoring에서는 해당 배열에 있는 데이터를 검색하는
	  용도만 사용하도록 합니다.
	 */
	public static void main(String[] args) {
		String a1[] = {"홍길동","이순신","강감찬","김유신"};
		String a2[] = {"100","80","39","42","55"};
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요 :");
		String name = sc.next(); //사용자 입력 단어
		Scoring aa = new Scoring(); //외부 클레스 로드
		sc.close();
		aa.search(a1,a2,name); //외부에 배열값+배열값+입력받는이름 전달
		
	}
}