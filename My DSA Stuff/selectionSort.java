public class selectionSort {
    public static void selectSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }


    public static void main(String args[]){
        int arr[]={2,1,5,6,3,7,4,9,8,0};
        selectSort(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");

        }   
    }
}
