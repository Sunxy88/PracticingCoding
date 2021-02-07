package Algorithm.Solutions.CodeInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AliYun1 {
}
class OrderPrint implements Runnable {

    private String cur;
    private String next;
    private static String message;
    private final static Object lock = new Object();

    public OrderPrint(String cur, String next, String message) {
        this.cur = cur;
        this.next = next;
        OrderPrint.message = message;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (lock) {
                    while (!cur.equals(message)) {
                        lock.wait();
                    }
                    System.out.print(cur);
                    message = next;
                    lock.notifyAll();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String message = "a";
        Thread a = new Thread(new OrderPrint("a", "l", message));
        Thread l = new Thread(new OrderPrint("l", "i", message));
        Thread i = new Thread(new OrderPrint("i", "a", message));
        a.start();
        l.start();
        i.start();
    }
}


//评测题目2: 给定一个数组A，判断是否可以将数组A划分为两个数组B和C，满足每个元素属于且仅属于B或C中的一个，并且B和C的总和相等。
//例如[1,2,3,4,5,6,7,8]可以划分为[2,3,6,7]和[1,4,5,8]

class Partition {

    public boolean partitionEqualSum(int[] A) {
        int len;
        if (A == null || (len = A.length) == 0) {
            return false;
        }

        int sumA = Arrays.stream(A).sum();
        boolean flag = false;
        int maxLenB = len / 2;
//     sumA / len == sumB / lenB == sumC / lenC
//     sumA * lenB / len == sumB
        for (int i = 1; i <= len && !flag; i++) {
            if (sumA * i % len == 0) {
                flag = true;
            }
        }
        if (!flag) {
            return false;
        }

//     保存小于maxLenB任意长度的A的字数组的和
        List<List<Integer>> allSum = new ArrayList<>();
        allSum.add(Arrays.asList(0));
        for (int i = 0; i < len; i++) {
            for (int j = maxLenB; j >= 1; j--) {
                if (j - 1 >= allSum.size()) {
                    continue;
                }
                List<Integer> lastSum = allSum.get(j - 1);
                List<Integer> ithSum = new ArrayList<>();
                for (Integer lastS : lastSum) {
                    ithSum.add(lastS + A[i]);
                }
            }
        }

//       遍历所有可能作为B的和的选择
        for (int i = 1; i < maxLenB; i++) {
            if (sumA * i % len == 0) {
                for (Integer sumB : allSum.get(i)) {
                    if (sumA * i / len == sumB) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Partition partition = new Partition();
        System.out.println(partition.partitionEqualSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
}