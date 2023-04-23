package Month1.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 4));
    }

    // method for binary search
    // binary search will work only if the array is sorted.
    public static int binarySearch(int[] arr, int target){
        int first = arr[0];
        int last = arr.length/2;

        while(first <=last){
            int mid = (first+last)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] <  target){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }
}

