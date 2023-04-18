package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

public class File8 {
	// BufferReader (output) - cpu (캐시메모리)에 임시저장
	// 사용하는 이유 : 배열에 값을 빠르게 배분하여 활용 할 수 있도록 함
	public static void main(String[] args) throws Exception {

		Buffer bf = new Buffer();
		bf.dataView();

	}
}
class Buffer {

	FileReader fr;
	BufferedReader br;
	FileReader fr2;

	public void dataView() throws Exception {

		this.fr = new FileReader("E:\\git_java\\javaproject\\project1\\src\\Files\\Notice.txt",Charset.forName("UTF8"));
		this.br = new BufferedReader(this.fr);
		//갯수 확인하기위한 객체를 한번더 생성 (메모리에 저장된 데이터를 두번사용할수 없음)
		this.fr2 = new FileReader("E:\\git_java\\javaproject\\project1\\src\\Files\\Notice.txt",Charset.forName("UTF8"));
		LineNumberReader li = new LineNumberReader(this.fr2);
		//새로운 객체 fr2 호출 (fr1 호출시 다음 공지내용이 출력안되고 라인갯수만출력됨) *중복사용안됨*
		
		int ea = 0;
		while(li.readLine()!= null) {
			ea = li.getLineNumber();
			System.out.println(ea);
			
		}
		//조건문에 Buffered readLine() 사용시 해당 첫번째 라인은 캐시메모리에서 삭제됨
		/*
		 ***(중요)*** Buffer은 무조건 한번 사용시 다음 라인으로 이동됨 
		*/
		String text = "";
		while((text = this.br.readLine())!=null) {
			System.out.println(text);
		}
	}
}
