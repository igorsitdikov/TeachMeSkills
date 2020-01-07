package class_tasks.lesson9;

public class Main {
    public static void main(String[] args) {
        String str = "6strings";
        int num = StringUtils.countCharacterEntries(str, 's');
        System.out.println(num);
        System.out.println(str.length());
        System.out.println(StringUtils.startsWithDigit(str));
        String[] arr = new String[]{"С", " дорог",
                "страны", "пропали",
                "все", "мобильные",
                "камеры", "скорости.",
                "Что", "произошло"};
        System.out.println(StringUtils.findLongest(arr));
        String lolkek = "lolkek kcheck lol";
        System.out.println(StringUtils.kek(lolkek));
        System.out.println(StringUtils.unkek(StringUtils.kek(lolkek)));

        System.out.println(StringUtils.findMostFrequentChar(lolkek));

        String string20 = "20,123,dsadasdas20,2323,20202020";
        System.out.println( "COUNT 20");
        int[] count20 = StringUtils.count20(string20);
        for (int i = 0; i < count20.length; i++) {
            System.out.println(count20[i]);
        }

        StringUtils.sort(arr);

        System.out.println(StringUtils.findFirstNonRepeating("hhbbeebsadsad1"));

        StringUtils.divideAndPrint("hhbbeebsadsad1", 3);
        String s = "сделать со строкой вот такое";
        System.out.println( StringUtils.wow(s));


        System.out.println(StringUtils.repeat(s, 3));

        System.out.println(StringUtils.shuffle(s));
    }
}
