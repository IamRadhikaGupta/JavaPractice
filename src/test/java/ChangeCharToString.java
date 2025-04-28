public class ChangeCharToString {

    public static void main(String[] args) {
        char c='i';
        System.out.println(Character.toString(c));
        //another way not recommmended
        String g=c +"";
        System.out.println(g);

        //other ways -recommended
        String s=String.valueOf(c);
        System.out.println(s);
        //we can change integer and otehr data types also to string using String.valueOf
        int i=9;
        System.out.println(String.valueOf(i));

         float f=9f;
        System.out.println(String.valueOf(f));

    }
}
