package Threadex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

public class nex_ex1 {
	public static void main(String[] args) {
		OnTask ot = new OnTask();
		try {
			ot.imgDown();
		} catch (Exception e) {
			System.out.println("메소드 전송 오류");
			e.printStackTrace();
		}
	}
}
class OnTask{

	public void imgDown() throws Exception{
		Date today = new Date();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("다운받을 주소를 입력해주세요");
		URL u = new URL(sc.nextLine());
		URLConnection uc = u.openConnection();
		long a = uc.getContentLength();
		try(		
		BufferedInputStream inBuff = new BufferedInputStream(u.openStream());
		BufferedOutputStream outBuff = new BufferedOutputStream(new FileOutputStream("D:\\sajin\\"+today.getTime()+".jpg"))){
		
		
		byte[] data = new byte[2048];
		int imgs = 0;
		int check = 0;
		while((imgs = inBuff.read(data)) > 0) {
			
			outBuff.write(data,0,imgs);
			check += imgs;
			System.out.println("다운로드 중...." + (check*100)/a + "%" );
			if((check*100)/a == 100) {
				System.out.println("다운로드 완료");
			}
		}
		sc.close();
		}
		catch (Exception e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		}
	}
}