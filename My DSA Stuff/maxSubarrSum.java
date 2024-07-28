public class maxSubarrSum {
    public static void subArrSum(int arr[]){
        int cs=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                cs=0;
                for(int k=i;k<=j;k++){
                    cs+=arr[k];
                }
                System.out.println(cs);
                if(cs>maxsum){
                    maxsum=cs;
                }
            }
        }
        System.out.println("the max sum is :"+maxsum);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subArrSum(arr);

    }
}
