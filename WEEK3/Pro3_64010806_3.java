import java.util.*;
public class Pro3_64010806_3 {
    static boolean checkrow(int[][] matrix,int row,int valuetocheck){
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[row][i] != valuetocheck)
                return false;
            
        }
        return true;
    }
    static boolean checkcolumn(int[][] matrix,int column,int valuetocheck){
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][column] != valuetocheck)
                return false;
            
        }
        return true;
    }
    static boolean checkdiagonal(int[][] matrix,int column,int row,int valuetocheck,int length){
        for (int i = 0; i < length; i++) {
            if(matrix[row+i][column+i] != valuetocheck)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = scan.nextInt();
        scan.close();
        if(size > 1){
        boolean notSame = true;
        int[][] matrix = new int[size][size];
        // print matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = ran.nextInt(2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        //check row of matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(checkrow(matrix, j, i) == true){
                    System.out.println("All " + i + "s" +" on row " + j);
                    notSame = false;
                }
            }
        }
        if(notSame == true) {
            System.out.println("No same numbers on a row");
        }
        notSame = true;

        //check column of matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(checkcolumn(matrix, j, i) == true){
                    System.out.println("All " + i + "s" +" on column " + j);
                    notSame = false;
                }
            }
        }
        if(notSame == true) {
            System.out.println("No same numbers on a column");  
        }
        notSame = true;
        
        //check superdiagonal 
        for (int i = 0; i < 2; i++) {
            if(checkdiagonal(matrix, 0, 1, i,matrix.length-1)== true){
                    System.out.println("All " + i + "s" +" on the subdiagonal ");
                    notSame = false;
            }
        }
        if(notSame == true) {
            System.out.println("No same numbers on the subdiagonal");
        }
        notSame = true;

        // check diagonal
        for (int i = 0; i < 2; i++) {
            if(checkdiagonal(matrix, 0, 0, i,matrix.length)== true){
                    System.out.println("All " + i + "s" +" on the diagonal ");
                    notSame = false;
            }
        }
        if(notSame == true) {
            System.out.println("No same numbers on the diagonal");
        }
        notSame = true;

        //check subdigonal
        for (int i = 0; i < 2; i++) {
            if(checkdiagonal(matrix, 1, 0, i,matrix.length-1)== true){
                    System.out.println("All " + i + "s" +" on the superdiagonal");
                    notSame = false;
            }
        }
        if(notSame == true) {
            System.out.println("No same numbers on the superdiagonal");
        }
        }else{
            System.out.println("the matrix have only 2X2");
        }
    }
}
