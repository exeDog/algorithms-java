public class BinarySearch {

    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println(performBinary(ints,5));
    }

    private static int performBinary(int[]ints,int i){
        int low =0;
        int high = ints.length-1;


        while(high>=low){
            int middle = (high+low)/2;
            if(ints[middle] == i){
                return middle;
            }
            else if(ints[middle] < i){
                low =middle+1;
            }
            else if (ints[middle]> i){
                high =middle-1;
            }
        }
        return -1;
    }
}
