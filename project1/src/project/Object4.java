package project;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//배열 데이터 url :http://mekeyace.dothome.co.kr/product_db.txt
/*
 응용문제2
 해당 상품 리스트가 있습니다.
 첫번째 값은 상품코드
 두번째 값은 상품명
 세번째 값은 상품가격 입니다. 
 
 사용자가 상품을 선택합니다. 선택한 상품은 장바구니 배열로 추가 되어야
 하며 사용자가 선택한 상품 총 금액을 출력하시면 됩니다.
 단, 상품을 중복 입력할 수 있으며, 장바구니는 최대 6개까지 담을 수 있습니다.
 */
public class Object4 {

	public static void main(String[] args) {
		menulist1 mu = new menulist1();
		mu.usermenu();	
	}
}
class menulist1{
	
	ArrayList<Object[]> menuli;
	Scanner sc;
	Object[][] data;
	public void usermenu() {
		this.data = new Object[][]{
			{1,"니베아 데오드란트",35000},
			{2,"파스퇴르 바른목장",17000},
			{3,"해남 꿀고구마",15300},
			{4,"프리미엄 생 칵테일 새우",22370},
			{5,"쉬슬러 고농축 액체세제",16620},
			{6,"믹시 삐비 미니캐리어",99500}
			};
			
		System.out.println("상품을 선택해주세요");
		System.out.printf("1.%s,2.%s,3.%s,4.%s,5.%s,6.%s\n",
				this.data[0][1],this.data[1][1],this.data[2][1],this.data[3][1],this.data[4][1],this.data[5][1]);

		menuli = new ArrayList<>(Arrays.asList(data));
		ArrayList<String> usermenu = new ArrayList<>();

		Integer number = 0;
		int w = 0;
		Integer sum = 0;
		while(w < menuli.size()) {
				
			sc = new Scanner(System.in);
			try {
				number = sc.nextInt();
				if(number > 7 || number == 0) {
					System.out.println("해당하는 상품이 업습니다");
					System.out.println("상품을 추가하시겠습니까");
					number = sc.nextInt();
					usermenu.add((String) menuli.get(w)[1]+" "+menuli.get(w)[2]+"원");
					System.out.println(usermenu);	
				}
				else if(menuli.get(w)[0].equals(number)) {
				
				usermenu.add((String) menuli.get(w)[1]+" "+menuli.get(w)[2]+"원");
				sum += (int)menuli.get(w)[2];
				System.out.println("상품을 추가하시겠습니까");
				System.out.println(usermenu);
				
			} 	
			}
			catch (InputMismatchException e) {
			
				System.out.println("해당되는 번호만 입력해주세요");
				continue;
			}
			w++;
		}
		DecimalFormat sumFormat = new  DecimalFormat();
		System.out.printf("선택하신 상품의 총 금액은: %s원 입니다",sumFormat.format(sum));
		
	}	
}
