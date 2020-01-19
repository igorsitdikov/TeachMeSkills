package lesson12.structures;

import lesson12.model.Goods;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Goods goods1 = new Goods(1, "Goods1", 20);
        Goods goods2 = new Goods(2, "Goods2", 40);
        Goods goods3 = new Goods(3, "Goods3", 40);
        Goods goods4 = new Goods(3, "Goods4", 30);
        Goods goods5 = new Goods(3, "Goods5", 50);

        /*
         * ArrayList
         * */

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        show(goodsList);
        goodsList.remove(goods1);
        System.out.println();
        show(goodsList);
        int index = goodsList.indexOf(goods3);
        System.out.println();
        System.out.println("Search index of goods2 " + index);
        goodsList.add(goods1);
        goodsList.add(goods4);
        goodsList.add(goods5);
        goodsList.sort((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            }
            return o1.getId() - o2.getId();
        });
        System.out.println();
        show(goodsList);
        goodsList.set(3, goods1);
        System.out.println();
        show(goodsList);
        // change
        System.out.println();
        goodsList.get(goodsList.indexOf(goods1)).setName("New goods name");
        show(goodsList);

        System.out.println("\n Tree Set \n");

        Set<Goods> goodsSet = new TreeSet<>((o1, o2) -> o2.getId() - o1.getId());
        goodsSet = new TreeSet<>(Comparator.comparing(Goods::getId));
        goodsSet.add(goods3);
        goodsSet.add(goods1);
        goodsSet.add(goods2);
        goodsSet.add(goods4);
        goodsSet.add(goods5);
        goodsSet.add(goods1);
        show(goodsSet);

        System.out.println("\n Hash Set \n");

        goodsSet = new HashSet<>();
        goodsSet.add(goods3);
        goodsSet.add(goods1);
        goodsSet.add(goods2);
        goodsSet.add(goods4);
        goodsSet.add(goods5);
        goodsSet.add(goods1);
        show(goodsSet);

        System.out.println("\nTree Map\n");

        Map<Integer, Goods> goodsMap = new TreeMap<>();
        goodsMap.put(goods2.getId(), goods2);
        goodsMap.put(goods1.getId(), goods1);
        goodsMap.put(goods3.getId(), goods3);
        goodsMap.put(goods4.getId(), goods4);
        goodsMap.put(goods5.getId(), goods5);
        goodsMap.put(goods1.getId(), goods1);
        goodsMap.put(goods1.getId(), goods1);

        show(goodsMap);

        goodsMap.replace(goods5.getId(), goods3);
        System.out.println();
        show(goodsMap);
        System.out.println();
        goodsMap.remove(1);

        show(goodsMap);
        System.out.println();
        goodsMap.values().forEach(el -> System.out.println(el.getId() + " " + el.getName() + " " + el.getPrice()));
        System.out.println();
        goodsMap.keySet().forEach(System.out::println);

    }

    private static <T extends Goods> void show(List<T> list) {
        list.forEach(el -> System.out.println(el.getId() + " " + el.getName() + " " + el.getPrice()));
    }
    private static <T extends Goods> void show(Set<T> set) {
        set.forEach(el -> System.out.println(el.getId() + " " + el.getName() + " " + el.getPrice()));
    }
    private static <T extends Goods> void show(Map<Integer, T> set) {
        set.forEach((k,v) -> System.out.println("Key: "+ k + " Value: " + v.getId() +  " " + v.getName() + " " + v.getPrice()));
    }

}
