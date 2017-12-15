package festival;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Actuacion>{

	public int compare(Actuacion arg0, Actuacion arg1) {
		// TODO Auto-generated method stub
		if(arg0.getNombreGrupo().compareTo(arg1.getNombreGrupo()) > 0){
			return 1;
		}else if(arg0.getNombreGrupo().compareTo(arg1.getNombreGrupo()) < 0){
			return -1;
		}else{
			return 0;
		}
	}
	
//	public int compare(Actuacion arg0, Actuacion arg1) {
//
//		if(arg0.getNombre_grupo().length() > arg1.getNombre_grupo().length()){
//			return 1;
//		}else if(arg0.getNombre_grupo().length() < arg1.getNombre_grupo().length()){
//			return -1;
//		}else{
//			return 0;
//		}
//	}
}
