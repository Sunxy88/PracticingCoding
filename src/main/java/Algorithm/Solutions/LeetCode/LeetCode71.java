package Algorithm.Solutions.LeetCode;

import java.util.Stack;

public class LeetCode71 {
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0)
            return "/";

        Stack<String> dirStack = new Stack<>();
        String[] p = path.split("/");

        for (int i = 0; i < p.length; i++) {
            if (p[i].equals("..")) {
                if (dirStack.isEmpty())
                    continue;
                dirStack.pop();
            } else if (p[i].equals(".")) {
                continue;
            } else if (p[i].length() > 0){
                dirStack.push(p[i]);
            }
        }

        Stack<String> toReverse = new Stack<>();
        while (!dirStack.isEmpty()) {
            toReverse.push(dirStack.pop());
            toReverse.push("/");
        }

        StringBuilder sb = new StringBuilder();
        while (!toReverse.isEmpty()) {
            sb.append(toReverse.pop());
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }
}
