public class sum2d {
    public static int Count(int arr[][]){
        int sum=0;
        int i=2;
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[i][j];
        }
        return sum;
        
    }
    public static void main(String args[]){
        int arr[][]={{1,4,9},
                     {11,4,3},
                    {2,2,3}};
        
        System.out.println(Count(arr));
    }
}
