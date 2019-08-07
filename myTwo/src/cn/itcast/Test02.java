package cn.itcast;

import itheima_03.MyService;

import java.util.ServiceLoader;

public class Test02 {
    public static void main(String[] args) {
        ServiceLoader<MyService> load = ServiceLoader.load(MyService.class);
        for (MyService myService : load) {
            myService.service();
        }
    }
}
