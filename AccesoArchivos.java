package principal;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AccesoArchivos {

	//Al crear una instancia de AccesoArchivos, el metodo constructor de la clase lee lo que hay guardado.
	public AccesoArchivos() {
		
		//Rutas a los arhivos, modificar segun la estructura de archivos de cada computadora
		String rutaResultados = "E:/JavaProy/integradorJavaUTN/src/principal/resultados.csv" ;
		String rutaPronosticos = "E:/JavaProy/integradorJavaUTN/src/principal/pronosticos.csv";
		
		System.out.println();
		System.out.println("RESULTADOS");
		System.out.println();
		
		//Lectura y muestra en pantalla de resultados
		try {
			for (String linea : Files.readAllLines(Paths.get(rutaResultados))){
			System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("PRONOSTICOS");
		System.out.println();
		
		//Lectura y muestra en pantalla de pronosticos
				try {
					for (String linea : Files.readAllLines(Paths.get(rutaPronosticos))){
					System.out.println(linea);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
}
