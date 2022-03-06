
	
	import java.util.ArrayList;
	import java.util.Iterator;
	public class arrayList{
	public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<>();
			
			list.add("harshu");
			list.add("bhuvi");
			list.add("siri");
			list.add("usha");
			list.add("sindu");
			Iterator<String> itr = list.iterator();
			while(itr.hasNext()) {
			String value = itr.next();
				System.out.println(value);
			}
			
			for(String value : list) {
				
				//
				System.out.println(value);
			}
			
			//list.remove("Ajay");
		}

	}

