package Task_5;

import java.util.Scanner;

public class Task_5 {
    public static void task_5() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите размернось последовательности --> ");
                int dimension = Integer.parseInt(in.next());
                if (dimension >= 1 && dimension < 101) {
                    int[] sequence = new int[dimension];
                    System.out.println("В данной последовательности следующие числа являются полиндромами:");
                    for (int i = 0; i < dimension; i++) {
                        sequence[i] = i;
                        if (sequence[i] == reverse(sequence[i]) && i > 9) {
                            System.out.println(i);
                        }
                    }
                    break;
                } else
                    System.out.println("Введите размерность последовательности от 1 до 100");
            } catch (Exception e) {
                System.out.println("Введите целочисленную размерность последовательности!");
            }
        }
    }
    private static int reverse(int number) {
        int tmp = 0;
        while (number > 9) {
            tmp = tmp * 10 + number % 10;
            number /= 10;
        }
        return tmp * 10 + number;
    }

}
