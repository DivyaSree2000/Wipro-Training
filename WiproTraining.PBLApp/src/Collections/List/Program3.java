package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Program3 {
	public static void printAll(ArrayList arr) {
		Iterator<String> itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("January");
		l1.add("February");
		l1.add("March");
		l1.add("April");
		l1.add("May");
		l1.add("June");
		l1.add("July");
		l1.add("August");
		l1.add("September");
		l1.add("October");
		l1.add("November");
		l1.add("December");
		printAll(l1);
	}

}
