package homework;

import java.io.*;
import java.util.ArrayList;

public class Demo8_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("day09\\maths.txt"));
        ArrayList<String> list=new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            String ope = "";
            if (line.contains("+")){
                ope="+";
            }else if (line.contains("-")){
                ope="-";
            }else if (line.contains("*")){
                ope="*";
            }else if (line.contains("/")){
                ope="/";
            }
            int index=line.indexOf(ope);
            int num1=Integer.parseInt(line.substring(0,index));
            int num2=Integer.parseInt(line.substring(index+1));
            int result=0;
            switch (ope){
                case "+":
                    result=num1+num2;
                    break;
                case "-":
                    result=num1-num2;
                    break;
                case "*":
                    result=num1*num2;
                    break;
                case "/":
                    result=num1/num2;
                    break;
            }
            list.add(line+"="+result);
        }
        br.close();
        BufferedWriter bw=new BufferedWriter(new FileWriter("day09\\maths.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
