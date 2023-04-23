package Month1.Arrays.SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] >  arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return  arr;
    }
}



