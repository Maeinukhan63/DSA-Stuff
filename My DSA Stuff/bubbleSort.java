public class bubbleSort {


    public static void bubble1Sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,6,3,0,2,9,7,1,8};
        bubble1Sort(arr);

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
