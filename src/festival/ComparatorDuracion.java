package festival;

import java.util.Comparator;

public class ComparatorDuracion implements Comparator<Actuacion>{

	public int compare(Actuacion arg0, Actuacion arg1) {
		// TODO Auto-generated method stub
		if(arg0.getDuracion() > arg1.getDuracion()){
			return -1;
		}else if(arg0.getDuracion() < arg1.getDuracion()){
			return 1;
		}else{
			return 0;
		}
	}

}
