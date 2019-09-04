import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(8080);
            Socket socket=null;
            socket=serverSocket.accept();
            InputStream inputStream=socket.getInputStream();
            System.out.println("in:");
            System.out.println("out"+socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
