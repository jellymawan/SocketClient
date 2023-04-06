// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.net.*;
import java.io.*;

public class TCPSocket {
    public static void main(String... args){
        String host = args[0];
        int port = Integer.valueOf(args[1]);

        try {

            Socket sock = new Socket(host, port);

            InputStream in = sock.getInputStream();
            int readChar = 0;
            while ((readChar = in.read()) != -1) {
                System.out.write(readChar);
            }
            sock.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}