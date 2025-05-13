public class IsPrimeNo {
    public static void main(String[] args) {
        is_prime_no(11);
    }
    public static void is_prime_no(int n1){
        /*approach
         * take number
         * should not be divisible by any number other than 1 and itself
         * */
        boolean flag=true;
        for(int i=2;i<n1;i++){
            if(n1%i==0){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println(n1 + "is prime no");
        }
        else{
            System.out.println(n1 + "is not prime no");
        }


    }
}
