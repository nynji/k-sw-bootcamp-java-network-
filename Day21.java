import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Day21 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.inha.ac.kr");
            URLConnection urlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e)
            // Handle exceptions
        } catch (IOException ex){
            System.out.println("입출력오류 ");
        }
    }
}
