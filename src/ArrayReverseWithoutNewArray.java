import java.util.Arrays;

public class ArrayReverseWithoutNewArray {

    public static void main(String[] args) {

        int[] arr = {10,15,20};

        int [] result = reverse(arr);

        for (int i :arr){
            System.out.println(i);
        }
    }

    private static int[] reverse(int[] arr){

        if(arr==null || arr.length < 2){
            return arr;
        }

        int length = arr.length;
        for(int i =0;i<length/2;i++){
            int temp =  arr[i];
            arr[i] = arr[length -1-i];
            arr[length-1-i] = temp;
        }

        return arr;
    }
}
