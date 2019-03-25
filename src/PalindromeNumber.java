import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args){

        System.out.println("Please enter a number to check");

        int number =  new Scanner(System.in).nextInt();

        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int i){

        int palinDrome =  i;
        int reverse =0;

        while(palinDrome != 0){
            int reminder = palinDrome %10;
            reverse = reverse*10 + reminder;
            palinDrome = palinDrome/10;
        }

        return i == reverse;
    }
}
