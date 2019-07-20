import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
JDk9新特性
在try的前边可以定义流对象
在try后边的()中可以直接引入流对象的名称(变量名)
try中的代码执行完毕,会自动把流对象释放,不用写finally
格式:
    定义流对象;定义流对象...
    try(流对象){
        可能会产生异常的代码
    }catch(异常类变量 变量名){
        异常的处理逻辑
    }
 */
public class TryCatchException03 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Pictures\\zy.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\File\\1.jpg");
        try(fis;fos){
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
