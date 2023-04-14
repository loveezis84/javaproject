package java1;

import java.util.Scanner;

public class Array6 {
	//배열 + 키오스크 응용편
	public static void main(String[] args) {
		/*
		응용문제5  
		"주문하고자 하는 음식을 선택해주세요"
		사용자가 원하는 음식을 선택합니다.
		선택된 음식 리스트를 출력하십시오.
		단,주문 종료를 선택했을경우 주문한 음식 리스트가 나와야합니다.
		예)햄버거 , 피자 , 치킨 , 라면 , 김밥 , 커피
		
		출력예시)
		1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문종료
		"주문하고자 하는 음식을 선택해주세요 "
		[치킨,라면,햄버거]
 		*/
		String menu[] = {"햄버거","피자","치킨","라면","김밥","커피","주문종료"};
		int ea = menu.length; //7개	
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하고자 하는 음식을 선택해주세요");
		
		int w = 1;
		while(w < ea) {
			System.out.println("1.햄버거,2.피자,3.치킨,4.라면,5.김밥,6.커피,7.주문종료");
			int select = sc.nextInt();
			String menulist[] = new String[ea];
			if(select == 7) { //사용자가 숫자명을 입력하면 강제종료
				System.out.println("종료");
				break; //반복문 강제종료
			}
			else if(select == w) {
				menulist[w] = menu[w];
				System.out.println(menulist);
			}
			w++;
		}
	}
}
