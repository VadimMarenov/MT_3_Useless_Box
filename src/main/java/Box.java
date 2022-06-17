public class Box extends Thread {
    volatile static boolean tumbler = false;
    public Box(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (tumbler) {
                tumbler = false;
                System.out.println(Thread.currentThread().getName() + " turned off the tumbler");
            }
        }
    }
}
