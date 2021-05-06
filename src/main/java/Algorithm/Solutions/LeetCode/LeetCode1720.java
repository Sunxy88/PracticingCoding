package Algorithm.Solutions.LeetCode;

public class LeetCode1720 {

    public int[] decode(int[] encoded, int first) {
        int len;
        if (encoded == null || (len = encoded.length) == 0) {
            return null;
        }

        int[] arr = new int[len + 1];
        arr[0] = first;

        for (int i = 1; i < len + 1; i++) {
            arr[i] = encoded[i - 1] ^ arr[i - 1];
        }

        return arr;
    }

}
