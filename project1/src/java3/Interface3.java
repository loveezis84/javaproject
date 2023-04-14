package java3;

import java.util.Arrays;

public class Interface3 {
	/*
	 * user1.java / user2.java 응용편
	 * 응용문제2 가입된 모든 사용자의 정보를 출력합니다. 출력 형태는 다음과 같습니다. 
	 * 아이디: hong, 고객명: 홍길동,
	 * 이메일:hong@nate.com, 지역:서울시 영등포구
	 */
	
	public static void main(String[] args) {
	
		getuser b = new getuser();
		String[][] userdata = user1.userdata; //user1 데이터 로드
		String[][] infodata = user2.infodata; //user2 데이터 로드
		b.myinfo("");
		

	}
}
class getuser implements user1,user2{
	
	@Override
	public void myinfo(String userid) {
		
		int w = 0;
		
		while(w < userdata.length) {
				
			System.out.printf("아이디:%s 이름:%s 이메일:%s 지역:%s \n",
			userdata[w][0],userdata[w][1],userdata[w][2],infodata[w][2]);			

			w++;
		}
	}
	@Override
	public void mytel(String usertel) {
	
	}
	@Override
	public String pointck(String userid) {

		return null;
	}
	
}
