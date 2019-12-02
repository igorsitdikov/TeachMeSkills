package class_tasks;

public class Lesson2 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();

//        Random random = new Random();
//        int rand = random.nextInt();
//        System.out.println(rand);
//        System.out.println(i);
        System.out.println();
        System.out.println("---------while---------");
        System.out.println();
        int i = 0;
        while (i <= 57) {
            if (i >= 13 && i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();

        int number = 1234578787;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("Summ : " + sum);

        int febonachi = 1;
        int last = 0;
        int predlast = 0;
        while (febonachi < 1000) {
            System.out.print(febonachi + " ");
            predlast = last;
            last = febonachi;
            febonachi = last + predlast;
        }

        System.out.println();
        System.out.println();
        System.out.println("---------for---------");
        System.out.println();
        for (int j = 0; j <= 57; j++) {
            if (j >= 13 && j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        sum = 0;
        for (int num = 1234578787; num > 0; num /= 10) {
            sum += num % 10;
        }
        System.out.println("Summ : " + sum);

        last = 0;
        predlast = 0;
        for (febonachi = 1; febonachi < 1000; febonachi = last + predlast) {
            System.out.print(febonachi + " ");
            predlast = last;
            last = febonachi;
        }


    }
}
