import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SimpleEchoServer {
    public static void main(String[] args) {
        System.out.println("에코 서버 시작됨");
        try (ServerSocket serverSocket = new ServerSocket(7000)) {
            System.out.println("클라이언트 접속 대기 중.....");
            Socket clientSocket = serverSocket.accept();  // 접속 대기
            System.out.println("클라이언트 접속됨.");

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true)) {
                //GIS:클라이언트가 서버에게 보냄
                //true : 송신용 버퍼를 자동으로 비움
//                String line;
//                while ((line = br.readLine()) != null) {
//                    System.out.println("클라이언트로 부터 받은 메세지 : " + line);
//                    pw.println(line);  // 클라이언트로 송신
//                }
                Stream s = Stream.generate(() -> {
                    try {
                        return br.readLine();
                    } catch (IOException ex) {
                        return null; //예외처리
                    }
                });
                s.peek(text -> { //코드 줄이기 가능
                    System.out.println("클라이언트로부터 받은 메세지 : " + text);
                    pw.println(text);
                }).allMatch(Objects::nonNull);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException ex) {
            System.out.println("접속 실패!");
        }
    }
}