package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//배열 데이터 url : http://mekeyace.dothome.co.kr/product_db.txt
/*
  한국방송공사 - 코드 테스트
  
  응용문제2
  해당 상품 리스트가 있습니다.
  첫번째 값은 상품코드
  두번째 값은 상품명
  세번째 값은 상품가격 입니다.
  
  사용자가 상품을 선택합니다. 선택한 상품은 장바구니 배열로 추가 되어야
  하며 사용자가 선택한 상품 총 금액을 출력하시면 됩니다.
  단, 상품을 중복 입력할 수 있으며, 장바구니는 최대 6개까지 담을 수 있습니다.
  "종료" 라고 입력시 장바구니 입력은 더 이상 실행 되지 않습니다.
      
  출력예시)
  총 상품은 4개 이며, 총 금액은 139,000 원 입니다.
*/
public class Object4_1 {
	public static void main(String[] args) {
		ob_array ob = new ob_array();
		ob.database(); //데이터 입력 받을 setter 메소드 호출
		ob.baskets(); //장바구니 함수 실행
	}
}
class ob_array{
	Object product[][];	//원시배열 선언
	ArrayList<Object[]> al;	//원시배열을 ArrayList로 변환
	ArrayList<Object[]> basket = new ArrayList<>();	//장바구니 배열 값
	int ea = 0;	//배열 총 갯수값
	int count = 0;	//장바구니 카운터 값
	//setter 메소드 생성
	public void database() {
		//원시배열에 제공된 데이터 배열 추가
		this.product = new Object[][]{
			{1,"니베아 데오드란트",35000},
			{2,"파스퇴르 바른목장",17000},
			{3,"해남 꿀고구마",15300},
			{4,"프리미엄 생 칵테일 새우",22370},
			{5,"쉬슬러 고농축 액체세제",16620},
			{6,"믹시 삐삐 미니캐리어",99500}
		}; 
		//원시 데이터를 ArrayList 로 변환함
		this.al = new ArrayList<>(Arrays.asList(this.product));
		this.ea = this.al.size();	//배열 그룹 갯수 확인		
	}
	//배열에 메뉴를 보여줄 getter 생성 (사용자가 메뉴를 볼 수 있도록 함)
	public String[] menus() {
		int w=0;
		String menu[] = new String[ea]; //원시배열 형태로 구성
		while(w < ea) {
			menu[w] = w+1 + "." + this.al.get(w)[1];
			w++;
		}
		return menu;
	}
	
	//메뉴 출력 및 사용자가 상품 선택 후 장바구니 담기는 메소드
	public void baskets() {
		//사용자가 입력할 수 있도록 라이브러리 적용
		Scanner sc = new Scanner(System.in);
				
		try {
		//전체 메뉴 먼저 가져옴
		while(true) {	//무한 반복문으로 회전
		String menu[] = menus();
		System.out.println(Arrays.toString(menu));
		System.out.println("메뉴를 선택해 주세요?");
		Object select = sc.nextInt();	//사용자가 입력한 값
			if((int)select < 7) {	//7미만의 메뉴 번호를 입력할때 
				this.count++;	//메뉴를 하나씩 선택할 때 마다 +1씩 증가
				if(this.count >= 6) {	//메뉴 6개를 다 고를 경우
					break;
				}
				else {
				int ww=0;
					while(ww < this.ea) {
						if((int)select == (int)al.get(ww)[0]) {
						this.basket.add(al.get(ww));
						}
					ww++;
					}
				}
			}
			else {	//7이상 숫자를 입력할 경우 
			System.out.println("해당 메뉴 번호가 잘못 되었습니다.");
			continue;	
			}
		}
		//메뉴 6개를 모두 골랐을 경우 출력 되는 부분
		int f=0;
		while(f < this.basket.size()) {
			//장바구니에 담겨 있는 모든 상품을 출력
			System.out.println(Arrays.toString(this.basket.get(f)));
			f++;
		}
	
		}
		catch(Exception e) {
		System.out.println("총 상품은 개 이며, 총 금액은 원 입니다.");
		}
		
	}
	
}