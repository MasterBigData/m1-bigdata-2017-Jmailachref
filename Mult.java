import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Mult {
	/*Question 1
public static List<Integer > mult( int a,List<Integer> l){
	List<Integer> l1 = l;
	for (int i=0 ; i<l.size();i ++ ) {
		l1.set(i,a*l1.get(i));
	}
	return l1;
}*/

	
	public static AbstractSequentialList<Integer> mult( int a,List<Integer> l){
	return new AbstractSequentialList<Integer>() {

		/*@Override
		public Integer get(int index) {
			
			return a*l.get(index);
		}*/

		@Override
		public int size() {
			
			return l.size();
		}

		@Override
		public ListIterator<Integer> listIterator(int arg0) {
			
			return  l.listIterator();
		}
		
		
		
		
	};
}
	public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
	for (int i = 0; i < 1000000; i++) {
	al.add(i);
	}
	long t0 = System.nanoTime();
	List<Integer> ret = Mult.mult(2, al);
	long sum=0;
	for(int val : ret) {
	sum+=val/2;
	}
	System.out.println((System.nanoTime() - t0));
	LinkedList<Integer> ll = new LinkedList<>();
	for (int i = 0; i < 1000000; i++) {
	ll.add(i);
	}
	t0 = System.nanoTime();
	sum=0;
	ret = Mult.mult(2, ll);
	for(int val : ret) {
	sum+=val/2;
	}
	System.out.println((System.nanoTime() - t0));

	}
}
