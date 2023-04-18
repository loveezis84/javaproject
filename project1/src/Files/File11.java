
package Files;

import java.io.OutputStream;

//OutputStream : 출력담당
//하위 - FileOutputStream, ObjectOutputStream, AudioOutputStream
public class File11 {

	public static void main(String[] args) {
		
		try {
			load l = new load();
			l.output();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class load{
	OutputStream os; //Output자체가 sysout을 사용안함
	
	public void output() throws Exception {
		String data = "abcde";
		//byte[] : 문자열을 아스키 형태의 배열로 변경하는것을 말한다.
		//getBytes() : 언어패키지 즉,문자를 숫자형태로 변환
		byte[] b = data.getBytes(); 
//		System.out.println(Arrays.toString(b));  //출력 결과 - [97, 98, 99, 100, 101]
		this.os = System.out;
		// byte 단위의 배열값을 역으로 해석해서 문자화 시킴
		this.os.write(b,0,b.length); //write(배열변수,시작값,종료값) 
		this.os.flush(); //flush : 메모리를 깨끗하게 비워줌  
		this.os.close();
		
	}
}