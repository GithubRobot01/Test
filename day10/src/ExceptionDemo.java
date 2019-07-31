import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("D:\\File");
            FileReader fr=new FileReader("D:\\File");){
            int i;
            while ((i=fr.read())!=-1){
                fw.write(i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
