package java3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		method2 mt = new method2();
		String data[] = {"2,000","2,500","3,000","500","4,500"};
		try {
			mt.total1_method(data);
		} catch (Exception e) {
			System.out.println("데이터를 확인할 수 없습니다.");
		}
		finally {  //원시 배열로 받을 경우 원시 배열값으로 보내야함
			//ArrayList, list, linkedList, Map할 경우는 일반 인자값으로 보내면됨
			//ArrayList<String> rdata = new ArrayList<>();
			
			String rdata[] = new String[data.length];
 			int j = 0;
			while(j < data.length) {
				rdata[j] = data[j].replaceAll(",","");
				j++;
			}
			try {
				mt.total1_method(rdata);
			}
			catch (Exception e) {
				//catch에는 sysout을 사용안함
				e.getMessage(); //문제 발생시에만 출력됨
			}
		}
	}
}
class method2{
	
	public void total1_method(String bb[]) throws Exception{
		int money;
		int w = 0;
		int sum = 0;
		
		while(w < bb.length) {
			sum += Integer.valueOf(bb[w]);
			w++;
		}
		System.out.println(sum);
//		while(w<bb.length) {
//			money = Integer.parseInt(bb[w].replaceAll(",",""));
//			sum += money;
//			w++;
//		}
//		System.out.printf("총 합산 금액은:%d원 입니다",sum);
	}
}