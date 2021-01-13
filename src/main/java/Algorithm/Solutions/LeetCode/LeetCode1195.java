package Algorithm.Solutions.LeetCode;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

public class LeetCode1195 {
}

class FizzBuzz {
    private int n;
    private int i = 1;
    private final Object lock = new Object();

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (lock) {
            while (i <= n) {
                if ((!(i % 5 != 0 && i % 3 == 0))) {
                    lock.wait();
                }
                if ((!(i % 5 != 0 && i % 3 == 0))) {
                    continue;
                }
                if (i > n) {
                    break;
                }
                printFizz.run();
                i++;
                lock.notifyAll();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        synchronized (lock) {
            while (i <= n) {
                if ((!(i % 5 == 0 && i % 3 != 0))) {
                    lock.wait();
                }
                if ((!(i % 5 == 0 && i % 3 != 0))) {
                    continue;
                }
                if (i > n) {
                    break;
                }
                printBuzz.run();
                i++;
                lock.notifyAll();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        synchronized (lock) {
            while (i <= n) {
                if ((!(i % 5 == 0 && i % 3 == 0))) {
                    lock.wait();
                }
                if ((!(i % 5 == 0 && i % 3 == 0))) {
                    continue;
                }
                if (i > n) {
                    break;
                }
                printFizzBuzz.run();
                i++;
                lock.notifyAll();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        synchronized (lock) {
            while (i <= n) {
                if (i % 5 == 0 || i % 3 == 0) {
                    lock.wait();
                }
                if ((!(i % 5 != 0 && i % 3 != 0))) {
                    continue;
                }
                if (i > n) {
                    break;
                }
                printNumber.accept(i);
                i++;
                lock.notifyAll();
            }
        }
    }
}