package Files;

import java.io.FileReader;

public class File1 {
	//I/O : InputStream, OutputStream 
	
	/*
	 입력 스트림 : 프로그램으로 들어오는 부분(키보드,마우스,HDD) 
	 출력 스트림 : 프로그램으로 나가는 부분(모니터,HDD,프린터)
	 Stream : API 라이브러리를 사용하는 형태
	 JAVA.io(API)
	 (일반 : File,FileReader) -> StreamAPI (FileinputStream)
	 (일반 : FileWriter) -> StreamAPI(FileoutputStream)
	 */
	
	/*
	 FileReader : 문자 데이터를 파일로부터 읽어오는 클레스 (라이브러리)
	 -파일 이름을 생성자 인수값(파라미터)로 사용해서 FileReader 객체를 생성합니다. 
	 
	  I/O는 throws IOException 을 사용하거나 / try/catch를 사용해야만 적용 할 수있다. 
	 */
	public static void main(String[] args){
		
		try {
		
		FileReader fr = new FileReader("E:\\git_java\\javaproject\\project1\\src\\Files\\message.txt");
		while(true) {
			int m = fr.read();
			System.out.println((char)m);
			if(m == -1) {
				break;
			}
			fr.close();
		}
		} catch (Exception e) {
			if(e.getMessage() != null) {
				System.out.println("error 발생");
			}
		}
		
	}
}
