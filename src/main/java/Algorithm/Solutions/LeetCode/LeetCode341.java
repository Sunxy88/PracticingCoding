package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeetCode341 {
}

class NestedIterator implements Iterator<Integer> {

    private List<Integer> cache;
    private int ptr;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.cache = new ArrayList<>();
        ptr = 0;
        dfs(nestedList);
    }

    @Override
    public Integer next() {
        return cache.get(ptr++);
    }

    @Override
    public boolean hasNext() {
        return ptr < cache.size();
    }

    private void dfs(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                cache.add(nestedInteger.getInteger());
            } else {
                dfs(nestedInteger.getList());
            }
        }
    }
}

interface NestedInteger {

    boolean isInteger();

    Integer getInteger();

    List<NestedInteger> getList();

}