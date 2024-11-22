/// Дано двовимірний масив випадкових чисел з плаваючою крапкою.
/// Для усіх елементів з непарним індексом строки або стовпця замінити елемент на його квадратний корінь.
/// Вивести такий масив у термінал.
/// 
import java.util.Random;

public class Task2 {    
    public static void main(String[]args){
        Random r = new Random();
        int rows = 3;
        int columns = 2;
        double[][] arr = new double[rows][columns];
        

        for (int i = 0; rows > i; i++) {
            for (int j = 0; columns > j; j++) {
                arr[i][j] = r.nextDouble() * 100; //типо от 0 до 100 рандомит 
            }
        }

        for (int i = 0; rows > i; i++) {
            for (int j = 0; columns > j; j++) {
                if(i % 2 != 0 || j % 2 != 0)
                {
                    arr[i][j] = Math.sqrt(arr[i][j]);
                }
            }
        }
        
        for (int i = 0; arr.length > i; i++) {
            System.out.println();
            for (int j = 0; arr[i].length > j; j++) {
                System.out.printf( "%.2f   ", arr[i][j]);
                
                //вывод сократил до 100х а то много циферок)
                //System.out.print(arr[i][j] + "    "); вот без
            }
        }
        

    }   
}