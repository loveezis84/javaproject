package example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner; //라이브러리를 호출함 
//라이브러리란? 소프트웨어 개발시 부가적인 옵션의 집합를 의미한다.
//ctrl + shift + o 누르면 안쓰는 라이브러리 삭제 단축키

public class Example4 {

	Scanner sc = new Scanner(System.in);
	Date today = new Date();
	//개발자가 원하는 방식으로 날짜, 시간, 주일을 변경
	//y:년도 m:월 d:일
	//H:시간(h시간 : 1~12까지) m:분 , s:초
	SimpleDateFormat sd = new SimpleDateFormat("yyyy년.MM월.dd일");
	SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

	public static void main(String[] args) {
	Example4 ex = new Example4();
	ex.print();

	}

	public void print() {
		System.out.println(this.today);
		System.out.println(sd.format(today));
		System.out.println(this.time.format(this.today));

	}

}
