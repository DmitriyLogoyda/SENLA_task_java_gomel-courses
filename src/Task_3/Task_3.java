package Task_3;

import java.text.Collator;
import java.util.*;

public class Task_3 {

    public static void task_3(boolean check) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку: ");
            String string = sc.nextLine().trim();
            if (string.length() == 0) {
                System.out.println("Введена некорректная строка");
            } else {
                String[] strings = string.split(" +");
                System.out.println("Исходный текст: " + Arrays.toString(strings).replaceAll("\\p{P}", "") + "\nКоличесво слов в тексте: " + strings.length);

                if (check) {
                    List<String> words = new ArrayList<>(Arrays.asList(strings));
                    Collections.sort(words);
                    System.out.println("Строка после сортировки --> " + words.toString().replaceAll("\\p{P}", ""));
                } else {
                    sortRussian(strings);
                    System.out.println("Строка после сортировки --> " + Arrays.toString(strings).replaceAll("\\p{P}", ""));
                }

                /*поменять первую букву слова на большую*/
                StringBuilder custom_string = new StringBuilder(string.substring(0, 1).toUpperCase());
                for (int i = 1; i < string.length(); i++) {
                    if (" ".equals(string.substring(i - 1, i)))
                        custom_string.append(string.substring(i, i + 1).toUpperCase());
                    else custom_string.append(string, i, i + 1);
                }
                System.out.println("Строка с изменённым буквами --> " + custom_string);
            }
            break;
        }
    }

    /*Сортировка предложения на русском. (только таким образом смог обойти проблему сортировки буквы ё)*/
    public static void sortRussian(String[] strings){
        Collator collator = Collator.getInstance(new Locale("ru", "RU"));
        collator.setStrength(Collator.PRIMARY);
        for (int j = 0; j < strings.length - 1; j++)
            for (int i = j + 1; i < strings.length; i++) {
                if (collator.compare(strings[i], strings[j]) < 0) {
                    String tmp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = tmp;
                }
                else if (collator.compare(strings[i], strings[j]) == 0) {
                    String tmp = strings[j];
                    strings[i] = strings[j];
                    strings[i] = tmp;
                }
            }
    }
}
