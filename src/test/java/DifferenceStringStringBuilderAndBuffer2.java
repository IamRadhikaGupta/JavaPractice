public class DifferenceStringStringBuilderAndBuffer2 {

    public static void main(String[] args) {
        /* 2.String objects can be created either by string literal or by using new operator
* String Builder objects can be created only through new operator
* string buffer objects can be created only through new operator */

        String str="hello java";
     //   StringBuilder sbr="how are you?"; //throws error
        //java: incompatible types: java.lang.String cannot be converted to java.lang.StringBuilder
        //StringBuffer sbuffer="india";//throws error

        StringBuilder builder=new StringBuilder("mercury");
        StringBuffer buffer=new StringBuffer("earth");

        System.out.println(builder);
        System.out.println(buffer);
    }
}
