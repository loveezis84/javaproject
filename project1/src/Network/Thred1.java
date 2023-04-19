package Network;

public class Thred1 {

	public static void main(String[] args) {
		int w = 0;
		while(w < 6) {
			box b = new box(w);
			//멀티 쓰레드 구성 형태이며 , 해당 값을 원하는 작업 공간에 적용
			Thread t = new Thread(b);
			t.start();
			//run 메소드를 실행하는 명령
			w++;
		}
	}
}
class box extends Thread{
	int no;
	
	public box(int a) { //setter
		this.no = a;
	}
	
	
	@Override
	public void run() {
		
		super.run();
		System.out.println(this.no);
	}
}
