package java1;

import java.text.SimpleDateFormat;
import java.util.*; //모든 Java.util에 있는 클레스를 로드함

public class index13 {
	//Java : OOP (객체지향 언어)
	//Javascript : OOP Scripting 언어
	public static void main(String[] args) {
		//날짜 출력 형태
		Date today = new Date();
//		Scanner sc = new Scanner(System.in);
		System.out.println(today);
		
		//y : 년도, m : 월 , d : 일 (대문자M(양력) , 소문자M(음력)) 다름
		SimpleDateFormat date = new SimpleDateFormat("yyyy년M월d일");
		//h: 시간 , m: 분,  s:초, 소문자 h:am,pm,별도구성(hh,HH와같은형태로 형태를 바꿀수있음)
		SimpleDateFormat time = new SimpleDateFormat("h시mm분s초");
		
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy-mm--dd h:mm:s");
		//a : 오전 , p : 오후 표시 (일반적으로 잘 사용하지않음)
		SimpleDateFormat date2 = new SimpleDateFormat("a HH:mm:ss");
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		System.out.println(datetime.format(today));
		System.out.println(date2.format(today));
	}
}
