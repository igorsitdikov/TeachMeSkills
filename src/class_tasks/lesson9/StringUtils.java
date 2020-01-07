package class_tasks.lesson9;

import java.util.Random;

public class StringUtils {
    public static int countCharacterEntries(String s, char c) {
        char[] str = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean startsWithDigit(String s) {
        return s.startsWith("0") ||
                s.startsWith("1") ||
                s.startsWith("2") ||
                s.startsWith("3") ||
                s.startsWith("4") ||
                s.startsWith("5") ||
                s.startsWith("6") ||
                s.startsWith("7") ||
                s.startsWith("8") ||
                s.startsWith("9");
    }

    public static String findLongest(String... strings) {
        int length = 0;
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > length) {
                length = strings[i].length();
                result = strings[i] + "|";
            } else if (strings[i].length() == length) {
                result += strings[i] + "|";
            }
        }
        return result;
    }

    public static String kek(String s) {
        s = s.replace("lol", "kek");
        return s;
    }

    public static String unkek(String s) {
        s = s.replace("kek", "");
        return s;
    }

    public static int[] count20(String s) {
        int[] counter = new int[0];
        int index;
        char[] array = s.toCharArray();
        for (int j = 0; j < array.length - 1; j++) {
            char firstLetter = array[j];
            char secondLetter = array[j + 1];
            if (firstLetter == '2' && secondLetter == '0') {
                int[] counterBuf = new int[counter.length + 1];
                for (int k = 0; k < counter.length; k++) {
                    counterBuf[k] = counter[k];
                }
                index = j;
                counterBuf[counter.length] = index;
                counter = counterBuf;
            }
        }
        return counter;
    }

    public static String[] sort(String... strings) {
        int length = strings.length;
        String temp;
        for (int i = 0; i < length; i++)
        {
            for (int j = i + 1; j < length; j++)
            {
                if (strings[i].compareTo(strings[j])>0)
                {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }


    public static char findMostFrequentChar(String s) {
        char[] array = s.toCharArray();

        char mostfreq = array[0];
        int counter = 0;
        int mostcounter = 0;
        for (int i = 0; i < array.length; i++) {
            char current = array[i];
            counter = 1;
            for (int j = 0; j < array.length; j++) {
                if (current == array[j]) {
                    counter++;
                }
            }
            if (mostcounter < counter) {
                mostcounter = counter;
                mostfreq = array[i];
            }
        }

        return mostfreq;
    }

    public static char findFirstNonRepeating(String s) {
        char[] array = s.toCharArray();
        char first = ' ';
        for (int i = 0; i < array.length; i++) {
            if (s.lastIndexOf(array[i]) == s.indexOf(array[i])) {
                first = array[i];
                break;
            }
        }
        return first;
    }

    public static void divideAndPrint(String s, int n) {
        char[] array = s.toCharArray();
        String ne = "";
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            ne += array[i];
            i++;
            j++;
            if (j == n || i == s.length()) {
                System.out.println(ne);
                ne = "";
                j = 0;
            }
        }
    }

    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        if (s.length() > 1){
            return s.equals(reverse(s));
        }
        return false;
    }

    public static String wow(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.replace(i, i + 1, String.valueOf(sb.charAt(i)).toUpperCase());
            }
        }
        return sb.toString();
    }

    public static String repeat(String s, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String shuffle(String s) {
        StringBuilder sb = new StringBuilder(s);
        Random random = new Random();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int change = random.nextInt(length - 2);
            int change1 = random.nextInt(length - 2);
            String buf = String.valueOf(sb.charAt(change));
            String buf1 = String.valueOf(sb.charAt(change1));
            sb.replace(change, change + 1, buf1);

            sb.replace(change1, change1 + 1, buf);
        }
        return sb.toString();
    }
}
