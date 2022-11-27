import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> employees = new TreeMap<Integer, String>();

		employees.put(123, "suresh");
		employees.put(824, "naresh");
		employees.put(512, "ramesh");
		employees.put(623, "rajesh");
		employees.put(123, "rk");
		employees.put(1283, "mahesh");
		System.out.println(employees);
	}
}
