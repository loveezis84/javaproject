package Files;

import java.io.FileWriter;

public class File4 {

	
	//FileWriter : 문자 데이터를 파일에 쓰는 class

	public static void main(String[] args) {
		String userdata[] = {"hong","kim","park","jang"};
		try {
		FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\project1\\src\\Files\\message2.txt");
		//FileWriter에 true를 붙이게 되면, 기존 입력된 내용을 유지하고 추가 데이터가 들어감
		int w = 0;
		do {
			fw.write("{userdb:"+userdata[w]+"}");
			 //write : 문자, 배열, 숫자 등 다양한 데이터값을 파일에 저장하는 명령어
			
			w++;
		}while(w < userdata.length);
		fw.close(); //파일 쓰기 종료
		
		} catch (Exception e) {
		}
	}
}
