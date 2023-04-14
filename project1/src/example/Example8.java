package example;

import java.util.Arrays;

public class Example8 {
	//2차 배열[][] 대괄호 2개들어감
	String menu[][] = {
			{"로켓배송","로켓프레쉬","쿠팡비즈","골드박스","이벤트","설날","크리스마스"},
			{"Y","Y","Y","Y","Y","N","N"},
	
	};
	public static void main(String[] args) {
		
		Example8 ex = new Example8();
		ex.result();
	}
	public void result() {
		
		int ea = this.menu[0].length; //그냥 ea는 2개
//		System.out.println(ea); //7개
		System.out.println(Arrays.toString(menu[0]));
		int w = 0;
		while(w < ea) {
			
			if(this.menu[1][w].equals("Y")) {
				System.out.println(menu[0][w]);
			}
			w++;
		}
	}
}
