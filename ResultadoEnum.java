package Proyecto;

public class ResultadoEnum {
	public int codigo;
	public String descripcion;
	
	public ResultadoEnum (int codigo ) {
		this.codigo = codigo;
		if(codigo == 0)
			this.descripcion = "Ganador";
		if(codigo == 1)
			this.descripcion = "Perdedor";
		else
			this.descripcion = "Empate";
	}
}