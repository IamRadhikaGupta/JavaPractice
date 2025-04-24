import java.util.HashMap;
import java.util.Map;

public class CharacterRepeatedHighestTimesInString {
    public static void main(String[] args) {
        countHighest("radhika");
    }

    public static void countHighest(String s){
        /*approach
        * convert string to char array
        * create a map of each character of array and value as count
        * if map contains that character as key add count value by 1
        * if not add the character to map
        * */

        char[] cArr=s.toCharArray();int count=1;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(Character c:cArr){
            if(map.containsKey(c)){
                map.put(c,count+1);
            }
            else{
                map.put(c,count);
            }
        }

        //Print map
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+"---------" + entry.getValue());
        }


        }

    }

