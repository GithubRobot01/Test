package Consumer;

import java.util.function.Consumer;

public class AndThenDemo {
    public static void main(String[] args) {
        String[] array={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        formatPrint(array,(s1)->{
            String name=s1.split(",")[0];
            System.out.print("姓名:"+name);
        },(s1)->{
            String sex=s1.split(",")[1];
            System.out.println(",性别:"+sex);
        });
    }
    public static void formatPrint(String[] s, Consumer<String> con1,Consumer<String> con2){
        for (String s1 : s) {
            con1.andThen(con2).accept(s1);
        }
    }
}
