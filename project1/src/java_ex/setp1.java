package java_ex;

import java.util.Scanner;

public class setp1 {
	public static void main(String[] args) {

	  result re = new result();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("숫자의 범위를 지정해주세요");
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  re.abc(a,b);
	}
}
class result{
	
	public void abc(int a,int b) {
		while(a <= b) {
			try {
			Thread.sleep(1000);
			System.out.println(a);
			
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요");
			}
			a++;
		}
	}
}


