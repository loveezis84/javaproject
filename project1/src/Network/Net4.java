package Network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Net4 {

	public static void main(String[] args) {
		
		try {
			crawling2 cr = new crawling2();
			cr.creak();
		} catch (Exception e) {
			
		}
	}
}
class crawling2{
	Scanner sc;
	String url = "";
	URL urls;
	InputStream is;
	InputStreamReader ir;
	BufferedInputStream buff;
	public void creak() throws Exception{
		
		this.sc = new Scanner(System.in);
		System.out.println("크롤링 할 URL주소를 입력하세요 (파일명 포함)");
		this.url = this.sc.nextLine();
		this.urls = new URL(this.url);
		URLConnection con = this.urls.openConnection();
		this.is = this.urls.openStream();
		//BufferedInputStream 적용 후 byte 변환
		//통신에는 openStream만 사용합니다.
		
		// ▲▲▲ 통신 파트 ▲▲▲ 
		
		this.buff = new BufferedInputStream(this.is);
		byte[] code = new byte[1024];
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test.html");
		int z = 0;
		
		while((z = buff.read(code)) != -1) {
			//int 형태로 write 
			fs.write(code,0,z);
			
			z++;
		}
		System.out.println("크롤링을 완료하였습니다");
		buff.close();
		fs.close();
		sc.close();
		is.close();
		ir.close();
		fs.flush();
		
	}
}










