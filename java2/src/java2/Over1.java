package java2;
//사용자 정보 리스트
public class Over1 {
//over2 메인에 연결
	//오버라이드를 할 경우 필드에 변수를 세팅해야함.
//	String[][] list = {
//			{"홍길동","hong","서울","hong@nate.com","SKT"},
//			{"이순신","lee","인천","lee@nate.com","KT"},
//			{"강감찬","kang","제주","kang@naver.com","KT"},
//			{"장보고","jang","강원","jang@gmail.com","LGT"}
//	};
	String list[][];
	public String se;
	int money;
	public void userlist(String username) {
//		this.se = username;
//		int money = 10000;
		this.list = new String[][] {
			{"홍길동","hong","서울","hong@nate.com","SKT"},
			{"이순신","lee","인천","lee@nate.com","KT"},
			{"강감찬","kang","제주","kang@naver.com","KT"},
			{"장보고","jang","강원","jang@gmail.com","LGT"}
		};

	}
}
