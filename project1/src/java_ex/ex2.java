package java_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ex2 {

	public static void main(String[] args) {
		/*
		 * 한국방송공사 - 코드 테스트
		 * 
		 * 응용문제2 해당 상품 리스트가 있습니다. 첫번째 값은 상품코드 두번째 값은 상품명 세번째 값은 상품가격 입니다.
		 * 
		 * 사용자가 상품을 선택합니다. 선택한 상품은 장바구니 배열로 추가 되어야 하며 사용자가 선택한 상품 총 금액을 출력하시면 됩니다. 단,
		 * 상품을 중복 입력할 수 있으며, 장바구니는 최대 6개까지 담을 수 있습니다. "종료" 라고 입력시 장바구니 입력은 더 이상 실행 되지
		 * 않습니다.
		 * 
		 * 출력예시) 총 상품은 4개 이며, 총 금액은 139,000 원 입니다.
		 */
		abc tt = new abc();
		tt.select();
	}
}
class abc {
	Scanner sc;
	Object[][] data = {
			{1,"니베아 데오드란트",35000},
			{2,"파스퇴르 바른목장",17000},
			{3,"해남 꿀고구마",15300},
			{4,"프리미엄 생 칵테일 새우",22370},
			{5,"쉬슬러 고농축 액체세제",16620},
			{6,"믹시 삐삐 미니캐리어",99500}
		}; 
	ArrayList<Object[]> list = new ArrayList<>(Arrays.asList(data));
	ArrayList<Object> list2 = new ArrayList<>(); 
	
	public void select() {
		int sum = 0;
		while(true) {
			sc = new Scanner(System.in);
			System.out.println("상품을 선택해주세요");
			System.out.printf("1.%s,2.%s,3.%s,4.%s,5.%s,6.%s",
					list.get(0)[1],list.get(1)[1],list.get(2)[1],list.get(3)[1],list.get(4)[1],list.get(5)[1]);
			
			try {
			Object number = sc.nextInt();
			if(list2.size() >= 6) {
				System.out.println("더이상 추가할 수 없습니다.");
				break;
			}
			   boolean found = false; // 상품이 이미 추가되었는지 확인하기 위한 변수
		        for (Object[] item : list) {
		            if (number.equals(item[0])) {
		                // 선택된 번호와 일치하는 상품을 찾으면
		                list2.add(item[1]);
		                sum += (Integer) item[2];
		                found = true;
		                System.out.println(list2+"\n"+sum+"원");
		                break;
		         }
		     }
		     if(!found) {
		    	 System.out.println("일치하는 상품이 없습니다. 다시 선택해주세요");
		     }
			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다.");
			}
		}
		System.out.printf("총상품은: %s개이며\n총금액은: %d원입니다",list2.size(),sum);
	}
}
