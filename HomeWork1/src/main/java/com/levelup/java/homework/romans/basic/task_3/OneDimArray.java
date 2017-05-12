package main.java.com.levelup.java.homework.romans.basic.task_3;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import static java.lang.Math.max;


public class OneDimArray {
    public static void main (String s[]) {
        int num = 0;
        double maximum = Double.NEGATIVE_INFINITY;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите количество чисел в массиве: ");
            if (in.hasNextInt()) num = in.nextInt();
            else in.next();
        } while (num <= 0);
        in.close();

        Random random = new Random();
        DoubleStream stream_doubles = random.doubles(num, -1000, 1001);
        double[] oneDimArrayRandom = stream_doubles.toArray();
        //если раскомментить, то будет учитывать средний элемент в нечетных массивах
        //int mas_len = num%2==0 ? num/2 : num/2 + 1;
        int mas_len = num/2;
        for (int i = 0; i < mas_len; i++) {
            maximum = max(maximum, oneDimArrayRandom[i] + oneDimArrayRandom[num-1 - i]);
        }

        System.out.println("Массив:");
        for (int i = 0; i < num; i++) {
            System.out.print(oneDimArrayRandom[i] + "; ");
        }
        System.out.println();
        System.out.println();
        System.out.print("Максимум: " + maximum);
    }
}
