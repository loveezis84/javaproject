package Network;

public class Thread2 {

	public static void main(String[] args) {
		
		String user1[] = {"hong","park","kim","jang","han"};
		String user2[] = {"lee","yun","hwang","jo","ko"};
		
		listprint lp = new listprint();
		int w = 0;
		while(w < user1.length) {
			
			String result = lp.view(user1[w]);
//			System.out.println(result);
			w++; 
		}
		int w2 = 0;
		while(w2 < user1.length) {
			
			String result2 = lp.view(user2[w2]);
//			System.out.println(result2);
			w2++;
		}	
		//멀티 Thread 반복문-------------------------------//
		int z = 0;
		listprint2 lp2;
		listprint2 lp3;
		Thread th2;
		Thread th3;
		do {
			lp2 = new listprint2(user1[z]); //객체 생성 후 메소드로 전달
			lp3 = new listprint2(user2[z]);
			th2 = new Thread(lp2);  //Thread를 이용하여 해당 데이타 처리
			th3 = new Thread(lp3); 
//			th2.start(); //각각의 Thread가 작동되도록 함
//			th3.start();
			z++;
		}while(z < user1.length);	
		
		
		Thread tt1 = null;
		Thread tt2 = null;
		Thread tt3 = null;
		Thread tt4 = null;
		
		try {
			
		int k = 0;
		while(k < user1.length) {
			lp2 = new listprint2(user1[k]);
			tt1 = new Thread(lp2);
			tt2 = new Thread(lp2);
			tt3 = new Thread(lp2);
			tt4 = new Thread(lp2);
			tt1.start();  //멀티 쓰레드로 작업 시작
			tt1.join();  //작업 종료와 관계없이 순차적으로 결과가 출력되도록 조정
//			tt2.start();
//			tt3.start();
			tt4.start();
			tt4.join();
			k++;
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
//단일 Thread
class listprint{

	public String view(String data) {
		
		return data;
	}
}
//멀티 Thread 
class listprint2 extends Thread{
	
	String usernm = "";
	public listprint2(String a) {
		this.usernm = a;
		
	}
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(this.usernm);
	
	}
}
//멀티 Thread 사용법2
class listprint3 implements Runnable{
	
	@Override
	public void run() {
	
		
	}
	
}