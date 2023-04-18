package Files;

import java.io.FileInputStream;
import java.io.InputStream;


public class File12 {

	// Stream을 이용한 파일로드
	public static void main(String[] args) {
		FileIn fl = new FileIn();
		try {
			fl.fileload();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class FileIn {
	InputStream is;

	public void fileload() throws Exception {
		this.is = new FileInputStream("E:\\git_java\\javaproject\\project1\\src\\Files\\Notice.txt");
//		System.out.println(is.available());
		//available() : 파일의 용량 크기 체크 (byte 단위로만출력)
	
		byte temp[] = new byte[is.available()]; 
		//byte 배열 값을 해당 파일 로드한 크기와 동일하게 생성하라는 뜻 length만큼 과같은느낌으로 사용
		
//		byte temp[] = new byte[1024*16];  // 16384kb이상 업로드시 파일이 잘림
		
//		int ea = this.is.read(temp);		
//		String data = new String(temp);
		String data = new String(temp,0,this.is.read(temp));
		System.out.println(data);
		
		};		
}

