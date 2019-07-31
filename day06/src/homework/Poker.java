package homework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Poker {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 1; i <=108; i++) {
            list.add(i);
        }
        while (list.size()>1){
            Integer i=list.getFirst();
            list.remove(i);
            if (list.size()==1){
                break;
            }
            Integer j=list.getFirst();
            list.remove(j);
            list.add(j);
        }
        System.out.println(list);
    }
}
