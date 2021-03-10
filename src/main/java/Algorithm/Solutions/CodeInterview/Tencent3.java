package Algorithm.Solutions.CodeInterview;

import java.util.*;

public class Tencent3 {

    public static void main(String[] args) {
        int[] ary = new int[] {0, 1, 2, 3, -1, -2, -3, 5, 6, 7};

        continualIncrement(ary);

//        quickSort(ary);
//        System.out.println(Arrays.toString(ary).toString());
//        bfs();
    }

    private static void continualIncrement(int[] ary) {
        int len;

        if (ary == null || (len = ary.length) == 0) {
            return ;
        }

        int ptrLeft = 0, ptrRight = 0;

        while (ptrRight < len - 1) {
            if (ary[ptrRight + 1] - ary[ptrRight] == 1) {
                ptrRight++;
            } else {
                if (ptrLeft != ptrRight) {
                    System.out.println(ary[ptrLeft] + "->" + ary[ptrRight]);
                } else {
                    System.out.println(ary[ptrLeft]);
                }
                ptrLeft = ptrRight + 1;
                ptrRight++;
            }
        }

        if (ptrLeft != ptrRight) {
            System.out.println(ary[ptrLeft] + "->" + ary[ptrRight]);
        } else {
            System.out.println(ary[ptrLeft]);
        }
    }

    private static void quickSort(int[] ary) {

        Deque<Integer> stackLeftBound = new LinkedList<>();
        Deque<Integer> stackRightBound = new LinkedList<>();

        stackLeftBound.push(0);
        stackRightBound.push(ary.length - 1);


        while (!stackLeftBound.isEmpty() && !stackRightBound.isEmpty()) {
            int low = stackLeftBound.pop(), high = stackRightBound.pop();
            int i = low, j = high;
            int pivot = ary[(i + j) / 2];



            while (i <= j) {
                while (ary[i] < pivot) {
                    i++;
                }
                while (ary[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    swap(ary, i, j);
                    i++;
                    j--;
                }
            }

            if (j > low) {
                stackLeftBound.push(low);
                stackRightBound.push(j);
            }
            if (i < high) {
                stackLeftBound.push(i);
                stackRightBound.push(high);
            }
        }

    }

    private static void swap(int[] ary, int i, int j) {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }

    public static void bfs() {
        int[] bucket = new int[] {8, 0, 0};
        int[] LIMIT = new int[] {8, 5, 3};

        Deque<int[]> q = new LinkedList<>();
        Map<String, String> path = new HashMap<>();
        q.addLast(bucket);
        String status = "A" + bucket[0] + "B" + bucket[1] + "C" + bucket[2];
        path.put(status, path.getOrDefault(status, "") + status + "\n");

        while (!q.isEmpty()) {
            bucket = q.pollFirst();
            status = "A" + bucket[0] + "B" + bucket[1] + "C" + bucket[2];
            for (int i = 0; i < 3; i++) {
                if (bucket[i] == 4) {
                    System.out.println(path.get(status));
                    return;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (bucket[i] == 0) {
                    continue;
                }
                for (int j = 0; j < 3; j++) {
                    if (i == j || bucket[j] == LIMIT[j]) {
                        continue;
                    }
                    int water = LIMIT[j] - bucket[j];
                    if (water > bucket[i]) {
                        water = bucket[i];
                    }
                    bucket[j] += water;
                    bucket[i] -= water;
                    int[] newBucket = new int[] {bucket[0], bucket[1], bucket[2]};
                    String newStatus = "A" + newBucket[0] + "B" + newBucket[1] + "C" + newBucket[2];
                    if (!path.containsKey(newStatus)) {
                        path.put(newStatus, path.getOrDefault(status, "") + newStatus+ "\n");
                        q.addLast(newBucket);
                    }
                    bucket[i] += water;
                    bucket[j] -= water;
                }
            }
        }
    }
}
