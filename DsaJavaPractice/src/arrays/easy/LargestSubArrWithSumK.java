package arrays.easy;

import java.util.HashMap;

public class LargestSubArrWithSumK {

    public static int brute(int[] arr, int target) {

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    max = Math.max(max, j + 1 - i);
                }
            }
        }
        return max;
    }


    public static int better(int[] arr, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hashMap.containsKey(sum - target)) {
                max = Math.max(max, (i + 1) - (hashMap.get(sum - target)));
            } else {
                hashMap.put(sum, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 1, 9};
        System.out.println(brute(arr, 10));
        System.out.println(better(arr, 10));

    }
}
