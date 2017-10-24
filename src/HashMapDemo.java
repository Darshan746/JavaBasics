import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> str = new HashMap<>();
		str.put("raman", "hi");
		str.put("fdf", "sss");
		str.put("hio", "kdnvdsn");
		
		Set s= str.entrySet();
		Iterator it = str.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry e = (Map.Entry) it.next();
			System.out.println(e.getKey()+"= "+e.getValue());
			//System.out.println(it.next());
		}
		
		for(Entry c : str.entrySet())
		{
			System.out.println(c.getKey());
		}
		
		

	}

}
