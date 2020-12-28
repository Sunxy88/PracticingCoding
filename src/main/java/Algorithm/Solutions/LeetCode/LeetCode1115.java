package Algorithm.Solutions.LeetCode;

public class LeetCode1115 {
}

class FooBar {
    private int n;
    private final Object lock = new Object();
    private volatile boolean foo = true;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (lock) {
                while (!foo) {
                    lock.wait();
                }
                printFoo.run();
                foo = !foo;
                lock.notifyAll();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (lock) {
                while (foo) {
                    lock.wait();
                }
                printBar.run();
                foo = !foo;
                lock.notifyAll();
            }
        }
    }
}