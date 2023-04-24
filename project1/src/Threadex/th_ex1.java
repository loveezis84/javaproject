package Threadex;

public class th_ex1 {

	public static void main(String[] args) {

		box b = new box();
		box2 b2 = new box2();
		b.start();
		b2.start();
	}
}
class box extends Thread{
	
	@Override
	public void run() {
		int w = 0;
		while(w < 10) {
			System.out.println(w);
		w++;	
		}		
	}
}
class box2 extends Thread{
	
	@Override
	public void run() {
		int z = 0;
		while(z < 10) {
			System.out.println(z);
			z++;
		}
	}
}
