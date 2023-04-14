package java3;

import java.text.DecimalFormat;
import java.util.Scanner;

//user1.java / user2.java 연계응용편(interface)
public class Interface2 {

	public static void main(String[] args) {
		userinfo3 userif = new userinfo3();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력하세요");
		String id = sc.next();
		userif.myinfo(id);
		sc.close();

	}
}
class userinfo3 implements user2,user1{
	
	private int total;
	boolean found = false;
	
	@Override //사용안함
	public void mytel(String usertel) {
		
	}
	@Override
	public int dataea() { //갯수체크

		return user1.super.dataea();
	}
	
	@Override
	public void myinfo(String userid) {
		this.total = dataea();
//		System.out.println(total);
		int w = 0;
		int point = 0;
		try {
			System.out.println("잠시만 기다려 주시길 바랍니다(조회중...)");
			Thread.sleep(500);
			//약 5초정도 딜레이를 가진 후에 동작함 (집계)
		}
		catch (Exception e) {
				
		}
		while(w < this.total) {
			if(userid.equals(user2.infodata[w][0])) {
				found = true;
				//문자를 숫자로 변환
				point = Integer.valueOf(user2.infodata[w][4]);
			}
			w++;
		}
		if(found == false) {
			System.out.println("등록된 회원이 아닙니다");
		}
		else {
			DecimalFormat df = new DecimalFormat("###,###");
			//숫자 자료형에 자동으로 콤마 기능을 적용함 (1천단위로 끊어서 적용됨)
			System.out.printf("%s님의 포인트는:%s점입니다",userid,df.format(point));
		}
	}
	@Override
	public String pointck(String userid) {
	
		return null;
	}
}
