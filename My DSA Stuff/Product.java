public class Product {
public static int Fact(int n){
    int fact0=1;
    for(int i=1;i<=n;i++){
        fact0*=i;
    }
    // System.out.println(fact0);
    return fact0;

} 
public static int Bincof(int n,int r){
    int fac_n=Fact(n);
    int fac_r=Fact(r);
    int fac_nmr=Fact(n-r);
    int bino=(fac_n)/(fac_r*fac_nmr);
    return bino;



}
public static void main(String args[]){
    // Bincof(5,2);
    System.out.println(Bincof(8,5));

}
}
