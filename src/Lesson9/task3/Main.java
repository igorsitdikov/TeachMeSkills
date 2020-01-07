package Lesson9.task3;

import class_tasks.lesson9.StringUtils;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Lesson9/task3/INPUT.TXT");
        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (StringUtils.isPalindrome(line.trim())) {
                stringBuilder.append(line).append('\n');
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/Lesson9/task3/OUTPUT.TXT"));

        writer.write(stringBuilder.toString());
        writer.close();
    }

}
