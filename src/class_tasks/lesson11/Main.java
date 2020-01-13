package class_tasks.lesson11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/mizuro/IdeaProjects/TeachMeSkills/src/class_tasks/lesson11/folder1/folder2/folder3/folder4");
        file.mkdirs();
        System.out.println(file.mkdir());
        String[] files = file.list();
        for (String s : files) {
            String extension = s.substring(s.lastIndexOf("."));
            if (extension.equals(".pdf")) {
                System.out.println(file.getAbsolutePath() + "/" + s);
            }
        }

//        B b = new B();
//        b.b(new A() {
//            @Override
//            public void a() {
//
//            }
//        });

        String inFile = "/home/mizuro/IdeaProjects/TeachMeSkills/src/class_tasks/lesson11/folder1/folder2/folder3/folder4/error.log";
        String outFile = "/home/mizuro/IdeaProjects/TeachMeSkills/src/class_tasks/lesson11/folder1/folder2/folder3/folder4/error_.log";
        try {
            byte[] in = Files.readAllBytes(Paths.get(new File(inFile).getPath()));
            Files.write(Paths.get(new File(outFile).getPath()), in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

            BufferedReader reader = new BufferedReader(new FileReader(inFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            String line = null;
            while ( (line = reader.readLine()) != null){
                writer.write(line + "\n");
            }
            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
//        new File(outFile).delete();
        try {

            BufferedReader reader = new BufferedReader(new FileReader(inFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            int symbol = reader.read();
            while ( symbol != -1){
                writer.write(symbol);
                symbol = reader.read();
            }
            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream( inFile);
            FileOutputStream fous = new FileOutputStream(outFile + "_");
            int symbol = fis.read();
            while (symbol != -1){
                fous.write(symbol);
                symbol = fis.read();
            }
            fis.close();
            fous.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out.txt"))){
            oos.writeObject(new Person("Jake", 10, new Closes("panrs", "chert")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out.txt"))){
            Person person = (Person) ois.readObject();
            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.getCloses().getPants());
            System.out.println(person.getCloses().getChest());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
