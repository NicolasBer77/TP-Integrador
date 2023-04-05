package Proyecto;


public class Pronostico {
    public int codigoPartido;
    public Equipo equipo;
    public ResultadoEnum resultado;
    

    public Pronostico(int codigoPartido, Equipo equipo, int codigo) {
        this.codigoPartido = codigoPartido;
        this.equipo = equipo;
        this.resultado = new ResultadoEnum(codigo);
    }

    public int Puntos(Partido partido) {
//    	System.out.println("Calculando puntos del pronostico");
//    	System.out.println("Calculando resultado del partido, con codigo: "+partido.Resultado(equipo).codigo);
//    	System.out.println("Calculando resultado del pronistico, con codigo: "+this.resultado.codigo);
    	if(partido.Resultado(equipo).codigo == this.resultado.codigo) {
//    		System.out.println("Retornando 3 puntos");
    		return 3;
    	} 
    	return 0;       
    }
}

