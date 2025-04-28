import java.util.HashMap;
//in progress
public class FirstNonRepeatedCharacterFromString {
    public static void main(String[] args) {
        String ty = "aabccvv";
        firstNonRepeatedCharacterFromString(ty);
    }

    public static void firstNonRepeatedCharacterFromString(String s) {
        char[] cArr = s.toCharArray();
        int count = 0;
       // HashMap<>
        boolean notRepeated = false;
        for (int i = 0; i <= cArr.length - 1; i++) {
            for (int j = i + 1; j <= cArr.length - 1; j++) {
                if (cArr[i] == cArr[j]) {
                    continue;
                }
            }
        }}}




