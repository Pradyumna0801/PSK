//Linear Search
public class linearsearch {

    public static int lS(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=5;

        int x=lS(arr, key);
        if(x==-1){
            System.out.println("not found");
        }else{
            System.out.println("element at index: "+x);
        }
    }  
}
