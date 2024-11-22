///Створіть зубковий пірамідальний двовимірний масив цілих значень.
///  Виведіть його у звичайному та зворотньому порядку у вигляді піраміди.

public class Task1 {    
    public static void main(String[]args){
        int rows = 4;
        int revers = rows - 1;
        int[][] piramidka = new int[rows][];

        for (int i = 0; piramidka.length > i; i++) {
            piramidka[i] = new int[i + 1];
            for (int j = 0; piramidka[i].length > j; j++) {
                piramidka[i][j] = j + 1;
            }
        }
        for (int i = 0; piramidka.length > i; i++) {
            System.out.println();
            for (int j = 0; piramidka[i].length > j; j++) {
                System.out.print(piramidka[i][j]);
            }
        }
        System.out.println();
        for (int i = revers; piramidka.length > i; i--) {
            System.out.println();
            if(i == -1)
            {
                break;
            }
            for (int j = 0; piramidka[i].length > j; j++) {
                System.out.print(piramidka[i][j]);
            }
        }

    }   
}