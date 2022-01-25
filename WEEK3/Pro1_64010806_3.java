public class Pro1_64010806_3 {
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
        int count = 0;
        int run_number = 0;
        while(count < 100){
            run_number++;
            if(isprime(run_number) == true && palindrome(run_number) == true){
                count++;
                System.out.print(run_number+" ");
                if(count % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
