import Task_1.Task_1;
import Task_2.Task_2;
import Task_3.Task_3;
import Task_4.Task_4;
import Task_5.Task_5;
import Task_6.Task_6;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    static boolean check_task_3 = true;
    static int num_menu;
    public int menu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите пункт меню:\n"
                    + "1) выполнить task_1\n"
                    + "2) выполнить task_2\n"
                    + "3) выполнить task_3\n"
                    + "4) выполнить task_4\n"
                    + "5) выполнить task_5\n"
                    + "6) выполнить task_6\n"
                    + "0 - выход из меню");
            num_menu = in.nextInt();
            switch (num_menu) {
                case 1:
                    Task_1.task_1();
                    break;
                case 2:
                    Task_2.task_2();
                    break;
                case 3:
                    System.out.println("Укажите тип сотрироки:\n"
                            + "1) Сортировка предложения на английском языке\n"
                            + "2) Сортировка предложения на русском языке\n");
                    int num_sort = in.nextInt();
                    switch (num_sort) {
                        case 1:
                            check_task_3 = true;
                            Task_3.task_3(check_task_3);
                            break;
                        case 2:
                            check_task_3 = false;
                            Task_3.task_3(check_task_3);
                            break;
                    }
                    break;
                case 4:
                    Task_4.task_4();
                    break;
                case 5:
                    Task_5.task_5();
                    break;
                case 6:
                    Task_6.task_6();
                    break;
                case 0:
                    System.out.println("Завершение программы...");
                    return 0;
                default:
                    System.out.println("Вы ввели не существующий пункт меню");
                    break;
            }
        }
    }
}
