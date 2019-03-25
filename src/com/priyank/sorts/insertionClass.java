package com.priyank.sorts;

public class insertionClass {

    public static void main(String[] args) {

        int[] numbers = { 32, 23, 45, 87, 92, 31, 19};

        insertionSort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void insertionSort(int[] numbers){
        for (int i=1;i<numbers.length;i++){
            int j = i;
            int current = numbers[i];

            while(j > 0  && numbers[j-1] > current){
                numbers[j] = numbers[j-1];
                j--;
            }
            numbers[j] =  current;

        }
    }
}
