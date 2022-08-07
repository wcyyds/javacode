package my;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver implements Runnable {
    Socket socket = null;
    String him = null;

    public Receiver(Socket socket, String him) {
        this.socket = socket;
        this.him = him;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String str = br.readLine();
                System.out.println(str);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

