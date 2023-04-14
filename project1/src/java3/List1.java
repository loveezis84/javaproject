package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	public static void main(String[] args) {
		//ArraysList : java 라이브러리 배열 메소드 입니다.
		//Arrays.aslist(배열이름을 입력하면 배열에 해당하는 값이 새로운 a1배열에 다 추가됨);
		//add(추가), get(배열 데이터로드), remove(배열값 삭제), size(배열갯수 length와같음)
		//중요사항 : add 사용시 무조건 맨 뒤에 데이터가 추가됨 
		//        단,index 번호를 적용후 값을 실행시 해당 index부분에 추가가 될수 있다.
		
		String member[] = {"박소은","윤준승","김여름"};
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(member));
		System.out.println(a1.size()); //배열 갯수
		a1.add("심규환");
		a1.add(0,"이하늘"); //데이터 노드번호를 지정해서 값을 넣을수 있음
		System.out.println(a1); //추가된 배열 확인 [박소은, 윤준승, 김여름, 심규환]
		String user = a1.get(3); //심규환
		System.out.println(user); // 심규환 추가 확인 
		a1.remove(3); //3번 노드 삭제 (심규환삭제)
		System.out.println(a1); // 출력 정보  [박소은, 윤준승, 김여름]
	}
}

