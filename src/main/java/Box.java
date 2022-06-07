public class Box extends Thread {
    public Box(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Main.tumbler) {
                Main.tumbler = false;
                System.out.println(Thread.currentThread().getName() + " выключила тумблер");
            }
        }
    }
}
