import java.util.*;
public class Pro2_64010806_3 {
    public static int[] merge(int[] list1,int[] list2){
        int[] imerge = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            imerge[i] = list1[i];
        }
        for (int x = 0; x < list2.length; x++) {
            imerge[list1.length + x] = list2[x];
        }
        Arrays.sort(imerge);
        return imerge;
    }

    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        
        System.out.print("Enter list1: ");
        int nlist1 = sacn.nextInt();
        try {
        int[] list1 = new int[nlist1];
        for(int i=0; i<nlist1;i++){
                list1[i] = sacn.nextInt();
            }
            System.out.print("Enter list2: ");
            int nlist2 = sacn.nextInt();
            int[] list2 = new int[nlist1];
            for(int i=0; i<nlist2;i++){
                list2[i] = sacn.nextInt();
            }

        int[] result = merge(list1, list2);
        System.out.print("The merged list ");
        for (int i = 1; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        } catch (Exception e) {
            System.out.println("Please enter with the number since 1");
        }
    }
    
}
