package BufferStream;

import java.io.UnsupportedEncodingException;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="中国";
        byte[] bytes1 = s.getBytes();
        byte[] bytes2 = s.getBytes("GBK");
        String s1=new String(bytes1);
        String ss1=new String(bytes1,"GBK");
        String s2=new String(bytes2);
        String ss2=new String(bytes2,"GBK");
        System.out.println(s1);
        System.out.println(ss1);
        System.out.println(s2);
        System.out.println(ss2);
    }
}
