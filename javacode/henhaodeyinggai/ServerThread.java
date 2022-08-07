package henhaodeyinggai;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket socket = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    public ServerThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true){
                String str = br.readLine();
                if(str!=null){
                    System.out.println("[" + socket.getRemoteSocketAddress() + "]:" + str);
                    //循环遍历给每一个socket发送收到的消息，除了自身（即发送这条消息给服务端的socket）
                    for (Socket s : Server.socketList) {
                        if(!socket.equals(s)){
                            bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                            bw.write("[" + socket.getPort()+ "]:" + str);
                            bw.write("\n");
                            bw.flush();
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
