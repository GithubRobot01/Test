package BaoZhuang;

import java.util.ArrayList;

/*
自动装箱与拆箱:基本类型的数据和包装类之间可以自动的相互转换
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        Integer i1=1;  //自动装箱:相当于Integer i1=new Integer(1);
        /*
        自动拆箱:i1是包装类,无法直接参与运算,可以自动转换为基本数据类型
        再进行计算i1+2;相当于i1.intValue()+2
        i1=in.intValue()+2 又是一个自动装箱
         */
        i1=i1+2;
        //ArrayList集合无法直接存储整数,可以存储Integer包装类
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);  //自动装箱list.add(new Integer(1));
        int a=list.get(0);  //自动拆箱 list.get(0).intValue();
    }
}
