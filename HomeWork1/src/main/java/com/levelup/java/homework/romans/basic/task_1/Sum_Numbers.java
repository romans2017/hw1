package main.java.com.levelup.java.homework.romans.basic.task_1;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Sum_Numbers {
    public static void main (String s[]) {
        int num = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите четырехзначное число: ");
            if (in.hasNextInt()) num = in.nextInt();
            else in.next();
        } while (abs(num) < 1000 || abs(num) > 9999);
        in.close();
        System.out.println(num/100/10 + num/100%10 == num%100/10 + num%100%10);
    }
}
