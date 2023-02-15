import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

class One{ // new 없이 객체 생성
    private One(){
    }
    public static One produceOneInstance(){
        return new One();
    }
}

public class Test {  // 주소 찾기
    public static void main(String[] args) {
        //One o = new One();
        One o1 = One.produceOneInstance();
        One o2 = One.produceOneInstance();

        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
            System.out.println("IP 주소: " + address.getHostAddress());
            NetworkInterface network = NetworkInterface.getByInetAddress(address);
            System.out.println("MAC 주소: " + getMACIdentifier(network));
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getMACIdentifier(NetworkInterface network) {
        StringBuilder identifier = new StringBuilder();
        try {
            byte[] macBuffer = network.getHardwareAddress();
            if (macBuffer != null) {
                for (int i = 0; i < macBuffer.length; i++) {
                    identifier.append(String.format("%02X%s",macBuffer[i], (i < macBuffer.length - 1) ? "-" : ""));
                }
            } else {
                return "---";
            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
        return identifier.toString();  // 스트링빌더 객체를 문자열로 변환 후 리턴

    }

}
