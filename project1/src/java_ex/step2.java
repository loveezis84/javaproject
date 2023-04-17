package java_ex;

import java.util.Scanner;


public class step2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를2개 입력해주세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		total tl = new total();
		System.out.printf("합한결과는: %d, 곱한결과는 %d",tl.add(a, b),tl.multiple(a, b));
	}
}
class total{

	public int add(int a,int b) {
		int sum = a + b;
		return sum;
	}
	public int multiple(int a,int b) {
		int sum2 = a * b;
		return sum2;
	}	
}