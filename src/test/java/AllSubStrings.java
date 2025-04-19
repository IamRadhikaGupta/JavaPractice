public class AllSubStrings {
    public static void main(String[] args) {
       // String str="abc"; //a aa aaa

     //   String s="cust456";//0123456
     /*   s.substring(4,7);
        System.out.println( s.substring(4,7));//begin index,end index-1*/
       /* Input :  s = “abc”
        Output :  “a”, “ab”, “abc”, “b”, “bc”, “c” */
     /*   System.out.println(str.substring(0,1)); //begin index,en index-1 0,0 //a
        System.out.println(str.substring(0,2));//ab
       System.out.println(str.substring(0,3));//abc
        System.out.println(str.substring(1,2));//b
        System.out.println(str.substring(1,3));//bc
        System.out.println(str.substring(2));//c */
        String str1="abc"; int n=str1.length();
        for(int i=0;i<n;i++){ //i=0//j=1 n=3
            for(int j=i+1;j<=n;j++){//j=2 j=3 //01 02 03 a ab abc //b //bc
                System.out.println(str1.substring(i,j)); //01 02 03 //12 13 //23
            }
        }





    }
}
