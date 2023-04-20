package Network;

public class Thread4 {
	static int money = 50000; //통장잔고
	
	
	public static void main(String[] args) {
		Runnable ra2 = new outmoney();
		Thread th2 = new Thread(ra2);
		th2.start();
		
		Runnable ra = new inmoney();
		Thread th = new Thread(ra);
		th.start();
	}
}
class outmoney implements Runnable{  //출금
	public void run() {
		int out[] = {15000,25000,16000};
		int w = 0;
		do {
			Thread4.money = Thread4.money - out[w];
			System.out.println("현재 잔고금액은 " + Thread4.money + "원");
			
			w++;
		}while(w < out.length);
	}
}
class inmoney implements Runnable{ // 입금처리용
	@Override
	public void run() {
	
		int plusmoney = 30000;
		Thread4.money = Thread4.money + plusmoney;
		System.out.println("현재 잔고금액은 " + Thread4.money + "원");
	}
}
