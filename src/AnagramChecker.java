public class AnagramChecker {

    public static void main(String[] args) {

        System.out.println(anagram("aaba","abaa"));
        System.out.println(anagram("aaba","abaaa"));
    }

    private static boolean anagram(String main, String anagram){

        if(main.length() != anagram.length()){
            return false;
        }

        char[]chars = main.toCharArray();

        for(char c: chars){
            int index = anagram.indexOf(c);

            if(index!= -1){
                anagram = anagram.substring(0,index) + anagram.substring(index+1);
            }
            else{
                return false;
            }
        }
        return anagram.isEmpty();
    }
}
