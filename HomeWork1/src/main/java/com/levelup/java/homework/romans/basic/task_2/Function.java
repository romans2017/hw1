package main.java.com.levelup.java.homework.romans.basic.task_2;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.tan;

public class Function {
    public static void main (String s[]) {
        double begin_a = 0.0, end_b = 0.0, step_h = 0.0;
        Scanner in = new Scanner(System.in);

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
        char decimalSeparator = dfs.getDecimalSeparator();
        do {
            System.out.print("Введите начало отрезка а (разделитель целой и дробной части: \"" + decimalSeparator + "\" ): ");
            if (in.hasNextDouble()) {
                begin_a = in.nextDouble();
                break;
            }
            else in.next();
        } while (true);

        do {
            System.out.print("Введите конец отрезка b (разделитель целой и дробной части: \"" + decimalSeparator + "\" ): ");
            if (in.hasNextDouble()) end_b = in.nextDouble();
            else in.next();
        } while (end_b <= begin_a);

        do {
            System.out.print("Введите шаг h (разделитель целой и дробной части: \"" + decimalSeparator + "\" ): ");
            if (in.hasNextDouble()) step_h = in.nextDouble();
            else in.next();
        } while (step_h > end_b - begin_a || step_h <= 0);

        for (double i=begin_a; i<=end_b; i+=step_h) {
            System.out.print("x=" + i + " ");
            System.out.printf("f(x)=%s%n", tan(2*i)-3);
        }
    }
}
