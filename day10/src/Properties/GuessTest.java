package Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class GuessTest {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();
        FileReader fr=new FileReader("day10\\game.txt");
        //将次数写入文件
       /* pro1.setProperty("count","0");
        pro1.store(fw,null);*/
        pro.load(fr);
        int count=Integer.parseInt(pro.getProperty("count"));
        if (count<3){
            GuessNumber.start();
            count++;
            pro.setProperty("count",String.valueOf(count));
            FileWriter fw=new FileWriter("day10\\game.txt");
            pro.store(fw,null);
            fw.close();
        }else {
            System.out.println("游戏结束!");
        }
        fr.close();
    }
}
