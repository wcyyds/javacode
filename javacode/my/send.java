package my;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class send implements Runnable{
    //创建socket连接
    Socket socket;
    //你的名字
    String I;

    public send(Socket socket,String I ) {
        this.I = I;
        this.socket= socket;
    }


    @Override
    public void run() {
        while (true){
            try {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                while (true){
                    Scanner scanner = new Scanner(System.in);
                    bw.write (socket.getLocalPort() + " : " + scanner.nextLine());
                    bw.write("\n");
                    bw.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
