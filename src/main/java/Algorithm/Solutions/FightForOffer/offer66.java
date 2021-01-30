package Algorithm.Solutions.FightForOffer;

public class offer66 {

    public int[] constructArr(int[] a) {
        int n;
        if (a == null || (n = a.length) == 0) {
            return new int[0];
        }

        int[] ans = new int[n];
        int left = 1, right = 1;

        for (int i = 0; i < n; i++) {
            ans[i] = left;
            left *= a[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= a[i];
        }

        return ans;
    }

}
