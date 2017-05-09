package main.java.com.levelup.java.homework.romans.basic.task_1;

import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Square_Triangle {
    public static void main (String s[]) {
        double katet_a, katet_b = 0.0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите длину катета а (положительное число): ");
            katet_a = in.nextDouble();
        } while (katet_a <= 0);
        do {
            System.out.print("Введите длину катета b (положительное число): ");
            katet_b = in.nextDouble();
        } while (katet_b <= 0);

        System.out.printf("Периметр треугольника:%s%n", katet_a + katet_b + sqrt(katet_a * katet_a + katet_b * katet_b));
        System.out.printf("Площадь треугольника:%s%n", 0.5 * katet_a * katet_b);
    }
}
