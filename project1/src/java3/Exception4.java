package java3;

import java.text.DecimalFormat;
import java.util.ArrayList;

//예외처리 응용편2
/*
  "hong3000"
  "park1250"
  "kang852"
  "kim1819"
  "lee5117" 
  전체 포인트 합계를 출력하는 프로세서를 구축하시오.
 */
public class Exception4 {

	public static void main(String[] args) {
		
		String data[] = {"hong3000","park1250","kang852","kim1819","lee5117"};
		
		try {
			ex ex = new ex();
			ex.result(data);
			
		} catch (Exception e) {
			if(e.getMessage() != null) {
				System.out.println(e);
			}
		}
	}
}
class ex{
	
	public void result(String[] data) throws Exception{
		
		int sum = 0;
		int point;
		String user;
		ArrayList<Object> userlist = new ArrayList<>();
		int w = 0;
		while(w < data.length) {
			//ArrayList에서 숫자로 변환시 (String)자료형 적용 후 명령어 입력
			point = Integer.parseInt(data[w].replaceAll("[a-zA-Z]", ""));
			user = data[w].replaceAll("[0-9]","");
			
			userlist.add(user);
			sum += point;
			w++;
		}
		DecimalFormat df = new DecimalFormat();
		System.out.printf("전체 유저 아이디는 \n%s\n포인트 총 합계는 %s점 입니다",userlist,df.format(sum));
		
		//혹시 문제가 발생하면 다시 처음으로 돌려보내라는 명령어
		Exception e = new Exception();
		throw e;
	}
}







