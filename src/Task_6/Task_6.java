/*
 * Имеется набор вещей, которые необходимо поместить в рюкзак.
 * Рюкзак обладает заданной грузоподъемностью.
 * Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
 * Цель задачи заполнить рюкзак не превысив его грузоподъемность и
 * максимизировать суммарную ценность груза.
 */



package Task_6;

import java.util.*;

public class Task_6 {
    private static List<Parameters> items = new ArrayList<>();
    private static Backpack backpack = new Backpack(10);
    private static int total_cost = 0;
    private static int total_weight = 0;

    public static void task_6() {
        items.add(new Parameters("Items_1", 20, 5));
        items.add(new Parameters("Items_2", 10, 1));
        items.add(new Parameters("Items_3", 15, 1));
        items.add(new Parameters("Items_4", 35, 5));
        items.add(new Parameters("Items_5", 10, 2));
        items.add(new Parameters("Items_6", 20, 4));

        selectionItems(new HashSet<>(), 0, 0);
        System.out.println("Исходная сумма предметов --> " + total_cost + "\nИсходный вес предметов --> " + total_weight);
    }

    private static void selectionItems(Set<Integer> used, int cost, int weight) {
        for (int i = 0; i < items.size(); i++) {
            if (used.contains(i)) continue;
            Parameters parameters = items.get(i);
            if (weight + parameters.getWeigth() < backpack.getCapacity()) {
                used.add(i);
                selectionItems(used, cost + parameters.getCost(), weight + parameters.getWeigth());
                used.remove(i);
            } else if (cost > total_cost) {
                total_cost = cost;
                total_weight = weight;
            } else if (cost == total_cost) {
                if (weight < total_weight) total_weight = weight;
            }
        }
    }
}
