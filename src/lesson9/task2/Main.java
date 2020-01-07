package lesson9.task2;

public class Main {
    public static void main(String[] args) {
        String str = "how are you, dude?";
        System.out.println(findAndReplace(str));
    }
    private static String findAndReplace(String str){
        char[] array = str.toCharArray();

        if (array.length > 3){
            char zero = array[0];
            char third = array[3];
            for (int i = 0; i < array.length; i++) {
                if (array[i] == third){
                    array[i] = zero;
                }
            }
        } else {
            System.out.println("Длина слова не соответствует заданию");
        }
        return new String(array);
    }
}
