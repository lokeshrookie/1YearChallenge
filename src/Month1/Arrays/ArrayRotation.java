package Month1.Arrays;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(arr, 3)));
    }


    // There are different ways to rotate an array.
    public static void rotateArray(int[] arr){
        int last = arr[arr.length-1];
        int first = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        arr[arr.length-1] = first;
        System.out.println("rotated array: " + Arrays.toString(arr));
    }
    public static int[] rotate(int[] arr, int timeToRotate){
        for (int i = 0; i < timeToRotate; i++) {
           rotateArray(arr);
        }
        return  arr;
    }


    // Method - 2: By reversing the array.


}
