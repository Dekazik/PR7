/// Дано квадратну матрицю випадкових цілих значень. 
/// Ромірність матриці задає користувач. Знайдіть транспоновану матрицю.

/// у меня свет выключили(, но инет есть и музычка так что кайфик (я сделал пока 1 2 и вот 5 делаю)
import java.util.Random;
import java.util.Scanner;

public class Task5 {    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Введіть розмір матриці");
        int size = sc.nextInt();
        
        int[][] matrix = new int[size][size];
        int[][] matrixT = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = r.nextInt();
            }
        }
        
        System.out.println("Звичайна матриця: ");
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }
        System.out.println();
        
        System.out.println("Транспартована матриця: ");
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(matrixT[i][j] + "   ");
            }
        }
        sc.close();

    }
    
}