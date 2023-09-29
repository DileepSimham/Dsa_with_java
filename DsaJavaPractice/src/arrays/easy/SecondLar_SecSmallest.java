package arrays.easy;

import java.util.Arrays;

public class SecondLar_SecSmallest {
    public static void secLarsecSmall(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];

            }

            if(arr[i]<min){
                min=arr[i];
            }
        }

        int secLar=-1;
        int secSmall=max;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>secLar && arr[i]!=max){
                secLar=arr[i];

            }

            if(arr[i]<secSmall && arr[i]!=min){
                secSmall=arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(secLar);
        System.out.println(secSmall);




    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,7,7,5,2,9};
        secLarsecSmall(arr);
    }
}
