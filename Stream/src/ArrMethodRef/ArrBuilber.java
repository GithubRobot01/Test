package ArrMethodRef;

@FunctionalInterface
public interface ArrBuilber {
    //创建int类型数组的方法,参数传递数组的长度,返回创建后的数组
    int[] builderArr(int len);
}
