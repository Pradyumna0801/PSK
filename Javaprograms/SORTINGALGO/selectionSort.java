public class selectionSort {
    public static void selectionS(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos =i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] >arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int arr[] = {22,51,93,17,26,33,1,8};
        selectionS(arr);
        printArr(arr);
    }
    
}
