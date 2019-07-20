import java.io.FileWriter;
import java.io.IOException;

public class TryCatchException {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw=new FileWriter("D:\\File\\2.txt");
            char[] chars={'追','梦','赤','子','心'};
            fw.write(chars);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
