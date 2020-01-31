package class_tasks.lesson16;

public class Account {
    public Long balance = 10000L;

    public synchronized void deposit(long amount) {
        balance += amount;
        this.notifyAll();
    }

    public synchronized void withdraw(long amount) throws InterruptedException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Balance : " + balance + " withdraw : " + amount + " not enough money");
            this.wait();
        }
    }

    public void increment() {
        synchronized (this) {
            balance++;
        }
    }

    public synchronized void decrement() {
        balance--;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
