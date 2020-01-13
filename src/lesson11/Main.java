package lesson11;

import class_tasks.lesson11.Closes;
import class_tasks.lesson11.Person;
import lesson10.Car;
import lesson9.task4.TextFormatter;

import java.io.*;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/lesson9/task4/INPUT.TXT");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            stringBuilder.append(line).append('\n');
        }
        List<String> listSource = new ArrayList<>();
        String text = stringBuilder.toString().replace('\n', ' ');
        String[] sentences = text.split("(?<=(\\.|\\?|!))");
        stringBuilder.setLength(0);
        for (String s : sentences) {
            if (TextFormatter.hasPolindrom(s.trim())
                    || (TextFormatter.counter(s.trim()) > 2
                    && TextFormatter.counter(s.trim()) < 6)) {
                stringBuilder.append(s).append('\n');
                listSource.add(s);
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/lesson11/OUTPUT.TXT"));

        writer.write(stringBuilder.toString());
        writer.close();

        file = new File("src/lesson11/BLACKLIST.TXT");
        br = new BufferedReader(new FileReader(file));
        stringBuilder = new StringBuilder();
        while ((line = br.readLine()) != null) {
            stringBuilder.append(line).append('\n');
        }

        String[] blacklist = stringBuilder.toString().split(", ");

        List<String> blackSentences = new ArrayList<>();

        for (String item : listSource) {
            for (String blackWord : blacklist) {
                if (item.contains(blackWord)) {
                    blackSentences.add(item);
                }
            }
        }

        if (blackSentences.size() != 0) {
            System.out.println("Количество предложений со словами из черного списка : " + blackSentences.size());
            System.out.println("Предложения, подлежащие проверке : ");
            for (String sentence : blackSentences) {
                System.out.println(sentence);
            }
        } else {
            System.out.println("Текст прошел проверку");
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out.txt"))) {
            List<Car> cars = new ArrayList<>();

            Car audi = new Car("Audi", 220, 15000);
            Car bmw = new Car("BMW", 320, 25000);
            cars.add(audi);
            cars.add(bmw);
            oos.writeObject(cars);
            oos.writeObject(audi);
            oos.writeObject(bmw);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out.txt"))) {

            List<Car> cars = (List<Car>) ois.readObject();
            for (Car car : cars) {
                System.out.println(car.getModel());
                System.out.println(car.getSpeed());
                System.out.println(car.getPrice());
            }
            try
            {
                for (;;)
                {
                    Car object = (Car) ois.readObject();
                    System.out.println(object.getModel());
                    System.out.println(object.getSpeed());
                    System.out.println(object.getPrice());
                }
            }
            catch (SocketTimeoutException exc)
            {

            }
            catch (EOFException exc)
            {

            }
            catch (IOException exc)
            {
                exc.printStackTrace();
            }

//            Car audi = (Car) ois.readObject();
//            Car bmw = (Car) ois.readObject();
//            System.out.println(audi.getModel());
//            System.out.println(audi.getSpeed());
//            System.out.println(audi.getPrice());
//            System.out.println(bmw.getModel());
//            System.out.println(bmw.getSpeed());
//            System.out.println(bmw.getPrice());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
