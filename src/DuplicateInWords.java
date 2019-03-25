import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateInWords {

    public static void main(String[] args) {

        System.out.println("Please enter the word");

        String s=  new Scanner(System.in).next();

        Map<Character,Integer> result  = duplicateChecker(s);

        Set<Map.Entry<Character,Integer>> entryMap =  result.entrySet();
        for (Map.Entry<Character,Integer> m : entryMap){
            System.out.printf("%s: %d %n",m.getKey(),m.getValue());
        }
    }

    private static Map<Character,Integer> duplicateChecker(String s){

        char[] charStr = s.toCharArray();
        Map<Character,Integer> mapper = new HashMap<>();

        for(char c: charStr){
            if(mapper.containsKey(c)){
                mapper.put(c,mapper.get(c)+1);
            }
            else{
                mapper.put(c,1);
            }
        }
        return mapper;
    }
}
