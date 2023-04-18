package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class File13 {

	// 파일 생성
	public static void main(String[] args) {

		// File("경로 및 파일명")
		try {

			File fi = new File("E:\\git_java\\javaproject\\project1\\src\\Files\\abc.txt");
			if (fi.exists() == false) { // 해당 경로에 파일유무를 체크
				fi.createNewFile();

			}
			String data = "홍길동"; //데이터
			OutputStream os = new FileOutputStream(fi); //파일저장 경로
			byte[] b = data.getBytes(); //데이터를 byte 단위로 생성
			os.write(b); //파일을 abc.txt 에 쓰기
			os.close(); //메모리 초기화
			os.flush(); //파일닫기

		} catch (Exception e) {

		}

	}
}
