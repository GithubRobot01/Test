package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//HashMap嵌套ArrayList
public class ArrInMap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        ArrayList<String> ssyy=new ArrayList<>();
        ssyy.add("赵云");
        ssyy.add("邓艾");
        map.put("三国演义",ssyy);
        ArrayList<String> shz=new ArrayList<>();
        shz.add("林冲");
        shz.add("鲁智深");
        shz.add("卢俊义");
        map.put("水浒传",shz);
        ArrayList<String> xyj=new ArrayList<>();
        xyj.add("孙悟空");
        xyj.add("唐僧");
        xyj.add("猪八戒");
        xyj.add("沙和尚");
        map.put("西游记",xyj);
        Set<String> set = map.keySet();
        //遍历HashMap中的键值
        for (String s : set) {
            //通过键找值
            System.out.println(s);
            ArrayList<String> list = map.get(s);
            for (String s1 : list) {
                System.out.print(s1+"\t");
            }
            System.out.println();
        }
    }
}
