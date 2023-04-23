package Month1.Math;

/**
 *
 * - [ ]  DIvisor
 * - [ ]  Count digits
 * - [ ]  sum of Digits
 * - [ ]  Reverse number
 * - [ ]  Armstrong
 * - [ ]  Prime number(sieve).
 */
public class Lokesh {
    public static void main(String[] args) {

    }

    public static int countDigits(int n){
        int count = 0;
        while (n>0){
            count++;
            n/=10;
        }
        return count;
    }

    public static int  sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static int reverseNumber(int n){
        int reverse = 0;
        while(n > 0){
            int rem = n%10; // rem;
            reverse = rem* 10 + reverse;
            n/=10;
        }
        return reverse;
    }

    public static boolean isArmstrong(int n){
        int count = countDigits(n);
        int sum = 0; // sum
        int temp = n;
        // sum of  every digits  with power of count.
        while(n > 0){
            int rem  = n%10;
            sum +=  (int) Math.pow(rem, count);
            n/=10;
        }
        return  sum == temp;
    }


    public static boolean isPrime(int number){
        if (number <=1) return false;
        for (int i = 2; i <=  Math.sqrt(number); i++) {
           if(number%i == 0)
               return  false;
        }
        return true;
    }
}

