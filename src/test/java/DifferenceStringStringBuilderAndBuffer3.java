public class DifferenceStringStringBuilderAndBuffer3 {
    public static void main(String[] args) {
        /* 2.String objects can be created either by string literal or by using new operator
* String Builder objects can be created only through new operator
* string buffer objects can be created only through new operator */

        /* 3.String objects are threadsafe
        * StringBuilder objects are not threadsafe
        * StringBuffer objects are threadsafe*/

        /* 4.String objects are stored in string constant pool and string heap memory
        * StringBuilder objects are stored only in heap memory
        * StringBuffer objects are stored only in heap memory
        *
        * 5.String objects are slower
        * StringBuilder objects are faster
        * StringBuffer objects are slower */



    }
}
