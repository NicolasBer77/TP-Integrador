package Proyecto;

public class Partido {

	    public Equipo equipoLocal;
	    public Equipo equipoVisitante;
	    public int golesEquipo1;
	    public int golesEquipo2;
	    
	    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesEquipo1, int golesEquipo2) {
	        this.equipoLocal = equipoLocal;
	        this.equipoVisitante = equipoVisitante;
	        this.golesEquipo1 = golesEquipo1;
	        this.golesEquipo2 = golesEquipo2;
	    }
	    
	    public ResultadoEnum Resultado(Equipo equipo) {
//	    	System.out.println("Calculando puntos del Partido");
//	    	System.out.println("Calculando nombre vs visitante: "+ equipo.nombre  +"---"+ this.equipoLocal.nombre);
	    	
	    	if(equipo.nombre.equals(this.equipoLocal.nombre)) {
//	    		System.out.println("comparando goles equipo1 vs equipo2: "+this.golesEquipo1+"---"+this.golesEquipo2);
	    		if(this.golesEquipo1 > this.golesEquipo2) {
//	    			System.out.println("goles 1 es mayor a goles 2 retorno cero: ");
	    			return new ResultadoEnum(0);
	    		}
	    		if(this.golesEquipo1 < this.golesEquipo2) {
	    			return new ResultadoEnum(1);
	    		}
	    	}
	    				
	    	if(this.golesEquipo2 > this.golesEquipo1) {
	    		if(golesEquipo2 > this.golesEquipo1) {
	    			return new ResultadoEnum(0);
	    		}
	    		if(this.golesEquipo2 < this.golesEquipo1) {
	    			return new ResultadoEnum(1);
	    		}
	    	}
	    		
	    	return new  ResultadoEnum(2);	
	}
}


