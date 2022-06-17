public class Main {


    public static void main(String[] args) {
        User user = new User("User");
        Box box = new Box("Box");
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
