package ClassLoader_;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        //获取应用程序类加载器AppClassLoader
        ClassLoader c1 = ClassLoader.getSystemClassLoader();
        System.out.println(c1);
        //其父加载器是平台类加载器PlatformClassLoader
        ClassLoader c2 = c1.getParent();
        System.out.println(c2);
        //其父类是Bootstrap类加载器,通常为null
        ClassLoader c3 = c2.getParent();
        System.out.println(c3);
    }
}
