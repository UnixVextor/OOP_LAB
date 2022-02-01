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
    public static void main(String[] args) {
        Random random = new Random();
        float[] randomNumber = new float[1000];
        StopWatch stopwatch = new StopWatch();
        System.out.println("Creating a list containing 1000 elements,");
        for (int i = 0; i < 1000; i++) {
            randomNumber[i] = random.nextFloat(1000);
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
        int countPalindrom = 1;
        int runNumber = 0;
        System.out.println("The palindromPrime stopwatch starts..");
        stopwatch.start();
        System.out.println("Creating 1000 PalindromPrime...");
        while(countPalindrom < 1000){
            runNumber++;
            if(palindrome(runNumber) == true){
                countPalindrom++;
                System.out.print(runNumber+" ");
                if(countPalindrom % 10 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("PalindromePrime created.");
        stopwatch.stop();
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is " + stopwatch.getElapsedTime() + " milliseconds.");
    }
}
