public class Permutations {

    public static void main(String[] args) {

        String string = "DOG";

        permutation(string);
    }

    private static void permutation(String s){
        permutationComp("",s);
    }

    private static void permutationComp(String s,String word){
    if(word.isEmpty()){
        System.out.println(s+word);;
        }

        int length = s.length();
        for(int i =0;i<length;i++){
           permutationComp(s+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
        }
    }
}
