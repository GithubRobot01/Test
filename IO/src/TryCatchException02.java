import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
/*
JDk7新特性
在try的后边可以增加一个(),在括号中可以定义流对象
那么这个流对象的作用域就在try中有效
try中的代码执行完毕,会自动把流对象释放,不用写finally
格式:
    try(定义流对象;定义流对象...){
        可能会产生异常的代码
    }catch(异常类变量 变量名){
        异常的处理逻辑
    }
 */
public class TryCatchException02 {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Pictures\\zy.jpg");
            FileOutputStream fos=new FileOutputStream("D:\\File\\1.jpg");){
            byte[] bytes=new byte[1024];
            int len=0;
            while ((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
