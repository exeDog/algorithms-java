package com.priyank.sorts;

public class bubble {

    public static void main(String[] args) {
        int[] numbers =  {1,5,3,4,8,2,6,45,32,89,13};

        sort(numbers);

        print(numbers);
    }

    private static void sort(int[] numbers){

        int n = numbers.length;
        for(int i =0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    private static void print(int[] numbers){
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
