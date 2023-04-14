package java2;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Over3 {
	/*
	 메인 실행 class : over1 , Method : userlist(String)
	 응용문제4. 각 통신사별 인원수 현황을 출력하는
	 프로세서를 개발하시오. 
	 예시)
	 SKT : 1명 , KT: 2명 , LGT : 1명
	 */
	public static void main(String[] args) {
		user ur = new user();
		ur.userlist("");

	}
}
class user extends Over1{
	@Override
	public void userlist(String username) {
		super.userlist("");
		int w = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		while(w < list.length) {
			
			if(list[w][4].equals("SKT")) {
				count1++;
			}
			else if(list[w][4].equals("KT")) {
				count2++;
			}
			else if(list[w][4].equals("LGT")) {
				count3++;
			}
			w++;
		}	
		System.out.printf("SKT:%d명,KT:%d명,LG:%d명",count1,count2,count3);
		
	}
}
