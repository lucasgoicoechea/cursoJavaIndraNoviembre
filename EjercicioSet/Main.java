import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		ElementoDeSet elemento1= new ElementoDeSet(50,"Serie 1");
		ElementoDeSet elemento2= new ElementoDeSet(40.8,"Serie 2");
		ElementoDeSet elemento3= new ElementoDeSet(72.3,"Serie 3");
		
		Set<ElementoDeSet> HashSet= new LinkedHashSet<>();		
		HashSet.add(elemento1);
		HashSet.add(elemento2);
		HashSet.add(elemento3);
		
		for(int i=0;i<HashSet.size();i++) {
			System.out.println(HashSet.iterator().next().toString());
		}
		
	}
}
