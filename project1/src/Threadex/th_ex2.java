package Threadex;

public class th_ex2 {

	public static void main(String[] args) {
	/*
	응용문제1. 멀티 쓰레드를 이용하여 각각의 구구단을 출력하는 프로세서를
	제작하시오.
	첫번째 쓰레드에는 구구단 5단, 두번째 쓰레드에는 구구단 9단 
	 */
		gugu5 gu5 = new gugu5();
		Thread tr = new Thread(gu5);
		tr.start();
		
		gugu9 gu9 = new gugu9();
		Thread tr2 = new Thread(gu9);
		tr2.start();

	}
}
class gugu5 implements Runnable{
 	int five = 1;
 	int sum = 0;
	@Override
	public void run() {
	
	while(five < 10) {
		
		sum = 5 * five;
		System.out.printf("%d * %d = %d\n",5,five,sum);
		five++;
		}
	}
}
class gugu9 implements Runnable{
	int nine = 1;
	int sum2 = 0;
	@Override
	public void run() {
	
		while(nine < 10) {
			
			sum2 = 9 * nine;
			System.out.printf("%d * %d = %d\n",9,nine,sum2);
			nine++;
		}
		
	}
}

