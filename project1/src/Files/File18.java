package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Stream을 사용하고 나서 Buffered 사용

//Buffered : read, write 단독으로 사용은 하지 않음

//read : int형태, readLine : String형태

/*
 InputStream > InputStreamReader > BufferedReader ( o )
 동일한 타입의 버퍼를 적용시켜서 사용한다.
 
 * BufferedReader - close() 종료를 꼭 해줘야한다.
 * BufferedWriter - flush() 메모리 초기화 + close() 메모리 종료
 */

public class File18 {

	public static void main(String[] args) throws Exception {
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter buff = new BufferedWriter(os);
		
		buff.write("홍길동");
		buff.flush();
		buff.close();
		os.close();
		
		// 윗부분 주석처리하고 실행하면 아래 코드 제대로 동작함
		
		
		InputStreamReader ips = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ips);
		
		String test = br.readLine();
		System.out.println(test);
		ips.close();
		br.close();
		
		/*
		 FileInputStream => BufferedInputStream 
		 FileOutputStream = > BufferedOutputStream
		 */
		

		
	}
}
