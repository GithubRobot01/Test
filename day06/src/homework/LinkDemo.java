package homework;

import java.util.ArrayList;

public class LinkDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=500; i++) {
            list.add(i);
        }
        int count=1;
        for (int i = 0; list.size()!=1; i++) {
            if (i==list.size()){
                i=0;
            }
            if(count%3==0){
                list.remove(i--);
            }
            count++;
        }
        System.out.println(list.get(0));
    }
}
