package java_ex;

import java.util.ArrayList;

public class lottoNum {

	public static void main(String[] args) {
		bbbb b = new bbbb();
		b.lucky();

	}
}
class bbbb {
	ArrayList<Integer> Num2 = new ArrayList<>();
	int lottoBall;
	int bonusBall;
	public void lucky() {

		while(Num2.size() < 7) {
			lottoBall = (int)Math.ceil(Math.random()*46);
			
			if(!Num2.contains(lottoBall)) {
				Num2.add(lottoBall);
				
			}
		}	
		System.out.printf("이번주 추첨번호 \n%s",Num2);
	}
}