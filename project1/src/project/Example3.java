package project;

import java.util.ArrayList;
import java.util.Scanner;

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
public class Example3 {
	public static void main(String[] args) {
	
		point p = new point();
		p.totalpoint();
	}
}
class point {
	Scanner sc;
	String[] data = {"서울","경기도","인천","대전","충북","충남","전북","전남"};
	public void totalpoint() {
		int userPoint;
		int count = 0;
		ArrayList<Object> userp = new ArrayList<>();
		while(true) {
			sc = new Scanner(System.in);
			try {
	
			if(count == 8) {
				break;
			}
			else {
				System.out.println(data[count]+"님에게 포인트를 추가 하시겠습니까?");
				userPoint = sc.nextInt();
				userp.add(data[count]+" : "+userPoint);
				count++;
			}
			}
			catch (Exception e) {
				System.out.println("한글만 입력 가능합니다");
				continue;
			}
		}
		for(Object a : userp) {
		System.out.println(a);		
		}
//		System.out.println(userp);
	}
}













