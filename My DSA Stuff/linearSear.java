public class linearSear {
    public static int linearSer(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int marks[]={1,2,4,5,6,7,9,10,11,78};
        int key=18888;
        int index=linearSer(marks, key);
        if(index==-1){
        System.out.println("key is not found");

        }else{
        System.out.println("key is found and index is:"+index);

        }
    }
}
