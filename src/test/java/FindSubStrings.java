public class FindSubStrings{

    public static void main(String[] args) {
        test("welcome to java");
    }

    public static void test(String str) {
        // String str1="welcome to java";
        String[] arr = str.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
    }}

