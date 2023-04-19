package Network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;


public class Net2 {
	
	/*
		<TCP 포트>
		PORT 접속을 하고자 하는 경로
		80 : WEB (http://)
		443 : WEB (https://)
		21 : FTP
		22 : SSH
		23 : Telnet
		25 : SMTP (메일보내기)
		110 : POP3 (메일받기) - 서버와 비동기화
		143 : IMAP (메일받기) - 서버와 동기화
		
		<UDP 포트>
		SNMP : 문자발송시스템
		VPN : 가상 IP
	 */
	public static void main(String[] args) {
		
		try {
			getimg gi = new getimg();
			gi.img();	
		} catch (Exception e) {
			System.out.println("통신오류");
			e.printStackTrace();
		}
	}
}
class getimg{
	Scanner sc;
	InputStream is;
	BufferedInputStream buff;
	FileOutputStream fs;
	public void img() throws IOException{
		sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해주세요");
		String url = sc.nextLine();
		URL u = new URL(url); 
		//URL(클레스) : 네트워크 경로를 말합니다.(절대경로형태로 적용)
		
		URLConnection con = u.openConnection();
		//해당 경로를 연결하는 것을 의미한다.
		
		System.out.println(con);
		
//		int imgsize = con.getContentLength();  //이미지 사이즈 87001
		String imgtype = con.getContentType(); 
		System.out.println(imgtype); //이미지 타입 image/jpeg
		String date = String.valueOf(con.getDate()); //파일 업로드 날짜
		System.out.println(date); 
		
		this.is = u.openStream(); 
		//통신에서는 oepnStream()만 사용한다
		
		this.buff = new BufferedInputStream(this.is); 
		//img 파일을 임시로 메모리에 저장
		
		byte[] data = new byte[this.buff.available()]; 
		//이미지 다운로드 속도 지정 (얼만큼 조각내서 다운받을지 지정 1kb(1024))
		
		Date today = new Date();
		String filename = today.getTime()+".png";
		fs = new FileOutputStream("E:\\memo\\"+filename);
		//파일 이름을 날짜를 생성해서 중복되지않게 계속 이름을 바꿔주기위한 방법
		
//		buff.read(data);
//		fs.write(data);
		
		int imgdata = 0;
		int count = 0;
		while((imgdata = buff.read(data)) != -1) {
			this.fs.write(data,0,imgdata);  //조각난 파일을 취합하여 저장시킴
			count += imgdata;
			System.out.println("다운로드 중..." + (count*100)/87001 + "%");
			
		}
		System.out.println("다운로드 완료 되었습니다");
		this.fs.flush();
		this.fs.close();
		this.sc.close();
		this.buff.close();
		this.is.close();
	}
}

























