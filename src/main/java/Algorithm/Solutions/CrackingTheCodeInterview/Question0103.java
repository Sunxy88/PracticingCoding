package Algorithm.Solutions.CrackingTheCodeInterview;

public class Question0103 {

    public String replaceSpaces(String S, int length) {
        char[] cs = S.toCharArray();

        int ptrChar = length - 1, ptrBlank = cs.length - 1;

        while (ptrChar >= 0) {
            if (cs[ptrChar] == ' ') {
                cs[ptrBlank--] = '0';
                cs[ptrBlank--] = '2';
                cs[ptrBlank--] = '%';
            } else {
                cs[ptrBlank--] = cs[ptrChar];
            }
            ptrChar--;
        }

        return String.valueOf(cs, ptrBlank + 1, cs.length - ptrBlank - 1);
    }

}
