package Pro3;

import java.io.*;
public class Pro3_64010806_11 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("WEEK11/Pro3/Salary.txt");

        // if(file.exists()){
        //     System.out.println("File " + file.getName() + " already exists");
        //     System.exit(0);
        // }

        String ranking = "";
        double salary;
        try (
            PrintWriter output = new PrintWriter(file);
        ){
            for (int i = 1; i <= 1000; i++) {
                output.print("FirstName" + i + " LastName" + i);
                ranking = getRank();
                salary = getSalary(ranking);
                output.printf(" " + ranking + " %.2f\n", salary);
            }
        }
    }

    public static String getRank(){
        String[] rank ={"assistant", "associate", "full"};
        return rank[(int)(Math.random() * rank.length)];
    }

    public static double getSalary(String rank){
        if(rank.equals("assistant")) return 50000.0 + (double)(Math.random() * 30001.0);
        else if(rank.equals("associate")) return 60000.0 + (double)(Math.random() * 50001.0);
        else return 75000 + (double)(Math.random() * 55001.0);
    }
}
