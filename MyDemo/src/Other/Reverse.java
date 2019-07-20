package Other;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,5,2,6,1,3};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr){
        for (int start = 0,end=arr.length-1; start < end; start++,end--) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
}
