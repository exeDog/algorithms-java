import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        System.out.println("Please enter string");

        String testStr = new Scanner(System.in).next();

        System.out.println(palin(testStr));

    }

    private static boolean palin(String testStr){

        String reverse = "";

        int length = testStr.length();
        for(int i =length-1;i>=0;i--){
            reverse = reverse + testStr.charAt(i);
        }

        return testStr.equals(reverse);
    }
}
