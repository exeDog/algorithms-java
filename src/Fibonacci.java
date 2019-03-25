import java.util.Scanner;

public class Fibonacci {

    public static void main(String[]args){

        System.out.println("Please enter a number");
        int number = new Scanner(System.in).nextInt();
        for(int i=1;i<number;i++){
            System.out.println(fibo(i));
        }
    }

    private static int fibo(int i){
        if(i == 1 || i == 2){
            return i;
        }
        return fibo(i-1)+fibo(i-2);
    }



}
