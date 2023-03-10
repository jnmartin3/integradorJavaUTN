//Tengo una duda de si el pronostico no deberia extender de la clase Partido,
// ya que cada nuevo pronostico (cada nueva instancia de esta clase) es siempre 
// sobre tal o cual partido.

//se estructura el pronostico segun el criterio propuesto en el archivo "[IMPORTANTE] Alternativa de (...) .pdf " del Drive.

package principal;

public class Pronostico /*extends Partido*/{

	//Argumentos, segun lo propuesto por el practico
	//lo declaramos private para que solo puedan modificarse a traves de sus metodos
	
	int idPronostico;
	int Player;			// id del jugador/a que hizo ese pronostico
	int Partido;		// id del partido sobre el cuál se pronosticó
	int Equipo;
	String Resultado;	// si GANA, PIERDE o EMPATA... indicando por defecto lo que paso al otro equipo de ese partido 
	
	//int Ronda; 		//Para Entrega 2
	
	//Metodos getters y setters que permiten acceder a los argumentos de forma controlada

	// ... 
	
	
	
	
}
