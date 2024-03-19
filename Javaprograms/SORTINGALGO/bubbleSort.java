public class bubbleSort {
    public static void bubbleS(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
               if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
   }
    }
    public static void main(String[] args) {
        int arr[] = {4,6,7,2,9,1,8};
        bubbleS(arr);
        printArr(arr);
    }  
}
