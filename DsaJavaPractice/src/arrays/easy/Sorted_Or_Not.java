package arrays.easy;

public class Sorted_Or_Not {

    public static boolean sorted_or_not(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sorted_or_not(arr));
    }

}
