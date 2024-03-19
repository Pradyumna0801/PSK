//array Insertions Deletion
import java.util.*;
public class arr3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter array length: ");
        int n=s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " Element to Store in Array :\n");
            for(int i=0; i<n; i++)
            {
               arr[i] = s.nextInt();
            }   
            System.out.print("Elements in Array are :\n");
            for(int i=0; i<n; i++)
            {
               System.out.print(arr[i] + "  ");
            }
            System.out.println("\nYou want to Modify array press 1 and exit press 0");
            int m=s.nextInt();

            if(m==0){
                System.exit(0);
            }else if(m==1){
                System.out.println("press 2 for (Insertion) OR press 3 for (Deletion)");
                int op = s.nextInt();
                if(op==2){ //INSERTION
                System.out.print("Enter the element to insert: ");
                   int newValue = s.nextInt();
                System.out.print("Enter the index to insert at: ");
                    int index = s.nextInt();
                    if (index < 0 || index > arr.length) {
                        System.out.println("Invalid index!");
                        return;
                       
                    }
                  
                    int[] newArray = new int[arr.length + 1];
                    System.arraycopy(arr, 0, newArray, 0, index);
                    newArray[index] = newValue;
                    System.arraycopy(arr, index, newArray, index + 1, arr.length - index);
                    
                    System.out.println("Array after insertion: " + Arrays.toString(newArray));
                } else if(op==3){//DELETION
                    System.out.print("Enter the index to delete at: ");
                    int index = s.nextInt();
                    
                    if (index < 0 || index >= arr.length) {
                        System.out.println("Invalid index!");
                        return;
                    }

                    int[] newArray = new int[arr.length - 1];
                    System.arraycopy(arr, 0, newArray, 0, index);
                    System.arraycopy(arr, index + 1, newArray, index, arr.length - index - 1);
                    
                    System.out.println("Array after deletion: " + Arrays.toString(newArray));
                } else {
                    System.out.println("Invalid operation!");
                 
                }
            }
        }
    }

    
