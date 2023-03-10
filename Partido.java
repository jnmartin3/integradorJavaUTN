package principal;

public class Partido {
	
	//Argumentos, segun lo propuesto por el practico
	//lo declaramos private para que solo puedan modificarse a traves de sus metodos
	
	private int Ronda;
	
	private int idPartido;
	
	private int idEquipo1;		//aqui trabajamos con el id del equipo y no su nombre que seria un String
	
	private int idEquipo2;		//aqui trabajamos con el id del equipo y no su nombre que seria un String
	
	private int golesEquipo1;
	
	private int golesEquipo2;
	

	//Metodos getters y setters que permiten acceder a los argumentos de forma controlada
	
	public int getIdPartido() {
		return idPartido;
	}
	
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	
	public int getIdEquipo1() {
		return idEquipo1;
	}
	
	public void setIdEquipo1(int idEquipo1) {
		this.idEquipo1 = idEquipo1;
	}
	
	public int getIdEquipo2() {
		return idEquipo2;
	}
	
	public void setIdEquipo2(int idEquipo2) {
		this.idEquipo2 = idEquipo2;
	}
	
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

}
