import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorEx {
public static void main(String[] args) {
	ArrayList<String> objects = new ArrayList<String>();// 10,16,25 (CC*3/2)+1

	objects.add("ramakrishna");
	objects.add("suresh");
	objects.add("sandeep");
	objects.add(2,"ramesh");
	objects.add("ramakrishna");
	objects.add("mahesh");
	System.out.println(objects.lastIndexOf("ramakrishna"));//[.....]
	
	ListIterator<String> itr=objects.listIterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("**************************");
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	
	
//	
//	Iterator<String> itr=objects.iterator();
//	
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	
}
}
