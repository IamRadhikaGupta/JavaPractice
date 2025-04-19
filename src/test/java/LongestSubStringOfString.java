public class LongestSubStringOfString {
    public static void main(String[] args) {
        String str="aaa test radhika";
       String[] parts= str.split(" ");
        int[] arr=new int[parts.length];
       for(int i=0;i<=parts.length-1;i++){
           arr[i]=parts[i].length();//arr[0],arr[1],arr[2]
       }

       int max=arr[0];
       for(int k=0;k<=arr.length-1;k++)
       {
           for(int l=0;l<=arr.length-1;l++){
               if(arr[k]>max){
                   int temp=arr[k];
                   arr[k]=max;
                   max=temp;
               }
           }
       }
       System.out.println(max);
       for(int p=0;p<=parts.length-1;p++){
           if(parts[p].length()==max){
               System.out.println(parts[p] + " is the largest substring of the given string");
           }
       }
    }
}
