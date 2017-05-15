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

       int norm_mat = Math.min(num_columns, num_rows);
       int norm_dim = norm_mat%2==0 ? norm_mat/2 : norm_mat/2+1;

       ++num_columns;
       ++num_rows;

       char twoDimArray[][] = new char[num_rows][num_columns];

       int razd_row = 3-1;
       int razd_col = 4-1;

       int sdvig_row1 = 0;
       int sdvig_row2 = 0;
       int sdvig_col1 = 0;
       int sdvig_col2 = 0;

       int index_i = 0;

       if (razd_row <= norm_dim){
           sdvig_row1 = 1;
       } else sdvig_row2 = 1;
       if (razd_col <= norm_dim){
           sdvig_col1 = 1;
       } else sdvig_col2 = 1;

       for (int i=0; i < num_rows; i++) {
           if (i < razd_row){
               index_i = i;
           }else if (i > razd_row){
               index_i = i+1;
           for (int j=0; j < num_columns; j++) {

               if (i < norm_dim + sdvig_row1 & j < norm_dim + sdvig_col1){
                   twoDimArray[index_i][j] = '1';
               }

               if (j < razd_col & i < razd_row) {
                   if (i == j){
                       twoDimArray[i][j] = '1';
                       twoDimArray[num_rows-1 - i][j] = '1';
                       twoDimArray[num_rows-1 - i][num_columns-1 - j] = '1';
                       twoDimArray[i][num_columns-1 - j] = '1';
                   } else twoDimArray[i][j] = '0';
               }
               else if (j == razd_col) twoDimArray[i][j] = rectangle;
               else if (j > razd_col){
                   if (i == j-1 & i < norm_dim & j < norm_dim ){
                       twoDimArray[i][j] = '1';
                       twoDimArray[num_rows-1 - i][j] = '1';
                       twoDimArray[num_rows-1 - i][num_columns-1 - j] = '1';
                       twoDimArray[i][num_columns-1 - j] = '1';
                   } else twoDimArray[i][j] = twoDimArray[i][j]=='1' ? '1' : '0';
               }


               if (i == j & i < norm_dim & j < norm_dim ){
                   twoDimArray[i][j] = '1';
                   twoDimArray[num_rows-1 - i][j] = '1';
                   twoDimArray[num_rows-1 - i][num_columns-1 - j] = '1';
                   twoDimArray[i][num_columns-1 - j] = '1';
               } else twoDimArray[i][j] = twoDimArray[i][j]=='1' ? '1' : '0';
              System.out.print(twoDimArray[i][j] + " ");
           }
           System.out.println();
       }
    }
}
