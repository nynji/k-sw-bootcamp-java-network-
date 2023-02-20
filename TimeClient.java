import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class TimeClient {
    //NIO MultiCast Client
    public static void main(String[] args) {
        SocketAddress address = new InetSocketAddress("127.0.0.1", 5000);
        try (SocketChannel socketChannel = SocketChannel.open(address)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(64);  // NON DIRECT
            int bytesRead =
                    socketChannel.read(byteBuffer);
            while (bytesRead > 0) {
                byteBuffer.flip();
                while (byteBuffer.hasRemaining())
                {
                    System.out.print((char)
                            byteBuffer.get());
                }
                System.out.println();
                bytesRead =
                        socketChannel.read(byteBuffer);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
