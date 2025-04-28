import java.util.*;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String s="abcabu"; //expected output c
      //  boolean flag=false;
        int count=1;//d
        char[] cArr=s.toCharArray();
        /*Approach-
        find length of string,convert in array
         flag if char is not repeated and print it*/

        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(Character c:cArr){
            if(map.containsKey(c)){
            map.put(c,count+1); }
            else{
                map.put(c,count);
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for(Integer c1:map.values()){
         list.add(c1);
        }
        Collections.sort(list);

        for(Map.Entry entry :map.entrySet()){
            System.out.println(entry.getKey()+ "-------"+entry.getValue());
        }
    }}





