public class Main {
    volatile static boolean tumbler = false;

    public static void main(String[] args) {
        User user = new User("Пользователь");
        Box box = new Box("Игрушка");
        user.start();
        box.start();

        try {
            user.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        box.interrupt();
    }
}
