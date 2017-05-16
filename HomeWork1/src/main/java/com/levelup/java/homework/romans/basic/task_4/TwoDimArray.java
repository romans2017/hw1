package main.java.com.levelup.java.homework.romans.basic.task_4;

import java.util.Scanner;

public class TwoDimArray {
   public static void main (String s[]) {
       int num_rows = 0;
       int num_columns = 0;
       final char rectangle = 9015;

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

       char twoDimArray[][] = new char[num_rows+1][num_columns+1];

       int razd_row = 4-1;
       int razd_col = 4-1;

       int shift_row = 1;
       int shift_col = 1;

       for (int i=0; i < num_rows+1; i++) {
           if (i > razd_row) shift_row = -1;
           shift_col = 1;
           for (int j=0; j < num_columns+1; j++) {

               if (j > razd_col) shift_col = -1;
               if ((j==razd_col) || (i==razd_row)){
                   twoDimArray[i][j] = rectangle;
                   System.out.print(twoDimArray[i][j] + " ");
                   //if (j == razd_col) shift_col = 1;
                   //if (i==razd_row) {
                      /* twoDimArray[i][j] = rectangle;
                       System.out.print(twoDimArray[i][j] + " ");*/
                   //    continue;
                   //}
               } else {
               if ((i+shift_row==j+shift_col & i+shift_row<norm_dim & j-shift_col<norm_dim) || (i-shift_row==num_columns-j-1 & i-shift_row<norm_dim & j>num_columns-norm_dim)
                       || (num_rows-i==j-shift_col & i-shift_row>num_rows-norm_dim & j-shift_col<norm_dim) || (num_rows-i==num_columns-j & i>num_rows-norm_dim & j>num_columns-norm_dim)){
                   //if (i+shift_row<num_rows & j+shift_col<num_columns) twoDimArray[i+shift_row][j+shift_col] = '1';
                   //else twoDimArray[i][j] = '1';
                   twoDimArray[i][j] = '1';

               } else twoDimArray[Math.min(i+shift_row, num_rows)][Math.min(j+shift_col, num_columns)] = '0';

               /*if (i == j & i < norm_dim & j < norm_dim ){
                   twoDimArray[i][j] = '1';
                   twoDimArray[num_rows-1 - i][j] = '1';
                   twoDimArray[num_rows-1 - i][num_columns-1 - j] = '1';
                   twoDimArray[i][num_columns-1 - j] = '1';
               } else twoDimArray[i][j] = twoDimArray[i][j]=='1' ? '1' : '0';*/
               System.out.print(twoDimArray[Math.min(i+shift_row, num_rows)][Math.min(j+shift_col, num_columns)] + " ");}
           }
           /*if (i==razd_row) {
               twoDimArray[i][num_columns] = rectangle;
               System.out.print(twoDimArray[i][num_columns] + " ");
           }*/
           System.out.println();
       }
    }
}
