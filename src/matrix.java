import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {

        Scanner cmd = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of first matrix");

        int rowsOfFirstMatrix = cmd.nextInt();
        int columnsOfFirstMatrix = cmd.nextInt();
        int[][] aMatrix = new int[rowsOfFirstMatrix][columnsOfFirstMatrix];

        System.out.println("Enter the elements of first matrix");
        for (int i = 0; i<rowsOfFirstMatrix; i++) {
            for (int j = 0; j < columnsOfFirstMatrix; j++) {
                aMatrix[i][j] = cmd.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of the second matrix");
        int rowsOfSecondMatrix = cmd.nextInt();
        int columnsOfSecondMatrix = cmd.nextInt();
        // safety net - check order or each matrix, whether eligible for
        // multiplication or not w
        while (columnsOfFirstMatrix != rowsOfSecondMatrix){
       System.out.printf("Matrices with entered orders can't be multiplied with each other, "
         + "columnsOfFirstMatrix [%d] != rowsOfSecondMatrix [%d] %n", columnsOfFirstMatrix, rowsOfSecondMatrix);
        System.out.println("Enter the number of rows and columns of second matrix");
        rowsOfSecondMatrix = cmd.nextInt();
        columnsOfSecondMatrix = cmd.nextInt();
        }

        int[][] bMatrix = new int[rowsOfSecondMatrix][columnsOfSecondMatrix];
        System.out.println("Enter numbers of second matrix"); for (int i = 0; i < rowsOfSecondMatrix; i++) {
            for (int j = 0; j < columnsOfSecondMatrix; j++) {
                bMatrix[i][j] = cmd.nextInt();
            }
        }







    }
}
