package Other;

public class SameArr {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4,5};
        boolean a=isSame(arr1,arr2);
        System.out.println(a);
    }

    private static boolean isSame(int[] arr1, int[] arr2) {
        if (arr1.length!=arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
