package ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import java1.Data1;

public class ex4 {

	public static void main(String[] args) {
		Box b = new Box();
		try {
			b.imgdown();
		} catch (Exception e) {
			System.out.println("메소드 오류");
			e.printStackTrace();
		}

	}

}
class Box{
	
	public void imgdown() {
		Date today = new Date();
		try(
		BufferedInputStream inbuff = new BufferedInputStream(new FileInputStream("C:\\sajin\\herinlv.jpg"));
		BufferedOutputStream outbuff = new BufferedOutputStream(new FileOutputStream("C:\\sajin\\"+today.getTime()+".jpg"))){
			
		byte[] data = new byte[inbuff.available()/100];
		int imgs = 0;
		
		while((imgs = inbuff.read(data)) > 0) {
			outbuff.write(data,0,imgs);			
		}
		}
		catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
	}
}



