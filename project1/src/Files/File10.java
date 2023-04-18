package Files;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File10 {
	//Stream 사용법
	//Stream : 이미지.동영상,오디오 같은 파일을 로드하기 위해서 사용
	/*
	  InputStream : 모든 입력장치에 대한 값을 받는 클레스, 기본은(int)
	  -FilseInputStream, AudioInputStream, ObjectInputStream
	  -InputStreamReader : 언어셋을 변경할 때만 사용합니다.
	 */
	//OutputStream : 모든 출력 장치에 대한 클레스
	
	public static void main(String[] args) {
		InputStream is = new InputStream() { 
			//사용시 오버라이드 메소드가 기본 default값으로 적용됨
			//read외는 별도로 메소드 추가사용이 안됨
			@Override
			public int read() throws IOException {
				int a = 15;
				
				return a;
			}
		}; 
		try {
			//read() 메소드를 호출하여 값을 리턴받음
			System.out.println(is.read());
			is.close();
		} catch (Exception e) {
			
		}
		//InputStreamReader(파일 언어셋 변경하기 위해서) - > FileInputStream 
		InputStreamReader ir = new InputStreamReader(is);
		
		try {
			System.out.println(ir.read());
			ir.close();
		} catch (Exception e) {
			
		}
		
		//키보드 입력
		InputStream user = System.in;
		try {
			int keycode = user.read();
			System.out.println(keycode);
		} catch (Exception e) {
			
		}
		
	}
}
