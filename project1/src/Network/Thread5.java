package Network;

public class Thread5 {

	public static void main(String[] args) {
		
		/*
		 응용문제1. 멀티 쓰레드를 이용하여 각각의 구구단을 출력하는 프로세서를
		 제작하시오.
		 첫번째 쓰레드에는 구구단 5단, 두번째 쓰레드에는 구구단 9단 
		*/
		Thread t = new gugu1();
		t.start();
		
		Thread r = new gugu2();
//		Thread t2 = new Thread(r);
		r.start();
		

	}
}
class gugu1 extends Thread{
	
	@Override
	public void run() {
		int num = 1;
		int sum = 0;
		while(num < 10) {
			
			sum = 5 * num;
			System.out.printf("%d * %d = %d\n",5,num,sum);
			num++;
		}
	}
}
class gugu2 extends Thread{
	
	@Override
	public void run() {
		int num2 = 1;
		int sum2 = 0;
		while(num2 < 10) {
			
			sum2 = 9 * num2;
			System.out.printf("%d * %d = %d\n",9,num2,sum2);
			num2++;
		}
	}
}
//class gugu2 implements Runnable{
//	
//	@Override
//	public void run() {
//		int num2 = 1;
//		int sum2 = 0;
//		while(num2 < 10) {
//			
//			sum2 = 9 * num2;
//			System.out.printf("%d * %d = %d\n",9,num2,sum2);
//			num2++;
//		}
//	}
//}