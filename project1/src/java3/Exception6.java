package java3;

/*
아이디 중복체크 발생 확인하는 예시
error : 값이 없을 경우
no : 아이디 중복 발생
yes : 사용가능한 아이디 
*/
public class Exception6 {

	public static void main(String[] args) {
		idcheck id = new idcheck();
		
		try {  //Ajax로 Front-end에게 아이디값 받는 사항
			String callsign = id.id_result("hong1"); //Ajax로 아이디 받는사람
			System.out.println(callsign);
			
		} catch (Exception e) { //idcheck클레스에서 오류가 발생 하였을 경우 메시지출력  
			if(e.getMessage() != null) {
				System.out.println(e);
			}
		}
	}
}
class idcheck{
	//아이디 중복 검토 확인
	public String id_result(String mid) throws Exception{
		String call = ""; //front-end에게 출력해주는 메시지 변수
		if(mid == null || mid.equals("")) { //아이디박 비어있을경우
			throw new Exception("error"); //예외처리 발생
		}
		else { //front-end가 아이디를 정상적으로 발송 하였을 경우
			if(mid.equals("hong")) { //동일한 아이디가 있을경우 
				call = "no"; //중복된 아이디가 있을때
			}
			else {
				call = "yes";  //사용가능한 아이디일때
			}
		}
		return call; //최종 결과값 return
	}
}
