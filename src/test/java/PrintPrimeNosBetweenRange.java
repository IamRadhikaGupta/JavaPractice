public class PrintPrimeNosBetweenRange {
    /* Approach-//11-20
    * take number starting from n1
    * 11 divie by 2 to 10 ..not div*/

    public static void main(String[] args) {
        printPrimeNo(5,11);
    }
    public static void printPrimeNo(int n1,int n2){
        for(int i=n1;i<=n2;i++){
            boolean flag=false;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(i + "is a prime no");
            }
        }
    }
}
