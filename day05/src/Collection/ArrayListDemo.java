package Collection;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("哥伦比亚");
        list.add("韩国");
        list.add("伊拉克");
        list.add("葡萄牙");
        list.add("阿尔及利亚");
        list.add("南非");
        list.add("斐济");
        list.add("尼日利亚");
        list.add("阿根廷");
        list.add("墨西哥");
        list.add("日本");
        list.add("洪都拉斯");
        list.add("瑞典");
        list.add("丹麦");
        list.add("德国");
        list.add("巴西");
        for (int i = 0; i < 4; i++) {
            System.out.println("第"+(i+1)+"组:");
            for (int j = 0; j < 4; j++) {
                int index=new Random().nextInt(list.size());
                System.out.print(list.remove(index)+" ");
            }
            System.out.println();
        }
    }
}
