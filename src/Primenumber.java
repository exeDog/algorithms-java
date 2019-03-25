import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args){

        System.out.println("Please enter a number to check");

        int number = new Scanner(System.in).nextInt();

        System.out.println(checkNumber(number));
    }

    private static String checkNumber(int number){

        if(number == 2 || number == 3){
            return "Prime";
        }

        if(number % 2==0){
            return "Not prime";
        }
        int sqrt = (int)Math.sqrt(number)+1;
        for(int i =3;i<sqrt;i+=2){
            if(number % i ==0) return "Not Prime";
        }

        return "Prime";

    }
}
