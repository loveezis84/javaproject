package ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

public class ex3 {

	public static void main(String[] args) {
		DataResult dr = new DataResult();
		try {
			dr.result();
		} catch (Exception e) {
			System.out.println("메소드오류");
			e.printStackTrace();
		}
	}

}

class DataResult {

	public void result() {
			Date todat = new Date();
		try
		(BufferedInputStream bufIn = new BufferedInputStream(new FileInputStream("C:\\sajin\\herinlv.jpg"));
		BufferedOutputStream bufout = new BufferedOutputStream(new FileOutputStream("C:\\sajin\\"+todat.getTime()+".jpg"))){
		
		byte[] data = new byte[bufIn.available()/100];
		
		int imgs = 0;
			
		while((imgs = bufIn.read(data)) > 0) {
			
			bufout.write(data,0,imgs);
		}
		}
		catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
		
	}
}
















