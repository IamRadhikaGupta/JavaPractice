public class StringIdempotentEg1 {
    public static void main(String[] args) {
//idempotency of string
     /*   Strings are immutable means once *
      string objects are created either by using string  literal or new operator
      value of object cannot
      be modified.If you modify string object new string object is created with modified contents. /
      */


        String str1 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println(str1);
       System.out.println(str2);

    }
}
