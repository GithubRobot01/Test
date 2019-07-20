package SetInterface;
//使用前提:当方法的参数列表数据类型已经确定,但是参数的个数还不确定,就可以使用可变参数
//使用格式:定义方法时使用  修饰符 返回值类型 方法名(数据类型...变量名){}
//可变参数的原理:可变参数底层就是一个数组,根据传递参数个数不同,会创建不同长度的数组来存储这些参数
//传递参数个数可以是0-多个
public class KeBianCanShu {
    public static void main(String[] args) {
        int s=add(10,20,30);
        System.out.println(s);
    }
    /*
    已知计算n个整数的和,但不知道参数的具体个数
    add();就会创建一个长度为0的数组,new int[0]
    add(10);就会创建一个长度为1的数组,存储传入的参数,new int[]{10}
     */
    //注意1.一个方法的参数列表,只能有一个可变参数
    //注意2.如果方法的参数有多个,可变参数必须写在参数列表的末尾
//可变参数的特殊(终极)写法
//public static void method(Object...obj){}
    public static int add(int...arr){
        //定义一个初始化的变量,记录累加求和
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
