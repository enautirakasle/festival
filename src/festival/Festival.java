package festival;

import java.util.ArrayList;
import java.util.Iterator;

public class Festival {
	private String nombre;
	private String patrocinador;
	private ArrayList<Actuacion> actuaciones;

	Festival(String nombre, String patrocinador) {
		this.nombre = nombre;
		this.patrocinador = patrocinador;
		this.actuaciones = new ArrayList<Actuacion>();
	}

	public Festival() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public ArrayList<Actuacion> getActuaciones() {
		return actuaciones;
	}

	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}
	


	public void eliminar(String nombre_grupo) {
		boolean eliminado = false;
		Iterator<Actuacion> i = this.actuaciones.iterator();
		while(i.hasNext()){
			if(i.next().getNombreGrupo().equals(nombre_grupo)){
				i.remove();
				eliminado = true;
			}
		}
		if(!eliminado){
			System.out.println(nombre_grupo + " no existe");
		}
	}

	public void cambiarDuracionActuacion(String nombre_grupo, int duracion) {
		boolean cambiado = false;
		for(int i= 0; i < this.actuaciones.size(); i++){
			if(this.actuaciones.get(i).getNombreGrupo().equals(nombre_grupo)){
				this.actuaciones.set(i, new Actuacion(nombre_grupo, duracion));
				cambiado = true;
			}
		}
		if(!cambiado){
			System.out.println(nombre_grupo + " no existe");
		}
		
	}
	
	public void addActuacion(Actuacion a){
		this.actuaciones.add(a);
	}
	
	/**
	 * 
	 * @param nombre nombre del grupo
	 * @param duracion duracion de la actuacion
	 */
	public void addActuacion(String nombre, int duracion){
		Actuacion a = new Actuacion();
		a.setNombreGrupo(nombre);
		a.setDuracion(duracion);
		
		this.actuaciones.add(a);
	}
	
	
	/**
	 * Muestra la informacion del festival en pantalla
	 * Muestra todas la actuaciones en pantalla
	 */
	public void mostrarInfo(){
		System.out.println(getNombre());
		System.out.println("Patrocidado por " + getPatrocinador());
		System.out.println("-------------");
		
		Iterator<Actuacion> i = actuaciones.iterator();
		
		while(i.hasNext()){
			Actuacion a = i.next();
			String infoActuacion = a.getInfo();
			System.out.println(infoActuacion);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
