import java.io.IOException;
import java.net.*;

public class Day21 {
    public static void main(String[] args) {
        try ( ServerSocket serverSocket = new ServerSocket(6000)){ //중괄호 전 소괄호 : 객체 생성 후 try 끝나면 close 없이 자동으로 메모리에서 제거됨 (python with구문과 비슷)
            System.out.println("Waiting for connection.....");
            Socket clientSocket =
                    serverSocket.accept();
            System.out.println("Connected to client");
        } catch (IOException ex) {
            // Handle exceptions
        }
    }
}
