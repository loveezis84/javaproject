package java3;

import java.util.ArrayList;

//예외처리로 발생하는 코딩 테스트

/*
 응용문제
 데이터 파일 {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
 해당 데이터 값 중 문자값만 출력 되도록 재 배열 하시길 바랍니다.
 단, 메인에서는 해당 배열을 외부 클레스(setter)로 전송합니다.
 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.
 getter에서 해당 배열을 return으로 보내도록 합니다.
 단,외부 클레스에서 숫자만 있는 배열은 모두 예외 처리 되도록 합니다. 
 */
public class Exception7 {

	public static void main(String[] args) {
		Object[] data = {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
 		try { //예외처리
			checklist cl = new checklist(); //인스턴스 객체생성
			cl.setter(data); // 배열값 전달
			ArrayList total = cl.getter(); //배열값이 재조정된 값을 리턴받아 total변수에 이관
			System.out.println(total); //최종결과출력
			
			ArrayList age = cl.getter2();
			System.out.println(age);
			
		} catch (Exception e) {
			if(e.getMessage() != null) {
				System.out.println("error 발생");
				
			}
		}
	}
}
class checklist{
	
	ArrayList<String> name = new ArrayList<>(); // 문자열 받기위한 빈배열
	ArrayList<Integer> agelist = new ArrayList<>(); //숫자열 받기위한 빈배열
	public void setter(Object[] a) throws Exception { 
		//(3) Object배열을 setter로 받음
		int ea = a.length;
		int w = 0;
		
		while(w < ea) {
			
			try { //문자만 배열에 입력, 숫자 자료형일 경우 예외처리
				String check = String.valueOf((String)a[w]);
				this.name.add(check);
				
			}catch (Exception e) {	//예외처리발생
				int check2 = Integer.valueOf((int)a[w]); 
				//위에서 걸러진 숫자들만 따로 check2변수에 이관
				this.agelist.add(check2);
			}
			w++;
		}
	}
	public ArrayList<String> getter() { //(5)예외처리된 setter를 리턴함
		
		return this.name;
	}
	public ArrayList<Integer> getter2(){
		
		return this.agelist;
	}
}
