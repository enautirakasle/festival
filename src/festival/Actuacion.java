package festival;


public class Actuacion {
	private String nombreGrupò;
	private int duracion;

	public Actuacion(String nombre_grupo, int duracion) {
		super();
		this.nombreGrupò = nombre_grupo;
		this.duracion = duracion;
	}

	public Actuacion() {
		
	}

	public String getNombreGrupo() {
		return nombreGrupò;
	}

	public void setNombreGrupo(String nombre_grupo) {
		this.nombreGrupò = nombre_grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String getInfo(){
		String info = this.getNombreGrupo() + " : " + this.getDuracion();
		return info;
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
