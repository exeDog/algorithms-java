package com.priyank.sorts;

public class quick {

    public static void main(String[] args) {

        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
//        3,5,6,1,8,7,2,4
//        3,1,6,5,8,7,2,4
//        3,1,2,5,8,7,6,4
//        3,1,2,4,8,7,6,5
//        3,1,2,4,5,7,6,8


        quickSort(unsorted,0,unsorted.length-1);

        for (int i : unsorted) {
            System.out.println(i);
        }

    }

    private static void quickSort(int[]arr,int first,int last){
        if( first < last){
            int partionIndex = partition(arr,first,last);

            quickSort(arr,first,partionIndex-1);
            quickSort(arr,partionIndex+1,last);
        }
    }

    private static int partition(int[]arr,int first,int last){

        int pivot = arr[last];
        int i = first-1;

        for(int j =first;j<last;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last]= temp;

        return i+1;
    }
}
