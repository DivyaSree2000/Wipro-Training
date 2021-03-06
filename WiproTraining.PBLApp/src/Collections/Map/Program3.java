package Collections.Map;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;


public class Program3 {

    public static void main(String[] args) {
        Properties states = new Properties();

        states.setProperty("West Bengal", "Kolkata");
        states.setProperty("Bihar", "Patna");
        states.setProperty("Jharkhand", "Ranchi");

        Set<Entry<Object, Object>> set = states.entrySet();
        Iterator<Entry<Object, Object>> it = set.iterator();

        while (it.hasNext()) {
            Entry<Object, Object> me = it.next();
            System.out.println(me);
        }
    }

}