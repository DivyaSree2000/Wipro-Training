package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
        set.add("Alan");
        set.add("Binny");
        set.add("Caitlyn");
        set.add("Dio");

        Iterator<String> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
	}

}
