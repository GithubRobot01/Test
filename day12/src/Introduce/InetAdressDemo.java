package Introduce;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("192.168.24.52");
        String name = byName.getHostName();
        String address = byName.getHostAddress();
        System.out.println(name);
        System.out.println(address);
    }
}
