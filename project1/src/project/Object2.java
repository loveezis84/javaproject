package project;

import java.util.ArrayList;
import java.util.Arrays;

public class Object2 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("hong");
		al.add(25);
		al.add("hong@nate.com");
		al.add(6000);
		al.add("01023451235");
		System.out.println(al);
		
		
		//2차 원시 배열 Object (문자,숫자)
		Object data[][] = {
				{"hong","kim","park","jang"},
				{25,30,44,21}
		};
		//Object 자료형 선언시 원시 배열도 만들수 있음
		System.out.println(Arrays.toString(data[1]));
		
		//복합적 Object 배열
		
		Object userinfo[] = {"hong",25,"서울","01023458777",5000};
			
		
	}

}
