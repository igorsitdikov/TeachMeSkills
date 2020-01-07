package lesson9.task4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Lesson9/task4/INPUT.TXT");
        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            stringBuilder.append(line).append('\n');
        }

        String text = stringBuilder.toString().replace('\n', ' ');
        String[] sentences = text.split("(?<=(\\.|\\?|!))");
        stringBuilder.setLength(0);
        for (int i = 0; i < sentences.length; i++) {
            if (TextFormatter.hasPolindrom(sentences[i].trim())
                    || (TextFormatter.counter(sentences[i].trim()) > 2
                    && TextFormatter.counter(sentences[i].trim()) < 6)) {
                stringBuilder.append(sentences[i]).append('\n');
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/Lesson9/task4/OUTPUT.TXT"));

        writer.write(stringBuilder.toString());
        writer.close();
    }
}
