package Algorithm.Solutions.SortForInterview;

public class HeapSort {

    public static void sort(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            buildMaxHeap(nums, i);
            swap(nums, 0, i);
        }
    }

    private static void buildMaxHeap(int[] nums, int size) {
        for (int i = size / 2; i >= 0; i--) {
            heapify(nums, i, size);
        }
    }

    private static void heapify(int[] nums, int curRootNode, int size) {
        if (curRootNode > size) {
            return;
        }

        int leftChild = curRootNode * 2 + 1;
        int rightChild = leftChild + 1;

        int maxNode = curRootNode;

        if (leftChild <= size && nums[leftChild] > nums[maxNode]) {
            maxNode = leftChild;
        }

        if (rightChild <= size && nums[rightChild] > nums[maxNode]) {
            maxNode = rightChild;
        }

        if (maxNode != curRootNode) {
            swap(nums, curRootNode, maxNode);
            heapify(nums, maxNode, size);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
