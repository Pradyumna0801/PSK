
public class demo{
public static int getLargest(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
    }
    return largest;

}

public static void main(String[] args) {
    int arr[]={2,3,5,4,6,10,1};
    int x=getLargest(arr);
    System.out.println("largest no is: "+x);


}
}