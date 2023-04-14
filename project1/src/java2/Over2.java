package java2;

import java.util.Arrays;
import java.util.Scanner;

public class Over2 {
//메인 실행 class : over1 , Method : userlist(String)
	public static void main(String[] args) {
		myinfo my = new myinfo();
		System.out.println("사용자 이름검색");
		Scanner sc = new Scanner(System.in);
		String nm = sc.next();
		my.userlist(nm);
	}
}
class myinfo extends Over1{
	int money2; //추가변수 (오버로딩)
	int ea;
	@Override
	public void userlist(String username) {
		super.userlist(username);
		this.ea = this.list.length;
		int w = 0;
		boolean found = false;
		while(w < this.ea) {
			if(this.list[w][0].equals(username)) {
				System.out.println(Arrays.toString(this.list[w]));
				found = true;
			}	
			w++;
		}
	}
	
}
