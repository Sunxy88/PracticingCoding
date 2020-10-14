package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode1002 {

    public List<String> commonChars(String[] A) {
        Map<Character, Integer> resMap = null;
        Map<Character, Integer> interMap;

        for (String str : A) {
            char[] s = str.toCharArray();
            interMap = new HashMap<>(s.length);
            for (int i = 0; i < s.length; i++) {
                if (interMap.containsKey(s[i])) {
                    interMap.put(s[i], interMap.get(s[i]) + 1);
                } else {
                    interMap.put(s[i], 1);
                }
            }

            if (resMap == null) {
                resMap = interMap;
            } else {
                Set<Character> keySet = new HashSet<>(resMap.keySet());
                for (Character resKey : keySet) {
                    if (!interMap.containsKey(resKey)) {
                        resMap.remove(resKey);
                    }
                }
                for (Character interKey : interMap.keySet()) {
                    if (resMap.containsKey(interKey)) {
                        resMap.put(interKey, Math.min(resMap.get(interKey), interMap.get(interKey)));
                    }
                }
            }
        }

        List<String> res = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : resMap.entrySet()) {
            String toAdd = entry.getKey().toString();
            int cnt = entry.getValue();
            for (int i = 0; i < cnt; i++) {
                res.add(toAdd);
            }
        }

        return res;
    }

}
