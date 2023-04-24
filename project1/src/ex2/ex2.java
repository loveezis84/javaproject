package ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ex2 {

	public static void main(String[] args) {

		try {
			dataWrite dw = new dataWrite();
			dw.abc();
		} catch (Exception e) {
			System.out.println("메소드 오류");
		}
	}

}
class dataWrite {

	public void abc() throws Exception {
	
		try(
		InputStream is = new FileInputStream("C:\\sajin\\herin2.jpg");
		OutputStream os = new FileOutputStream("C:\\sajin\\herin5.jpg")){
		byte data[] = new byte[is.available()/100];
		int w = 0;
		int check = 0;
		while(true) {
			w = is.read(data);
			//input의 해당 경로에 파일을 1024속도로 로드할거다 
			if(w == -1){
				break;
			}
			else {
				os.write(data,0,w);
			}
			System.out.println(check + "%");
			if(check == 100) {
				System.out.println("다운로드가 완료되었습니다");
			}
			check++;
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
