package Files;

import java.io.FileReader;
import java.nio.charset.Charset;

public class File2 {

	public static void main(String[] args){
		try {
		FileReader fr = new FileReader(
				"E:\\git_java\\javaproject\\project1\\src\\Files\\agree.txt",Charset.forName("UTF8"));
		//문서파일이 ANCI로 저장되어있을경우 문서 뒤에 명령어 Charset.forName("EUCKR") 입력 
		//단, 출력하는 형태 언어셋만 바꾸는 명령어이고, 파일자체를 바꾸는건 불가능(직접바꿔야함)
		System.out.println(fr.getEncoding()); //파일 인코딩 언어 확인 -UTF-8-
		System.out.println(fr.read()); //데이터 크기
		System.out.println(fr.ready());

		while(true) {
			int a = fr.read();
			System.out.println((char)a);
			if(a == -1) {
				break;
			}
			
		}
		fr.close(); //로드한 파일을 닫을 때 사용
		
		} catch (Exception e) {
			System.out.println("파일의 경로가 틀립니다");
		}

	}

}
