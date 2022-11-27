import java.util.Vector;

//java.util
//duplicates are allowed
//insertion order is preserved

//1)both homogeneous/heterogeneous data 
//2)collection are not fixed in size / growable in nature
//3)utility method not there 
public class ListEx {

	public static void main(String[] args) {
		Vector<String> objects = new Vector<String>();// 10,20,25 (CC*3/2)+1
		System.out.println(objects.capacity());
		objects.add("rama");
		objects.add("suresh");
		objects.add("sandeep");
		objects.add("ramesh");
		objects.add("rama");
		objects.add("suresh");
		objects.add("sandeep");
		objects.add("ramesh");
		objects.add("rama");
		objects.add("mahesh");
		System.out.println(objects.capacity());
		objects.add("suresh");
		System.out.println(objects.capacity());
		System.out.println(objects);
	}

}
