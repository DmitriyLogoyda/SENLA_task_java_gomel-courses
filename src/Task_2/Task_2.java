package Task_2;

import java.util.Scanner;

public class Task_2 {

    public static void task_2() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите два целых числа -->");
                int number_1 = in.nextInt();
                int number_2 = in.nextInt();
                System.out.printf("НОД чисел %d и %d = %d\n", number_1, number_2, gcd(number_1, number_2));
                System.out.printf("НОК чисел %d и %d = %d\n", number_1, number_2, lcm(number_1, number_2));
                break;
            }
            catch (Exception e) {
                System.out.println("Введите корректные значения");
            }
        }
    }

        private static int gcd(int number_1, int number_2) {
            while (number_2 != 0) {
                int tmp = number_1 % number_2;
                number_1 = number_2;
                number_2 = tmp;
            }
            return number_1;
        }

        private static int lcm(int number_1, int number_2)
        {
            return number_1 * number_2 / gcd(number_1, number_2);
        }
}
