package Practicing;

import java.util.HashMap;

public class CollectionsProgramme {
	public static void main(String[] args) {
		
		
	HashMap<Integer,String> hm=new HashMap<>();
	
	hm.put(1, "Sun");
	hm.put(2,"mon");
	hm.put(3, "tue");
	
	//hm.forEach((k,v)->System.out.println(k+" "+v));
	
	//hm.keySet().forEach(f->System.out.println(hm.get(f)));
	
	hm.forEach((u,v)->{
		if(u>1) {
			System.out.println(hm.get(u));
	}
		
	});
  }

}
