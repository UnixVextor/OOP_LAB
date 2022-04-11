package Pro4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Pro4_64010806_11 {
    public static void main(String[] args) {
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();
        
        try {
            File file = new File("WEEK11/Pro3/Salary.txt"); 
            Scanner readFile = new Scanner(file);
            while(readFile.hasNext()){
                String[] line = (readFile.nextLine().split(" "));
                processData(assistant, associate, full, line[2],Double.parseDouble(line[3]));
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.exit(0);
        }

        double totalAssistant = getTotal(assistant);
        double totalAssociate = getTotal(associate);
        double totalFull = getTotal(full);
        double totalFaculty = (totalAssistant + totalAssociate + totalFull);
        

        System.out.println("---------------------");
        System.out.printf("Total salary for assistant professors is $%.2f\n", totalAssistant);
        System.out.printf("Total salary for associate professors is $%.2f\n", totalAssociate);
        System.out.printf("Total salary for full professors is $%.2f\n", totalFull);
        System.out.printf("Total salary for all professors is $%.2f\n", totalFaculty);

        System.out.printf("Average salary for assistant professors is $%.2f\n", totalAssistant/assistant.size());
        System.out.printf("Average salary for associate professors is $%.2f\n", totalAssociate/associate.size());
        System.out.printf("Average salary for full professors is $%.2f\n", totalFull/full.size());
        System.out.printf("Average salary for all professors is $%.2f\n", totalFaculty/(assistant.size() + associate.size() + full.size()));
        
    }

    public static double getTotal(ArrayList<Double> list){
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    public static void processData(ArrayList<Double> assistant,ArrayList<Double> associate,ArrayList<Double> full,
                String ranking,double salary){
                    if(ranking.equals("assistant")){
                        assistant.add(salary);
                    }else if(ranking.equals("associate")) associate.add(salary);
                    else if(ranking.equals("full")) full.add(salary);
                }

}
