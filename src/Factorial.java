import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter number");

        int i =  new Scanner(System.in).nextInt();

        System.out.println(fact(i));

    }

    private static int fact(int number){

        if(number ==0)return 1;
        return number*fact(number-1);
    }
}
