package Algorithm.Solutions.FightForOffer;

public class offer20 {

    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        boolean isNum = false, isDot = false, iseE = false;
        char[] str = s.trim().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= '0' && str[i] <= '9') {
                isNum = true;
            } else if (str[i] == '.') {
                if (isDot || iseE) {
                    return false;
                }
                isDot = true;
            } else if (str[i] == 'e' || str[i] == 'E') {
                if (!isNum || iseE) {
                    return false;
                }
                iseE = true;
                isNum = false;
            } else if (str[i] == '+' || str[i] == '-') {
                if (i != 0 && str[i - 1] != 'e' && str[i - 1] != 'E') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return isNum;
    }

}
