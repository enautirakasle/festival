package festival;

import java.util.Scanner;

public class Main_menu_festival {

	static final int ANADIR_ACTUACION = 1;
	static final int MOSTRAR_INFO_FESTIVAL = 2;
	static final int MODIFICAR_ACTUACION = 3;
	static final int ELIMINAR_ACTUACION = 4;
	static final int ORDENAR_ACTUACIONES_POR_NOMBRE = 5;
	static final int ORDENAR_ACTUACIONES_POR_DURACION = 6;
	static final int SALIR = 7;

	public static void main(String[] args) {

		// crear Festival o instanciar Festival
		Festival festival = new Festival("BBK Live", "BBK");

		// rellenar festival con acutaciones por programacion
		festival.addActuacion(new Actuacion("su ta gar", 120));
		festival.addActuacion(new Actuacion("berri txarrak", 90));
		festival.addActuacion(new Actuacion("ken7", 100));
		festival.addActuacion(new Actuacion("etsaiak", 60));

		int opcion, duracion;
		String nombre_grupo;
		do {

			Scanner s = new Scanner(System.in);
			System.out.println("\nIntroduce una opcion:" 
					+ "\n1 anadir actuacion" 
					+ "\n2 mostrar info total"
					+ "\n3 cambiar duracion de actuacion" 
					+ "\n4 eliminar actuacion" 
					+ "\n5 ordenar festival por nombre"
					+ "\n6 ordenar festival por duracion descendente"
					+ "\n7 salir");
			
			opcion = Integer.parseInt(s.nextLine());
			switch (opcion) {
			case ANADIR_ACTUACION:
				// recoger datos
				System.out.println("Introduce nombre grupo:");
				nombre_grupo = s.nextLine();
				System.out.println("Introduce duracion:");
				duracion = Integer.parseInt(s.nextLine());

				festival.addActuacion(new Actuacion(nombre_grupo, duracion));

				break;
			case MOSTRAR_INFO_FESTIVAL:
				festival.mostrarInfo();

				break;
			case MODIFICAR_ACTUACION:
				System.out.println("Introduce nombre grupo:");
				nombre_grupo = s.nextLine();
				System.out.println("Introduce duracion nueva:");
				duracion = Integer.parseInt(s.nextLine());

				festival.cambiarDuracionActuacion(nombre_grupo, duracion);

				break;
			case ELIMINAR_ACTUACION:
				System.out.println("Introduce nombre grupo para eliminar:");
				nombre_grupo = s.nextLine();

				festival.eliminar(nombre_grupo);
				break;
			case ORDENAR_ACTUACIONES_POR_NOMBRE:
				festival.getActuaciones().sort(new ComparatorNombre());
				break;
			case ORDENAR_ACTUACIONES_POR_DURACION:
				festival.getActuaciones().sort(new ComparatorDuracion());
				break;
			default:
				System.out.println("Opcion incorrecta");

			}
		} while (opcion != SALIR);

	}

}
