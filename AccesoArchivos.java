package principal;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AccesoArchivos {

	//Al crear una instancia de AccesoArchivos, el metodo constructor de la clase lee lo que hay guardado.
	public AccesoArchivos() {
		
		//La forma que propone el curso de acceder a un archivo
		String rutaResultados = "E:/JavaProy/integradorJavaUTN/src/principal/resultados.csv" ;
		String rutaPronosticos = "E:/JavaProy/integradorJavaUTN/src/principal/pronosticos.csv";
		
		try {
			for (String linea : Files.readAllLines(Paths.get(rutaResultados))){
			System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
