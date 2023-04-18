package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File16 {

	//이미지(Binary) 형태 byte단위로 설정(FileReader x)
	//InputStream으로 이용
	
	/*
	 바이너리 -> 이미지,압축파일,동영상,pdf.... 
	  순서 
	  1.InputStream 이용
	  2.OutputStream로 파일이름만 생성
	  3.byte 단위로 처리사항 생성 byte[객체명.available()/100]
	  4.무한 반복문으로 원본파일을 지속적으로 읽어들이면서 write로 복사함
	  5.-1은 복제가 완료되었을경우 무한반복문 break;
	  
	  
	  
	  
	 */
	public static void main(String[] args) {
		
		try {
			//사용자가 업로드 하는 이미지
			InputStream is = new FileInputStream("E:\\memo\\herin.jpg");
			
			//사용자 이미지 크기를 계산후 파일을 읽어들이는 크기
			byte img[] = new byte[is.available()/100];
			//뒤에 있는 /100은 100%라고 생각하면 되고, 100%를 2프로씩 나눠서 다운받는다.
			//100 = 2%씩
			//10 = 20%씩
			OutputStream os = new FileOutputStream("E:\\memo\\herin2.jpg");
			//원본파일 카피할 경로의 파일이름
			int imgs = 0; //읽는 바이트 수
			int check = 0; // %로 사용자에게 생성되는 상황을 보여주기 위한 변수
			//안써도 상관없음
			
			while(true) {
				imgs = is.read(img); //해당 파일을 바이트 변수로 옮김
				System.out.println(imgs);
				if(imgs == -1) { //img를 imgs로 다운받는과정에서 다 받았을때 -1이찍히게됨
					break;
				}
				else {
					os.write(img,0,imgs); //다운받은 이미지를 실제로 처리하는 마지막 변수
				}
				//현재 생성 되고 있는 %를 표기하기 위한 코드(사용안해도 ㄱㅊ)
				System.out.println(check + "%");
				//이미지 다운로드 완료율을 보여주는 변수
				check++;
			}	
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
