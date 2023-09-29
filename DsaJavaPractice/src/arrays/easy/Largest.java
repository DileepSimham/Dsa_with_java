package arrays.easy;

import java.util.Arrays;

public class Largest {

    public static void largest(int[] arr){
        int max=arr[0];
        for (int i = 1; i<arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {8,10,5,7,9};
        largest(arr);
    }
}
