public class StringIdempotentEg2 {
    public static void main(String[] args) {
//immutability of string
     /*   Strings are immutable means once *
      string objects are created either by using string  literal or new operator
      value of object cannot
      be modified.If you modify string object new string object is created with modified contents. /
      */
        String str1 = new String("Hello");
        String str2 = str1.concat(" World");
        System.out.println(str1);//str1 remains hello even after concat
       System.out.println(str2);//new modified value is assigned to str2

        String str11 = new String("Hello");
      //  String str11=str11.replace("hel","wel");
        //error thrown java: variable str11 is already defined in method main(java.lang.String[])

        String str12=str11.replace("Hel","Wel");
        System.out.println(str11);//Hello
        System.out.println("--------------------");
        System.out.println(str12);//Wello

    }
}
