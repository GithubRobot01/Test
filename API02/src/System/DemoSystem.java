package System;

import java.util.Arrays;

public class DemoSystem {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        //源数组
        int[] src={1,2,3,4,5};
        //目标数组
        int[] dest={6,7,8,9,10};
        System.out.println("赋值前:"+Arrays.toString(dest));
        //public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
        //将数组中指定的数据拷贝到另一个数组中
        //src-源数组,srcPos-源数组的起始索引,dest-目标数组,destPos-目标数组的起始索引,length-要复制的数组元素的数量
        System.arraycopy(src,0,dest,0,3);
        System.out.println("赋值前:"+Arrays.toString(dest));
    }

    private static void demo01() {
        //用来查看系统的效率
        long time1=System.currentTimeMillis();
        for (int i = 1; i <=10000; i++) {
            System.out.println(i);
        }
        long time2=System.currentTimeMillis();
        System.out.println("打印1-1000的数字共耗时:"+(time2-time1)+"毫秒");
    }
    
}
