import java.util.*;
public class Pro2_64010806_3 {
    public static int[] merge(int[] list1,int[] list2){
        int num = 0;
        int[] imerge = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            imerge[num] = list1[i];
            num++;
        }
        for (int x = 0; x < list2.length; x++) {
            imerge[num] = list2[x];
            num++;
        }
        Arrays.sort(imerge);
        return imerge;
    }

    public static void main(String[] args) {
        int[] list1;
        int[] list2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter list1: ");
        String[] nlist1 = scan.nextLine().split(" ");
        
        list1 = new int[nlist1.length];
        for (int i = 0; i < nlist1.length; i++) {
            list1[i] = Integer.parseInt(nlist1[i]);
        }

        System.out.print("Enter list2: ");
        String[] nlist2 = scan.nextLine().split(" ");
        list2 = new int[nlist2.length];
        for (int i = 0; i < nlist2.length; i++) {
            list2[i] = Integer.parseInt(nlist2[i]);
        }

        int[] result = merge(list1, list2);
        System.out.print("The merged list ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println(list1);
        scan.close();
    }
    
}
