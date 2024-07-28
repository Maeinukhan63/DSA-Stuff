public class binTodeci {
    public static void binDeci(int binNum){
        int pow=0;
        int res=0;
        int temp=binNum;
        while(binNum>0){
            int lD=binNum%10;
            res=res+(lD*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("the decimal no of:"+temp+ " = "+res);

    }
    public static void main(String args[]){
        binDeci(111111);

    }
}
