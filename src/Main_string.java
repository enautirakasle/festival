

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main_string {
	
	static void zerrendaPantailanIdatzi(ArrayList<String> zerrenda){
		Iterator<String> i = zerrenda.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
	
	public static <E> void main(String[] args) {
		//zerrenda pantailan atera
		
		
		ArrayList<String> ikasleZerrenda = new ArrayList<String>();
		
		ikasleZerrenda.add("Jon");
		ikasleZerrenda.add("Leire");
		ikasleZerrenda.add("Endika");
		ikasleZerrenda.add("Endika");
		ikasleZerrenda.add("Iraide");
		ikasleZerrenda.add("Aitor");
		ikasleZerrenda.add("Gorka");
		ikasleZerrenda.add("Enaut");
		
		//System.out.println("zerrenda luzera: " + ikasleZerrenda.size());
		
		for(int i = 0; i < ikasleZerrenda.size(); i++){
			System.out.println(ikasleZerrenda.get(i));
		}
		
		//irekin hastendirenak ezabatu
		for(int i = 0; i < ikasleZerrenda.size(); i++){
			if(ikasleZerrenda.get(i).charAt(0) == 'I'){
				ikasleZerrenda.remove(i);
			}
		}
		
		
		
		//iterator erabiliz zerrendatu.
		Iterator<String> iteratzaile = ikasleZerrenda.iterator();
		while(iteratzaile.hasNext()){
			System.out.println(iteratzaile.next().substring(0, 3));
		}
		
		//zerrenda ordenatu
		ikasleZerrenda.sort(null);
		System.out.println("\nZerrenda ordenatu ondoren alfabetikoki");
		zerrendaPantailanIdatzi(ikasleZerrenda);
		
		//zerrenda ordenatu aldrantziz
		ikasleZerrenda.sort(Collections.reverseOrder());
		System.out.println("\nZerrenda alderatziz ordenatuta");
		zerrendaPantailanIdatzi(ikasleZerrenda);
		
		System.out.println("\nzerrendatik atik hasitakoak kendu");
		iteratzaile = ikasleZerrenda.iterator();
		while(iteratzaile.hasNext()){
			if(iteratzaile.next().charAt(0) == 'A'){
				iteratzaile.remove();
			}
		}
		zerrendaPantailanIdatzi(ikasleZerrenda);
		
		

		
	}

}
