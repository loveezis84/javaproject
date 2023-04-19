package Network;

import java.net.InetAddress;

public class Net1 {
	//IPv4 : 192.168.0.1,  IPv6 : off2:3x12:911h:31xt
	//localhost: 자신의 서버 주소를 말함
	//TCP : IP형태 통신(속도가 느림) , UDP : 내부망 형태로 통신 (속도가 빠름)
	public static void main(String[] args) {
		try {
			//InetAddress : IPnetworkAddress 를 말합니다
			//getByName : 접속할 도메인 주소명을 말합니다.
			//getHostAddress : 접속하는 서버의 ip주소
			
			InetAddress ia = InetAddress.getByName("localhost");
//			String domain = ia.getHostAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip);
			
			//getAllByName : 배열로 처리하는 형태
			//cmd 명령어 : 
			//nslookup naver.com
			//netstat -ano
			
			InetAddress ia2[] = InetAddress.getAllByName("naver.com");
			System.out.println(ia2.length);
			//naver.com 의 ip는 4개
			int w = 0;
			while(w < ia2.length) {	
				System.out.println(ia2[w].getHostAddress());
				w++;
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}
}
