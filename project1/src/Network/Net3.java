package Network;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//Crawling 사용법
public class Net3 {

	public static void main(String[] args) {
		
		try {
			crawling cr = new crawling();
			cr.creak();
		} catch (Exception e) {
			
			
		}
	}
}
class crawling {
	Scanner sc;
	String url = "";
	URL urls;
	InputStream is;
	InputStreamReader ir;

	public void creak() throws Exception {
	
		this.sc = new Scanner(System.in);
		System.out.println("크롤링 할 URL주소를 입력하세요 (파일명 포함)");
		this.url = this.sc.nextLine();
		this.urls = new URL(this.url);
		URLConnection con = this.urls.openConnection();
		this.is = this.urls.openStream();
		//통신에는 openStream만 사용합니다.
		
		// ▲▲▲ 통신 파트 ▲▲▲ 
		
		
		this.ir = new InputStreamReader(this.is); //url 소스파일 로드
		BufferedReader buff = new BufferedReader(this.ir);  //읽은 소스파일을 메모리에탑제		
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test.html"); //읽은파일 저장할 경로

		PrintWriter pw = new PrintWriter(fs); //출력을 문자화 하여 사용
		String code = "";
		while((code = buff.readLine()) != null) {
			pw.write(code); //write에 String으로 사용
		}
		System.out.println("크롤링이 모두 완료 되었습니다");
		pw.close();
		fs.close();
		fs.flush();
		is.close();
		sc.close();
	}
}

















