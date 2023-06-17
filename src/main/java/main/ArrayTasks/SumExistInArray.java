package main.ArrayTasks;

import java.util.HashMap;
import java.util.Map;

public class SumExistInArray {
    // find if there are digits in the array which make certain SUM
//    with minimum complexity;
    public static void main(String[] args) {

        int[] arr = {1, 18, 5, 6, 13, 10,1,6};
        int sum = 19;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diference = sum - arr[i];
            if (!hashMap.containsKey(arr[i])) {
                hashMap.put(diference, arr[i]);
            }else {
                System.out.println(arr[i] + " + " + hashMap.get(arr[i])+" makes "+ sum);
            }

        }
    }
}
