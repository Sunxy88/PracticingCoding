package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.Node;

import java.util.HashMap;
import java.util.Map;

public class LeetCode133 {

    public Node cloneGraph(Node node) {
        Map<Node, Node> lookup = new HashMap<>();
        return dfs(node, lookup);
    }

    private Node dfs(Node node, Map<Node, Node> lookup) {
        if (node == null) return null;
        if (lookup.containsKey(node)) return lookup.get(node);
        Node clone = new Node(node.val);
        lookup.put(node, clone);
        for (Node n : node.neighbors)
            clone.neighbors.add(dfs(n, lookup));
        return clone;
    }

}
