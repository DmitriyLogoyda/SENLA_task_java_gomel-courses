/*
Logoyda Dmitiy

Создать программу, которая будет сообщать, является ли целое число,
введенное пользователем, чётным или нечётным, простым или составным.
Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

package Task_1;

import java.util.Scanner;

public class Task_1 {
    private static int tmp = 2;

    public static void task_1 (){
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите число -> ");
                int number = Integer.parseInt(in.next());

                if (number == 0) System.out.println("Вы ввели целое число");
                  else {
                    if (number % 2 == 0) System.out.print("-> целое, чётное, ");
                      else System.out.print("-> целое, не чётное, ");
                    checkIsItANaturalNumber(number);
                }
                break;
            } catch (Exception e) {
                System.out.println("Вы ввели не целое число!");
                return;
            }
        }
    }
    private static void checkIsItANaturalNumber(int number) {
        if (number > 1) {
            if (number % tmp != 0) {
                tmp++;
                checkIsItANaturalNumber(number);
            } else if (number % tmp == 0) {
                printIsItNaturalNumber(tmp, number);
            }
        }
    }
    private static void printIsItNaturalNumber(int tmp, int n) {
        if (tmp == n) System.out.println("простое число.");
        else System.out.println("сотсавное число.");
    }
}
