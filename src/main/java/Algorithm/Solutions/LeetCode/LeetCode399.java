package Algorithm.Solutions.LeetCode;


import java.util.*;

public class LeetCode399 {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int numberVars = 0;
        Map<String, Integer> vars = new HashMap<>();

        int numberEquations = equations.size();
        for (List<String> equation : equations) {
            if (!vars.containsKey(equation.get(0))) {
                vars.put(equation.get(0), numberVars++);
            }
            if (!vars.containsKey(equation.get(1))) {
                vars.put(equation.get(1), numberVars++);
            }
        }

        List<Pair>[] edges = new List[numberVars];
        for (int i = 0; i < numberVars; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < numberEquations; i++) {
            int va = vars.get(equations.get(i).get(0)), vb = vars.get(equations.get(i).get(1));
            edges[va].add(new Pair(vb, values[i]));
            edges[vb].add(new Pair(va, 1.0 / values[i]));
        }

        int numberQueries = queries.size();
        double[] res = new double[numberQueries];
        for (int i = 0; i < numberQueries; i++) {
            List<String> query = queries.get(i);
            double result = -1.0;
            if (vars.containsKey(query.get(0)) && vars.containsKey(query.get(1))) {
                int ia = vars.get(query.get(0)), ib = vars.get(query.get(1));
                if (ia == ib) {
                    result = 1.0;
                } else {
                    Queue<Integer> points = new LinkedList<>();
                    points.offer(ia);
                    double[] ratios = new double[numberVars];
                    Arrays.fill(ratios, -1.0);
                    ratios[ia] = 1.0;

                    while (!points.isEmpty() && ratios[ib] < 0) {
                        int x = points.poll();
                        for (Pair pair : edges[x]) {
                            int y = pair.index;
                            double val = pair.value;
                            if (ratios[y] < 0) {
                                ratios[y] = ratios[x] * val;
                                points.offer(y);
                            }
                        }
                    }
                    result = ratios[ib];
                }
            }
            res[i] = result;
        }

        return res;
    }

}

class Pair {
    int index;
    double value;

    Pair(int index, double value) {
        this.index = index;
        this.value = value;
    }
}
