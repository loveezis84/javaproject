package java_ex;

import java.util.ArrayList;

public class ex3 {
	/*
	 응용문제
	 데이터 파일 {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
	 해당 데이터 값 중 문자값만 출력 되도록 재 배열 하시길 바랍니다.
	 단, 메인에서는 해당 배열을 외부 클레스(setter)로 전송합니다.
	 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.
	 getter에서 해당 배열을 return으로 보내도록 합니다.
	 단,외부 클레스에서 숫자만 있는 배열은 모두 예외 처리 되도록 합니다. 
	 */
	public static void main(String[] args) {
		UserInfo ui = new UserInfo();
		Object[] data = {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
		
		try {
			ui.setter(data);
			ArrayList aaa = ui.aaa();
			System.out.println(ui.aaa() +""+ aaa);
			
			ArrayList bbb = ui.bbb();
			System.out.println(ui.bbb()+""+bbb);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class UserInfo{
	ArrayList<String> name;
	ArrayList<Integer> Unumber;
	public void setter(Object[] a) throws Exception{
		name = new ArrayList<>();
		Unumber = new ArrayList<>();
		int w = 0;
		while(w < a.length) {
			
			try {
			 String userN = String.valueOf((String)a[w]);
			 name.add(userN);
			} 
			catch (Exception e) {
			int Number = (int)a[w];
			Unumber.add(Number);
			}
			
			w++;
		}	
	}
	public ArrayList<String> aaa(){
		
		return this.name;
	}
	public ArrayList<Integer> bbb(){
		
		return this.Unumber;
	}
}










