import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        System.out.println("Enter first number");
        int n1 =  new Scanner(System.in).nextInt();

        System.out.println("Enter second number");
        int n2 = new Scanner(System.in).nextInt();


        System.out.println(GCDfunction(n1,n2));
        System.out.printf("The LCM is %d",LCMfunction(n1,n2,GCDfunction(n1,n2)));

    }

    private static int GCDfunction(int n1, int n2){

        if(n2 ==0){
            return n1;
        }

        return GCDfunction(n2,n1%n2);

    }

    private static int LCMfunction(int n1, int n2, int gcd){
        return (n1 * n2)/gcd;
    }
}
