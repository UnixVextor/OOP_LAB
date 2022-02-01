import java.util.*;
public class Pro3_64010806_4 {
    static boolean palindrome(int n){
        int temp = n;
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + (n%10);
            n = n/10;
        }
        if(rev == temp) return true;
        else return false;
    }
    static boolean isprime(int n){
        int c = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0)
            c++;
        }
        if(c == 2) return true;
        else if(c==1 && n<10 && n>1) return true;
        else return false;
    }
    public static void main(String[] args) {
        double[] randomNumber = new double[1000];
        StopWatch stopwatch = new StopWatch();
        System.out.println("Creating a list containing 1000 elements,");
        for (int i = 0; i < 1000; i++) {
            randomNumber[i] = Math.random() * 1000;
            System.out.format("%.2f  ",randomNumber[i]);
            if((i+1)%5 == 0){
                System.out.println();
            }
        }
        System.out.println("List created. \nSorting stopwatch starts...");
        stopwatch.start();
        Arrays.sort(randomNumber);
        for (int i = 0; i < 1000; i++) {
            System.out.format("%.2f  ",randomNumber[i]);
            if((i+1)%5 == 0){
                System.out.println();
            }
        }
        stopwatch.stop();
        System.out.println("Sorting stopwatch stoped.");
        System.out.println("The sort time is " + stopwatch.getElapsedTime() + " milliseconds.");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 100 PalindromPrime...");
        stopwatch.start();
        int count=0;
        for(int i = 0;count<100;i++)
        {
            if(palindrome(i) && isprime(i))
            {
                count++;
                System.out.print(i);
                if (count % 10 == 0) {
                    System.out.println();
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
        stopwatch.stop();
        System.out.println(" ");
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is "+stopwatch.getElapsedTime()+" milliseconds.");
    }
}
