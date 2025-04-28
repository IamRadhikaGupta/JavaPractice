//ip
public class RemoveGivenCharFromString {
    public static void main(String[] args) {
        char toRemove='c';

        String str="avcvc";
        removeGivenCharFromString(str,toRemove);
    }

    public static  void removeGivenCharFromString(String s,Character c1){
        char[] cArr=s.toCharArray();
        String s1=String.valueOf(c1);

        String newString=s.replaceAll(s1,"");
        System.out.println(newString);
    }

}
