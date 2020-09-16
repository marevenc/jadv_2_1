public class Main {
    public static void main(String[] args) {

        final Restaurant restaurant = new Restaurant();

        new Thread(null, restaurant::makeOrder, "Посетитель1").start();
        new Thread(null, restaurant::makeOrder, "Посетитель2").start();
        new Thread(null, restaurant::makeOrder, "Посетитель3").start();
        new Thread(null, restaurant::makeOrder, "Посетитель4").start();
        new Thread(null, restaurant::makeOrder, "Посетитель5").start();
    }
}
