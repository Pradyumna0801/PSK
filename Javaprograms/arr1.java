//Array Implementation 
import java.util.*;
public class arr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length : ");
        int n=sc.nextInt();
        int a[]=new int[n];//declaration    	 
        System.out.print("Enter " + n + " Element to Store in Array :\n");
            for(int i=0; i<n; i++)
            {
               a[i] = sc.nextInt();
            }   
            System.out.print("Elements in Array are :\n");
            for(int i=0; i<n; i++)
            {
               System.out.print(a[i] + "  ");
            }
            sc.close();
    }
}
