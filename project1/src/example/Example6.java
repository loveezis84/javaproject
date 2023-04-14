package example;

import java.util.*; //유틸 안에 모든 라이브러리를 사용

public class Example6 {
	
//	Integer data[] = new Integer[10];
	ArrayList<Integer> data = new ArrayList<>(); //동적배열만드는 기본 구조
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Example6 ex = new Example6();
		ex.abc();
	}
	public void abc() {
//		data[0] = sc.nextInt();
		int w = 0;
		while (true) { //원하는 만큼 돌리는 반복문
			System.out.println("숫자를 5개를 입력하세요"); //반복문이 돌때마다 시스템 메시지를 출력
			data.add(sc.nextInt()); //원하는 만큼의 배열값을 넣을때 사용 (스캐너를 안에 넣어서 입력하는 숫자를 계속넣는방식)
			System.out.println(data); //배열 값을 출력
			sc.close();
		}
	}
}