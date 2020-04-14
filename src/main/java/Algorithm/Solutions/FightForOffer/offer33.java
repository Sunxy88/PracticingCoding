package Algorithm.Solutions.FightForOffer;

public class offer33 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    private boolean recur(int[] postorder, int l, int r) {
        if (l >= r) return true;
        int i = l;
        while (postorder[i] < postorder[r]) i++;
        int m = i;
        while (postorder[i] > postorder[r]) i++;
        return i == r && recur(postorder, l, m - 1) && recur(postorder, m, r - 1);
    }
}
