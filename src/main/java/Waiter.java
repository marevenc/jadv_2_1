import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Waiter {

    String name;
    Lock lock = new ReentrantLock();

    public String getName() {
        return name;
    }

    public Waiter(String name){
        this.name = name;
        System.out.println(this.getName() + " на работе");
    }
}
