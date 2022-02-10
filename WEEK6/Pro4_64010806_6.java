import java.util.*;
public class Pro4_64010806_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
            };
        double tax;
        System.out.println("Final Status");
        System.out.println("    [0] -Single filter");
        System.out.println("    [1] -Married jointly or qualifying widow(er)");
        System.out.println("    [2] -Married seperately");
        System.out.println("    [3] -Head of household");
        System.out.print("Enter the filling status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double taxable = input.nextDouble();
        input.close();
        
        if(taxable <= brackets[status][0]){
            tax = taxable * rates[0];
        }
        else if (taxable <= brackets[status][1]) {
            tax = (brackets[status][0] * rates[0]) + (taxable - brackets[status][0]) * rates[1];
        }
        else if (taxable <= brackets[status][2]){
            tax = (brackets[status][0] * rates[0]) +
                  (brackets[status][1] - brackets[status][0]) * rates[1] +
                  (taxable - brackets[status][1]) * rates[2];
        }
        else if (taxable <= brackets[status][3]){
            tax = (brackets[status][0] * rates[0]) +
                  (brackets[status][1] - brackets[status][0]) * rates[1] +
                  (brackets[status][2] - brackets[status][1]) * rates[2] +
                  (taxable - brackets[status][2]) * rates[3];
        }
        else if (taxable <= brackets[status][3]){
            tax = (brackets[status][0] * rates[0]) +
                  (brackets[status][1] - brackets[status][0]) * rates[1] +
                  (brackets[status][2] - brackets[status][1]) * rates[2] +
                  (brackets[status][3] - brackets[status][2]) * rates[3] +
                  (taxable - brackets[status][3]) * rates[4];
        }
        else{
            tax = (brackets[status][0] * rates[0]) +
                  (brackets[status][1] - brackets[status][0]) * rates[1] +
                  (brackets[status][2] - brackets[status][1]) * rates[2] +
                  (brackets[status][3] - brackets[status][2]) * rates[3] +
                  (brackets[status][4] - brackets[status][3]) * rates[4] +
                  (taxable - brackets[status][4]) * rates[5];
        }
        System.out.println("Tax is " + tax);
    } 
}
