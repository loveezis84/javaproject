package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Net6 {
   //Client 생성
   public static void main(String[] args) {

      try {
         System.out.println("Client connect");
         String ip = "192.168.10.157";
         int port = 9005;
         Socket sk = new Socket(ip,port);
         
         //Client에서 Server로 보내는 메시지
         String cmsg = "yunseung connect";
         
         //Client에서 Server로 보내는 통로 byte로 전송
         OutputStream os = sk.getOutputStream();
         os.write(cmsg.getBytes()); 
         os.flush();
         
         //Server에서 보낸 메시지를 Client가 받는 통로
         byte[] data = new byte[1024];
         InputStream is = sk.getInputStream();
         int n = is.read(data);
         String sm = new String(data,0,n);
         System.out.println(sm);
         sk.close();
         os.close();
         
      }catch (Exception e) {
         System.out.println("Error Server Connect");
      }
   }

}
