public class DifferenceStringStringBuilderAndBufer1 {

    public static void main(String[] args) {
        /* 1.String is immutable,
        String Buffer is mutable
        String Builder is mutable
        *
        * */
        String str=new String("abc");
        StringBuilder str1=new StringBuilder("hello");
        StringBuffer str2=new StringBuffer("java");

    //  String str=str +"hjh";//this will throw error as string objects are mutable
        String str9=str +"hjh";
        System.out.println(str);//abc
        System.out.println(str9);//abchjh

        System.out.println("-----------String builder------------------");
/*str1=str1+ " earth";//this will throw error as string builder has its own methods like append,
reverse,delete,length,charAt,substring,replace
        */
        str1=str1.append(" earth"); //str1 value changed after modification of object
        System.out.println(str1);//hello earth

        System.out.println("------------String buffer-----------------");

       /* str2=str2+" is interesting";
       * this will give error as string buffer has its own methods like append*/
        str2=str2.append(" is interesting");
        System.out.println(str2);//str2 value changed after modification of object




    }
}
