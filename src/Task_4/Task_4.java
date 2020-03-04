package Task_4;

import java.util.Scanner;

public class Task_4 {
    public static void task_4() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите текст:");
            String text = sc.nextLine().trim().replaceAll("\\p{P}", "");
            if (text.length() != 0) {
                while (true) {
                    System.out.println("Введите слово для поиска:");
                    String word = sc.nextLine().trim();
                    if (word.length() != 0) {
                        System.out.println("Слово " + word + " встечается в тексте " + searchWord(text, word) + " раз.");
                        break;
                    } else {
                        System.out.println("Вы ввели пустое слово!");
                    }
                }
                break;
            } else {
                System.out.println("Вы ввели пустую строку!");
            }
        }
    }

    private static int searchWord(String text, String word){
        String[] mas_word = text.toLowerCase().split(" ");
        int count = 0;
        for (String str : mas_word) {
            if (str.equals(word)) count++;
        }
        return count;
    }
}
