package LeetCode;

public class JumpGame55 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(canJump(arr));

    }
    public static boolean canJump(int[] arr){
        int start = 0;
        int pointer = start;
        int end = arr.length-1;
        if(arr[pointer+1]!= 0){
            if(arr[pointer+1] > arr[pointer]){
                pointer = pointer+1;
            }
            pointer = pointer+1;
        }
        if(pointer == end){
            return true;
        }
        else{
            return false;
        }

    }


}
