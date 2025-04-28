import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReturnAllDuplicatesFromString {
    public static void main(String[] args) {
        String ty = "abccvv";
        returnAllDuplicatesFromString(ty);
    }

    public static void returnAllDuplicatesFromString(String s) {
        char[] cArr = s.toCharArray();
        int count = 0;
        boolean isDuplicate = false;
        for (int i = 0; i <= cArr.length - 1; i++) {
            for (int j = i + 1; j <= cArr.length - 1; j++) {
                if (cArr[i] == cArr[j]) {
                    isDuplicate = true;
                    System.out.println(cArr[i]);
                }
            }
        }}}




