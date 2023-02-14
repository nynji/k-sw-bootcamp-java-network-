import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

public class Day22 {
    public static void main(String args[]) {
        System.out.println("멀티캐스트 타임 서버");
                DatagramSocket serverSocket = null;  //UDP
        try {
            serverSocket = new DatagramSocket();
            while (true) {
                String dateText = new Date().toString();
                byte[] buffer = new byte[256];
                buffer = dateText.getBytes();

                InetAddress group = InetAddress.getByName("224.0.0.7");
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, 10000); //패킷 : 을 날림
                serverSocket.send(packet);
                System.out.println("전송된 시간: " + dateText);
                try {
                    Thread.sleep(1000);  // 1초 단위 딜레이, Thread.sleep은 try구문이 반드시 필요하다
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                    // Handle exception
                }
            }
        } catch (IOException ex) {
            // Handle exception
        }

        }
}

