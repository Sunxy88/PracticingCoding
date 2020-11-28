package Algorithm.concurrent;


public class Ordered implements Runnable {

    private String cur ;
    private String next;
    private final Meesage m;

    public Ordered(String cur, String next, Meesage meesage) {
        this.cur = cur;
        this.next = next;
        this.m = meesage;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (m) {
                    if (cur.equals(Meesage.str)) {
                        System.out.print(cur);
                        Meesage.str = next;
                        m.notifyAll();
                    } else {
                        m.wait();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Meesage meesage = new Meesage();
        Ordered a = new Ordered("A", "B", meesage);
        Ordered b = new Ordered("B", "C", meesage);
        Ordered c = new Ordered("C", "A", meesage);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
    }
}
