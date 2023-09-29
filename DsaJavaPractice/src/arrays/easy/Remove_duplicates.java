package arrays.easy;

import java.util.Arrays;

public class Remove_duplicates {

    public static int[] remove_duplicates(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j] && arr[j]!=-1){
                    arr[j]=-1;
                }
            }
        }

        int[] temp=new int[arr.length];
        int k=0;
        for (int j : arr) {
            if (j != -1) {
                temp[k++] = j;
            }
        }
        return temp;
    }


    public static void optimal(int[] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

        System.out.println(i+1);
    }


    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3,3,3,4,4};
//        System.out.println(Arrays.toString(remove_duplicates(arr)));
//        optimal(arr);

        String a=Arrays.toString(arr);
        System.out.println(a);
    }
}
