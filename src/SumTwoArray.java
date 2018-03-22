import java.util.Scanner;

public class SumTwoArray {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        int arr1[][] = new int[2][2];
        int arrsum[][] = new int[2][2];

        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print("Array[" + row + "][" + column + "] = ");
                arr[row][column] = scanner.nextInt();
            }
        }

        for (int row = 0; row < arr1.length; row++) {
            for (int column = 0; column < arr1[row].length; column++) {
                System.out.print("Array1[" + row + "][" + column + "] = ");
                arr1[row][column] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arrsum.length; i++) {
            for (int j = 0; j < arrsum.length; j++) {
                arrsum[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        for (int i = 0; i < arrsum.length; i++) {
            for (int j = 0; j < arrsum.length; j++) {
                System.out.print(arrsum[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
