import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        List<String> listOfStrings = new ArrayList<>(
                Arrays.asList("a","a","a","b","d","e"));

        List<Integer> result =  removeDuplicates(list);
        List<String> resultForStrings = removeOldSchool(listOfStrings);

        for(int t:result){
            System.out.println(t);
        }

        for(String s : resultForStrings){
            System.out.println(s);
        }
    }

    private static <T>List<T> removeDuplicates(List<T> arr){

       return arr.stream().distinct().collect(Collectors.toList());
    }

    private static <T>List<T> removeOldSchool(List<T>arr){

        List<T> copyOfList = new ArrayList<>();

        for(T t: arr){
            if(!copyOfList.contains(t)){
                copyOfList.add(t);
            }
        }
        return copyOfList;
    }
}
