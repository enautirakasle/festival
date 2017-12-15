

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main_int {
	public static final int zerrenda_luzera = 5;

	public static void pantailaratu(ArrayList zerrenda) {
		Iterator<Integer> i = zerrenda.iterator();
		while (i.hasNext()) {
			System.out.print(i.next());
			System.out.print("\t");
		}
		System.out.print("\n");
	}

	public static <E> void main(String[] args) {
		ArrayList zenbakiak = new ArrayList();
		Iterator<Integer> i;

		// arraylista bete aleatorioki
		for (int j = 0; j < zerrenda_luzera; j++) {
			int numero = ((int) (Math.random() * 10)) + 1;
			zenbakiak.add(numero);
		}
		pantailaratu(zenbakiak);
//
//		// 5 baino handiagoak ezabatu
//		System.out.println("5 baino haundiagoak ezabatu ondoren");
//		i = zenbakiak.iterator();
//		while (i.hasNext()) {
//			if (i.next() > 5) {
//				i.remove();
//			}
//		}
//		pantailaratu(zenbakiak);
//
//		// ordenayu
//		zenbakiak.sort(null);
//		System.out.println("ordenatura");
//		pantailaratu(zenbakiak);
//
//		// alderantziz ordenatu
//		zenbakiak.sort(Collections.reverseOrder());
//		System.out.println("alderantziz ordenatu");
//		pantailaratu(zenbakiak);
//
//		// 2.elementua kendu
//		zenbakiak.remove(1);
//		System.out.println("2. elementua kendu");
//		pantailaratu(zenbakiak);
//
		// elementu bakoitzari 2 gehitu adb 3 + 2 = 5
		Iterator<Integer> it = zenbakiak.iterator();
		while (it.hasNext()) {
			int balioa = it.next();
			zenbakiak.set(zenbakiak.indexOf(balioa), balioa + 2);

		}
		System.out.println("elementu bakoitza +2 eginda");
		pantailaratu(zenbakiak);

	}
}
