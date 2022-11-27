import java.util.ArrayList;

public class ListExWithMethods {
	public static void main(String[] args) {
		ArrayList<String> objects = new ArrayList<String>();// 10,16,25 (CC*3/2)+1

		objects.add("ramakrishna");
		objects.add("suresh");
		objects.add("sandeep");
		objects.add("ramesh");
		objects.add("mahesh");
		System.out.println(objects.size());

		// objects.remove("mahesh");

		// System.out.println(objects);

		ArrayList<String> objects1 = new ArrayList<String>();
	//	objects1.add("rk");
	//	objects1.addAll(objects);
		System.out.println(objects1);

	//	objects1.removeAll(objects);
	//	objects1.retainAll(objects);
		//objects1.clear();
		System.out.println(objects1.isEmpty());
		System.out.println(objects1.containsAll(objects));

	}
}
