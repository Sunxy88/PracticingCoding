package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode690 {

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        Employee cur = null;

        for (Employee employee : employees) {
            map.put(employee.id, employee);
            if (employee.id == id) {
                cur = employee;
            }
        }

        int sum = 0;
        Deque<Employee> queue = new LinkedList<>();
        queue.addLast(cur);

        while (!queue.isEmpty()) {
            cur = queue.pollFirst();
            sum += cur.importance;
            for (Integer employee : cur.subordinates) {
                queue.addLast(map.get(employee));
            }
        }

        return sum;

    }

}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};