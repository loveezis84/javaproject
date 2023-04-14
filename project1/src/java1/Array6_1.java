package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array6_1 {

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
		String[] menu = {"햄버거","피자","치킨","라면","김밥","커피","주문종료"};
		int ea = menu.length; //7개	
		String[] mymenu = new String[ea]; //사용자가 선택한 값을 입력시키기 위한 빈 배열
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("1.%s,2.%s,3.%s,4.%s,5.%s,6.%s,7.%s",menu[0],menu[1],menu[2],menu[3],menu[4],menu[5],menu[6]);
		
		int count=0; //배열번호형태
		for (String f : menu) {
			System.out.println("\n메뉴를 선택해주세요 :");
			String s = sc.next();
			
			if(s.equals("7")) {
				System.out.println("주문종료");
				break;
			}
			else {
				//Integer.parseInt : 문자를 숫자로 변경
				int my = Integer.parseInt(s)-1;
				mymenu[count] = menu[my];
				 System.out.printf("%d.%s 선택하셨습니다.\n", my+1, menu[my]);
				count++;
			}
		}
		System.out.println(Arrays.toString(mymenu));
		sc.close();
	}
}
