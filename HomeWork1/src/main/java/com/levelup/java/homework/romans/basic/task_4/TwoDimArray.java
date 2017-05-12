package main.java.com.levelup.java.homework.romans.basic.task_4;

import java.util.Scanner;

public class TwoDimArray {
   public static void main (String s[]) {
       int num_rows = 0;
       int num_columns = 0;
       final char rectangle = '\u0860';

       Scanner in = new Scanner(System.in);
       do {
           System.out.print("Введите количество строк в изначальной матрице: ");
           if (in.hasNextInt()) num_rows = in.nextInt();
           else in.next();
       } while (num_rows <= 0);

       do {
           System.out.print("Введите количество колонок в изначальной матрице: ");
           if (in.hasNextInt()) num_columns = in.nextInt();
           else in.next();
       } while (num_columns <= 0);
       in.close();

       ++num_columns;
       ++num_rows;

       char twoDimArray[][] = new char[num_rows][num_columns];

       int razd_row = 3;
       int razd_col = 4;

       int dim_norm = Math.min(num_columns%2==0 ? num_columns/2 : num_columns/2+1, num_rows%2==0 ? num_rows/2 : num_rows/2+1);

       for (int i=0; i < num_rows; i++) {
           for (int j=0; j < num_columns; j++) {

               if (i == j){
                   twoDimArray[i][j] = '1';

               }


              if (num_rows > num_columns) {
                  if (j < num_columns_norm & i == j) {
                      twoDimArray[i][j] = '1';}
                  else if (i == j & j > num_columns_norm) {
                      twoDimArray[i][j] = '1';}
                      else {
                      twoDimArray[i][j] = '0';}
              }
              else if (num_rows < num_columns) {
                  if (i == j & i < num_rows_norm) {
                      twoDimArray[i][j] = '1';}
                      else {
                      twoDimArray[i][j] = '0';}
              }
              System.out.print(twoDimArray[i][j] + " ");
           }
           System.out.println();
       }
    }
}
