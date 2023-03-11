//Clase que abre un archivo y lo muestra completo por consola
//solo para pequenios archivos claro!!

package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Archivos {

	public static void mostrarContenido(String ruta) {
		// TODO Auto-generated method stub
		
		try {
			for (String linea : Files.readAllLines(Paths.get(ruta))){
			System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
