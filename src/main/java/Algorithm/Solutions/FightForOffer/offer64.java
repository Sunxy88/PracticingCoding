package Algorithm.Solutions.FightForOffer;

public class offer64 {

    public int sumNums(int n) {
        int sum = n;
        boolean b = n > 0 && (sum += sumNums(n - 1)) > 0;
        return sum;
    }

}
