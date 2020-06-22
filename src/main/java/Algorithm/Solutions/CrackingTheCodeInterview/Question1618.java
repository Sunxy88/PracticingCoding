package Algorithm.Solutions.CrackingTheCodeInterview;

public class Question1618 {
    public boolean patternMatching(String pattern, String value) {
        if (pattern.length() == 0) {
            return value.length() == 0;
        }
        if (value.length() == 0) {
            for (int i = 1; i < pattern.length(); i++) {
                if (pattern.charAt(i - 1) != pattern.charAt(i))
                    return false;
            }
            return true;
        }


        int countA = 0, preA = 0, haveA = -1, countB = 0, preB = 0, haveB = -1;

        for (Character c : pattern.toCharArray()) {
            if (c == 'a') {
                countA++;
                if (haveA == -1) {
                    preA = countB;
                    haveA = 1;
                }
            } else {
                countB++;
                if (haveB == -1) {
                    preB = countA;
                    haveB = 1;
                }
            }
        }

        if (countA == 1 || countB == 1)
            return true;
        if ((countA == 0 && value.length() % countB != 0) || (countB == 0 && value.length() % countA != 0))
            return false;
        int aLength = 0;
        if (countA != 0)
            aLength = value.length() / countA;

        for (int lenA = 0; lenA <= aLength; lenA++) {
            if (countB != 0 && (value.length() - countA * lenA) % countB != 0)
                continue;
            int lenB = 0;
            if (countB != 0)
                lenB = (value.length() - countA * lenA) / countB;
            String patternA = value.substring(preA * lenB, preA * lenB + lenA);
            String patternB = value.substring(preB * lenA, preB * lenA + lenB);
            int posValue = 0, posPattern = 0;
            while (posValue < value.length() && posPattern < pattern.length()) {
                if (lenA != 0 && pattern.charAt(posPattern) == 'a') {
                    if (posValue + lenA <= value.length() && value.substring(posValue, posValue + lenA).equals(patternA)) {
                        posValue += lenA;
                    } else {
                        break;
                    }
                } else if (lenB != 0 && pattern.charAt(posPattern) == 'b') {
                    if (posValue + lenB <= value.length() && value.substring(posValue, posValue + lenB).equals(patternB)) {
                        posValue += lenB;
                    } else {
                        break;
                    }
                } else {
                    posValue++;
                }
                posPattern++;
            }
            if (posValue >= value.length())
                return true;
        }
        return false;
    }
}
