package Algorithm.Solutions.LeetCode;

public class LeetCode1734 {

    public int[] decode(int[] encoded) {
        int len;
        if (encoded == null || (len = encoded.length) == 0) {
            return null;
        }
        len = len + 1;
        int total = 0;
        for (int i = 1; i <= len; i++) {
            total ^= i;
        }
        int odd = 0;
        for (int i = 1; i < len - 1; i += 2) {
            odd ^= encoded[i];
        }
        int[] res = new int[len];
        res[0] = total ^ odd;
        for (int i = 1; i < len; i++) {
            res[i] = res[i - 1] ^ encoded[i - 1];
        }

        return res;
    }

}
