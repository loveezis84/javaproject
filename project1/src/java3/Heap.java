package java3;

public class Heap {

	//메모리 : Stack, Heap
	//Stack : cpu 캐시 메모리
	//Heap : 실제 메모리 (메모리 제한이 없음)
	static int box2 = 20;
	public static void main(String[] args) {
		
		int box1 = 20; // Stack        메모리 : 20
		Integer box3 = 20; // Stack     메모리  0 x 002
		Integer box4 = new Integer(20); //Heap 영역    메모리 20 (0x0002)둘다 사용가능
		Integer box5 = 20;
		if(box1 == box3) {
//			System.out.println("동일함");
		
		}
		if(box3 == box4) {
			System.out.println("동일함");
		}
		if(box3.equals(box4)) {
			System.out.println("동일함2");
		}
		if(box1 == box4) {
			System.out.println("동일함3");
		}
		if(box3.equals(box5)) {
			System.out.println("동일함4");
		}
	}
}
