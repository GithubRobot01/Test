package homework_08;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Employee e1=new Employee("张三",23);
        Employee e2=new Employee("李四",24);
        Employee e3=new Employee("张三",23);
        Employee e4=new Employee("张三",28);
        ArrayList<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        for (int i = 0; i <list.size() ; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    list.get(i).setGift("缘分大礼包");
                    list.get(j).setGift("缘分大礼包");
                }
            }
        }
        for (int z = 0; z <list.size() ; z++){
            if(list.get(z).getGift()==null){
                list.get(z).setGift("普通大礼包");
            }
        }

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
