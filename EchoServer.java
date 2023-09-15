import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) {
        String str;
        try {
            ServerSocket ss = new ServerSocket(1200);
            Socket s = ss.accept();
            BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter outputToClient = new PrintWriter(s.getOutputStream(), true);

            while (true) {
                str = inputFromClient.readLine();
                outputToClient.println(str);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
