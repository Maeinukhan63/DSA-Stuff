public class trappedWater {
    public static int trappingWater(int arr[]){
       
        //left max biundary
        int n=arr.length;
         int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        //right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        //for water level
        int trappedWater=0;
        for(int i=0;i<n;i++){
           int  waterLvl=Math.min(rightMax[i],leftMax[i]);
            trappedWater+=waterLvl-arr[i];
        }
        return trappedWater;
    }
	public static void main(String[] args) {
		int arr[]={4,2,0,6,3,2,5};
		System.out.println(trappingWater(arr));
	}
}
