import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args){

        System.out.println("Please enter the number");

        int number = new Scanner(System.in).nextInt();

        int original,remainder,result=0;

        original =number;
       while(original!=0){
           remainder = original%10;
           result =  (int)Math.pow(original, 3);
           original = original/10;
       }

       if(result == number){
           System.out.println("Armstrong");
       }else{
           System.out.println("Not Armstrong");
       }

    }
}
