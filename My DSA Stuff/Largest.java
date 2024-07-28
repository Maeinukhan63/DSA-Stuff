public class Largest {
    public static void main(String args[]){
        int arr[]={1,2,5,4,6,3,89,100,7,4,56,8,5,4};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>j){
                j=arr[i];
                
            }
        }
        System.out.println("the largest no in arr is :"+j);
    }
}
