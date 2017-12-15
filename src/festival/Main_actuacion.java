package festival;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main_actuacion {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Actuacion> actuaciones = new ArrayList();

		// arraylista fitxategitik bete
		File f = new File("C:/Users/irakaslea/Documents/java_fitxategiak/actuaciones.txt");
		Scanner s = new Scanner(f);

		while (s.hasNextLine()) {
			String lerroa = s.nextLine();
			String[] zatiak = lerroa.split(",");
			Actuacion actuacion = new Actuacion(zatiak[0], // nombre grupo
					Integer.parseInt(zatiak[1]));
			actuaciones.add(actuacion);
		}

		Iterator<Actuacion> it = actuaciones.iterator();
		int duracion_total = 0;
		while (it.hasNext()) {
			Actuacion actuacion = it.next();
			duracion_total = duracion_total + actuacion.getDuracion();
		}

		System.out.println("Talde kop: " + actuaciones.size() + ", duracion total: " + duracion_total + ", media: "
				+ (duracion_total / actuaciones.size()));
	}

}
