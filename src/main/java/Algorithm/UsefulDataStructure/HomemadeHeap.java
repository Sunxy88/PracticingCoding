package Algorithm.UsefulDataStructure;

public class HomemadeHeap {

    private int[] data;

    private int ptr;

    public HomemadeHeap(int[] data, int size) {
        this.ptr = 0;
        this.data = new int[size];
        for (int i = 0; i < data.length; i++) {
            add(data[i]);
        }
    }

    public int add(int val) {
        if (ptr < data.length) {
            data[ptr] = val;
            up(data, ptr++);
        } else if (val > data[0]) {
            data[0] = val;
            down(data, 0);
        }
        return data[0];
    }

    private void down(int[] data, int i) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int len = data.length;
        int smallest = i;
        if (left < len && data[left] < data[smallest]) {
            smallest = left;
        }
        if (right < len && data[right] < data[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(data, i, smallest);
            down(data, smallest);
        }
    }

    private void up(int[] data, int i) {
        int parent = (i - 1) / 2;
        if (parent >= 0 && data[i] < data[parent]) {
            swap(data, parent, i);
            up(data, parent);
        }
    }

    private void swap(int[] data, int x, int y) {
        int t = data[x];
        data[x] = data[y];
        data[y] = t;
    }
}
