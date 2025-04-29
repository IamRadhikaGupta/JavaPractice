import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        //anagram means a word or phrase that is made by arranging
        // the letters of another word or phrase in a different order
        //‘Worth’ is an anagram of ‘throw’.
        checkAnagram("worth","throw");
    }
    public static void checkAnagram(String s,String s1){
        char[] c1=s.toCharArray();
       boolean isAnagram=false;
    //   System.out.println(s1.indexOf('h'));
      for(int i=0;i<=c1.length-1;i++){
        String s4=String.valueOf(c1[i]);
            if(s1.contains(s4)==false) {
                isAnagram = true;
            }
            }
            if(isAnagram==true){
                System.out.println("not anagram");
            }
            else {
                System.out.println("anagram");
            }
    }}


