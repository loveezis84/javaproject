package Files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 이미지 용량 제한 체크 프로세서 만들기
 이미지 업로드 할수 있는 최대 용량은 1mb이하 입니다.
 1mb 이상 파일을 업로드시 "이미지 제한 용량은 1mb 이하 까지 입니다. 라는
 메시지를 출력. 단, 정상적인 1mb이하면 e:memo에 이미지가 복사되도록함 
*/
public class File17 {

	public static void main(String[] args) {
	
		memory mm = new memory();
		try {
			mm.memoryImg();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class memory{
	public void memoryImg() throws Exception {
//		String file = "E:\\memo\\bird.jpg";  //1메가이상
		String file1 = "E:\\memo\\pat.jpg"; //1메가 이하
		InputStream ist = new FileInputStream(file1);
		
		if(ist.available() > 1048576) {
			System.out.println("1mb이하의 이미지만 첨부하세요");
		}
		else {
			BufferedInputStream buff = new BufferedInputStream(ist);
			byte fileSize[] = new byte[buff.available()];
			
			OutputStream ost = new FileOutputStream("E:\\memo\\copy2.jpg");
			buff.read(fileSize);
			ost.write(fileSize);
			
			System.out.println("이미지가 등록 되었습니다");
			buff.close();
			ist.close();
			ost.close();
		}
	}
}
