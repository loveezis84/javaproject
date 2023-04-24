package Threadex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

public class net1 {

	public static void main(String[] args) {

		Network_work nw = new Network_work();
		try {
			nw.gowork();
		} catch (Exception e) {
			System.out.println("메소드 전송 오류");
			e.printStackTrace();
		}
	}
}

class Network_work {

	public void gowork() throws Exception{
		Date dt = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 다운받을 이미지 경로를 입력해주세요");
		URL u = new URL(sc.nextLine());
		URLConnection uc = u.openConnection();
		long imgsize = uc.getContentLength();
		
		try 
		(BufferedInputStream inBuff = new BufferedInputStream(u.openStream());
		BufferedOutputStream outBuff = new BufferedOutputStream(new FileOutputStream("D:\\sajin\\"+dt.getTime()+".jpg"))){
			
		byte[] data = new byte[2048];
		int imgs = 0;
		int count = 0;
		while((imgs = inBuff.read(data)) > 0) {
			outBuff.write(data,0,imgs);
			count += imgs;
			System.out.println("다운로드 중...." + (count*100)/imgsize + "%");
			
		}		
		} catch (Exception e) {
			System.out.println("오류발생");
		}
	}
}