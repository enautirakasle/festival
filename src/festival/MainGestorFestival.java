package festival;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainGestorFestival {

	public static void main(String[] args) {
		//crear una actuacion por programacion
		Actuacion a1 = new Actuacion();
		a1.setNombreGrupo("ac-dc");
		a1.setDuracion(90);
		
		//crear una actuacion con inputs del teclado
		Scanner scan = new Scanner(System.in);
		Actuacion a2 = new Actuacion();
		
		System.out.println("Introduce un nombre de grupo");
		a2.setNombreGrupo(scan.nextLine());
		
		System.out.println("Introduce una duracion de actuacion");
		a2.setDuracion(Integer.parseInt(scan.nextLine()));
		
		//crear una actuacion leyendo desde fichero
		File file = new File("D:/ficherosjava/actuaciones.txt");
		Scanner scanF = null;
		try {
			scanF = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String linea = scanF.nextLine();
		String[] partes = linea.split(":");
		
		Actuacion a3 = new Actuacion();
		a3.setNombreGrupo(partes[0]);
		a3.setDuracion(Integer.parseInt(partes[1]));
		
		//crear un festival por programacion con 3 actuaciones
		Festival festival = new Festival();
		festival.setNombre("Jazzaldia");
		festival.setPatrocinador("Heineken");
		
		ArrayList<Actuacion> actuaciones = new ArrayList<Actuacion>();
		actuaciones.add(a1);
		actuaciones.add(a2);
		actuaciones.add(a3);
		
		festival.setActuaciones(actuaciones);
		
		Actuacion a4 = new Actuacion();
		a4.setNombreGrupo("Mikel Laboa");
		a4.setDuracion(100);
		
		festival.addActuacion(a4);
		
		festival.addActuacion("Linkin Park", 95);
		
		festival.mostrarInfo();
		

	}

}
