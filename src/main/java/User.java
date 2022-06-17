public class User extends Thread {
    final int COUNT_OF_TOUCHING = 5;
    final int USER_WAITING = 2000;

    public User(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT_OF_TOUCHING; i++) {
            if (!Box.tumbler) {
                System.out.println(Thread.currentThread().getName() + " turned on the tumbler");
                Box.tumbler = true;
                try {
                    Thread.sleep(USER_WAITING);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
