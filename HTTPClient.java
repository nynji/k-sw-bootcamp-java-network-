import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class HTTPClient {
    public HTTPClient() {
        System.out.println("HTTP Client Started");
        try {
            InetAddress serverInetAddress = InetAddress.getByName("165.246.115.165");
            Socket connection = new Socket(serverInetAddress, 80);
            try (OutputStream out = connection.getOutputStream();
                 BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                sendGet(out);

                System.out.println(getResponse(in));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new HTTPClient();
    }

    private void sendGet(OutputStream out) {
        try {
            out.write("GET /default\r\n".getBytes());  // GET 대신 POST 쓰면 GET 방식이 아니라 405 에러 뜸
                out.write("User-Agent: Mozilla/5.0\r\n".getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private String getResponse(BufferedReader in)
    {
        try {
            String inputLine;
            StringBuilder response = new
                    StringBuilder();
            while ((inputLine = in.readLine()) !=
                    null) {

                response.append(inputLine).append("\n");
            }
            return response.toString();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }


}
