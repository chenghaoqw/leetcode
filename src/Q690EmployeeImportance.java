import java.util.HashMap;
import java.util.List;

public class Q690EmployeeImportance {
    HashMap<Integer, Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees) map.put(e.id, e);
        return dfs(id);
    }

    public int dfs(int id) {
        Employee e = map.get(id);
        int r = e.importance;
        for (int i : e.subordinates) r += dfs(i);
        return r;
    }

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        int id;
        // the importance value of this employee
        int importance;
        // the id of direct subordinates
        List<Integer> subordinates;
    }

    ;
}
