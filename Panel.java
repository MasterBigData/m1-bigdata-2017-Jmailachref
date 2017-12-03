

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;


public class Panel  {
	
	
	public static Iterator<Integer> Panel1(int a , int b){
		return new Iterator<Integer>() {
			int min = a;
			@Override
			public boolean hasNext() {
		
				return (min<=b);
			}

			@Override
			public Integer next() {
				if (this.hasNext() ) {
				return min++;
					
				}
				else  throw new IllegalStateException("Pas de next existant");
							
				
			}
		
		
		
	//	return new NotreClasse(a,b);
		
	};}
public static Iterable<Integer> Panel2(int a,int b){
	return new Iterable<Integer>(){
		int debut=a;
		public Iterator<Integer> iterator() {
			return Panel1(debut,b);
		}
	};
}
	


public static List<Integer> panel( int a, int b){
	return new AbstractList<Integer>(){
	
		@Override
		public Integer get(int i) {
			
			return a+i;
		}
		@Override
		public int size() {
			
			return b-a+1;
		}
			
			
	}
	;
}

public static void main(String[] args) {
for(int i:Panel2(1,5))
 System.out.println(i);
 List<Integer> l = panel(3,6);
 for(int i:l) {
 System.out.println(i);
 //affiche 3 4 5 6
 }
System.out.println(l.get(1));
}
//Question1
     /* static class NotreClasse implements Iterator<Integer>  {
	     
		private int debut;
		private int end;

		public NotreClasse(int a, int b) {
			if (a<b) {
			
			debut =a;
			end=b;}
			else throw new IllegalArgumentException("debut supérieur à la fin");
		}
		public int getDebut() {
			return debut;
		}
		public int getEnd() {
			return end;
		}
		public void setDebut(int a) {
			debut=a;
		}

			@Override
			public boolean hasNext() {
			
				if (this.getDebut()>this.getEnd())
				return false;
				
				return true;
			}

			@Override
			public Integer next() {
				if (this.hasNext() ) {
					int a = this.getDebut();
					this.setDebut(getDebut()+1);
					return a;
					
				}
				else  throw new IllegalStateException("Pas de next existant");
							
				
			}


		}



public static void main(String[] args) {
	Iterator<Integer> it=Panel1(1,5);
	 for(;it.hasNext();)
	 System.out.println(it.next()); // affiche 1 2 3 4 5
}
*/


}



