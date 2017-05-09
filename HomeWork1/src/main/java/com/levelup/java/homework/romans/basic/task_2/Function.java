package main.java.com.levelup.java.homework.romans.basic.task_2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Function {
    public static void main (String s[]) {
        double begin_a, end_b, step_h;
        Scanner in = new Scanner(System.in);
        //in.useLocale()
        System.out.print("Введите начало отрезка а: ");
        begin_a = in.nextDouble();
        do {
            System.out.print("Введите конец отрезка b: ");
            end_b = in.nextDouble();
        } while (end_b <= begin_a);
        do {
            System.out.print("Введите шаг h: ");
            step_h = in.nextDouble();
        } while (step_h > end_b - begin_a);

        for (double i=begin_a; i<=end_b; i=i+step_h) {
            System.out.print("x=" + i + '\u0020');
            System.out.printf("f(x)=%s%n", tan(2*i)-3);
        }
    }
}
