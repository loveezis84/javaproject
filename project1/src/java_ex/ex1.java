package java_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		/*
		 (주)CJ운송에서 테스크 코딩
		 사용자가 8명 있습니다
		 각각의 사용자에게 포인트를 주어야 합니다. 다음 결과와 같이 나오도록
		 코드를 작성하시오. 
		 customer data : 서울 경기도 인천 대전 충북 충남 전북 전남
		 
		 "서울 님에게 포인트 추가 하시겠습니까?" 
		 ...
		 "전남 님에게 포인트 추가 하시겠습니까?"
		 무조건 숫자를 입력하며 숫자 외에 입력시 "포인트는 숫자만 입력합니다." 출력
		 단, 인천님 포인트 입력시 문자를 사용하여 오류 발생이 되면 다시
		 "인천 님에게 포인트 추가 하시겠습니까?" 라고 질문이 나와야 합니다.
		 최종결과 정보
		 서울 : 500
		 경기도 : 300
		 인천 : 300
		 ...
		 */
		box b = new box();
		b.sector();
	}
}
class box{
	Scanner sc;
	String[] data = {"서울","경기도","인천","대전","충북","충남","전북","전남"};
	ArrayList<String> user = new ArrayList<>();
	int point = 0;
	public void sector(){
		int count = 0;
		while(true) {
			sc = new Scanner(System.in);
			try {
				if(count == 8) {
					break;
				}
				System.out.println(data[count]+"님에게 포인트를 추가 하시겠습니까?");
				this.point = sc.nextInt();
				user.add(data[count]+":"+point);
				count++;
				
			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다.");
			}
		}	
		for(String a : user) {
			System.out.println(a);
		}
//		user.clear(); //배열 값 초기화
		
	}
}










