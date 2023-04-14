package java2;

public class Sleep {
	// 시간 타이머
	public static void main(String[] args) {
		//Thread 란? 프로세서가 실질적으로 작업하는 단위를 말함
		try {
		int w = 0;
		
		while(w < 101) {
			
			Thread.sleep(1000);
			System.out.println(w);
			
			w++;
		}	
		}
		catch (Exception e) {
	
		}
	}

}
