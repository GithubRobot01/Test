package homework05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        String fileName="day12\\"+uuid+".jpg";
        File file=new File(fileName);
        Socket socket = serverSocket.accept();
        //读取客户端传来的图片
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        //反馈给客户端
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //把客户端传来的图片写入本地
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file));
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bw.write("上传成功!");
        bw.newLine();
        bw.flush();
        bos.close();
        serverSocket.close();
    }
}
