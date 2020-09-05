package Algorithm.Solutions.LeetCodeCompet;

public class CompeteQuestion5492 {
    public int numWays(String s) {
        long len;
        if (s == null || (len = s.length()) == 0)
            return 0;

        int oneCount = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
        }

        if (oneCount == 0) {
            long res = (len - 1) * (len - 2) / 2;
            return (int)(res % 1000000007);
        }

        int tmp = oneCount / 3;
        if (tmp * 3 != oneCount) {
            return 0;
        }

        oneCount = 0;
        long firtPos = -1;
        long secondPos = -1;
        long thirdPos = -1;
        long forthPos = -1;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
                if (firtPos != -1 && secondPos == -1) {
                    secondPos = i;
                }
                if (firtPos == -1 && oneCount == tmp) {
                    firtPos = i;
                }
                if (thirdPos != -1 && forthPos == -1) {
                    forthPos = i;
                }
                if (secondPos != -1 && oneCount == tmp * 2) {
                    thirdPos = i;
                }

            }
        }

        long res = (secondPos - firtPos) * (forthPos - thirdPos);
        return (int)(res % 1000000007);
    }
}
