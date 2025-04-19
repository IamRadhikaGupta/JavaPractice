import java.util.HashMap;

public class FrequencyOfEachElementInArray {
    public static void main(String[] args) {
        int[] abc1={11,21,11,21,11,3};
        frquencyOfElement(abc1);
    }
   public  static void frquencyOfElement(int[] abc) {
int n=abc.length;
System.out.println(n);
     //  abc=new int[n];
      /* abc[0]=1;
       abc[1]=3;
       abc[2]=3;
       abc[3]=1;
       abc[4]=1;*/

       HashMap<Object,Integer> map=new HashMap<Object,Integer>();


       for(int i=0;i<=abc.length-1;i++){
           int count=0;
           for(int j=i+1;j<=abc.length-1;j++){
               if(abc[i]==abc[j]){
                   count ++;
               }
               map.put(abc[i],count);
           }

           System.out.println(map);
       }















    }
}
