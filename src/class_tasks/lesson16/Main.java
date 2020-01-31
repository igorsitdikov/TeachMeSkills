package class_tasks.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
//            new Thread(new HelloThread()).start();
//        }
//
//        long id = Thread.currentThread().getId();
//        String name = Thread.currentThread().getName();
//        System.out.println("Hello, I am thread with ID = " + id + ", name = " + name + "");
//
//
//        Thread spleeperThread = new Thread(new SleeperThread());
//        spleeperThread.start();
//        Random random = new Random();
//        int rand = random.nextInt(11);
//        System.out.println(rand);
//        Thread.sleep(rand * 1000);
//        spleeperThread.interrupt();
//        CounterThread counterThread = new CounterThread();
//        Thread countThread = new Thread(counterThread);
//        countThread.start();
//        Thread.sleep(100);
//        countThread.interrupt();
//
//        Thread daemonThread = new Thread(new DaemonThread());
//        daemonThread.setDaemon(true);
//        daemonThread.start();
//        Thread.sleep(3000);
//        daemonThread.interrupt();

//        for (int i = 0; i < 10; i++) {
//            new Thread(new PersonThread()).start();
//        }
//        List<PersonThreadIsAlive> personsAlive = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            personsAlive.add(new PersonThreadIsAlive());
//        }
//        personsAlive.forEach(Thread::start);
//
//        int isAlive = personsAlive.size();
//        while (isAlive > 0) {
//            isAlive = (int) personsAlive.stream().filter(Thread::isAlive).count();
//            System.out.println("is alive : " + isAlive);
//            Thread.sleep(1000);
//        }

        Account account = new Account();
//
//        Thread incrThread = new Thread(() -> {
//            for (int i = 0; i < 100_000; i++) {
////                account.increment();
//                synchronized (account) {
//                    account.balance++;
//                }
//            }
//        });
//        incrThread.start();
//        Thread decrThread = new Thread(() -> {
//            for (int i = 0; i < 100_000; i++) {
//                account.decrement();
////                synchronized (account) {
////                    account.balance--;
////                }
//            }
//        });
//        decrThread.start();
//        decrThread.join();
//        incrThread.join();

//        System.out.println(account.balance);

        Random random = new Random();


        Thread incrThread = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                int add = random.nextInt(1000);
                account.deposit(add);
                System.out.println("Balance : " + account.getBalance() + " add : " + add);
            }
        });
        incrThread.start();
        Thread decrThread = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                try {
                    int remove = random.nextInt(9000);
                    account.withdraw(remove);
                    System.out.println("Balance : " + account.getBalance() + " withdraw : " + remove);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        decrThread.start();
        decrThread.join();
        incrThread.join();
    }
}
