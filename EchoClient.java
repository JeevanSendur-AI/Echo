import java.net.*;
import java.io.*;

public class EchoClient {
    public static void main(String[] args) {
        String str;
        try {
            InetAddress ia = InetAddress.getLocalHost();
            Socket s = new Socket(ia, 1200);
            PrintWriter ps = new PrintWriter(s.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(s.getInputStream()));

            while (true) {
                System.out.println("Client:");
                str = userInput.readLine();
                ps.println(str);
                System.out.println("Server:" + serverInput.readLine());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
