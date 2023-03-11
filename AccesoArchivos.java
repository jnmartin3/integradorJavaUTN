package principal;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AccesoArchivos {

	//Al crear una instancia de AccesoArchivos, el metodo constructor de la clase lee lo que hay guardado.
	public AccesoArchivos() {
		
		//Rutas a los arhivos, modificar segun la estructura de archivos de cada computadora
		String rutaResultados = "E:/JavaProy/integradorJavaUTN/src/principal/resultados.csv" ;
		String rutaPronosticos = "E:/JavaProy/integradorJavaUTN/src/principal/pronosticos.csv";
		
		//Arreglo bidimensional (tabla) de 2 filas y 6 columnas
		//que uso para "alojar" los datos del archivo resultadod
		String[][] campos = new String[2][6];
		int i = 0;
		
		System.out.println();
		System.out.println("RESULTADOS");
		System.out.println();
		
		//Metodo que cree para mostrar rapidamente por consola que contiene cada archivo
		//hay que enviarle la ruta del archivo a abrir
		Archivos.mostrarContenido(rutaResultados);
						
		try {
			
			//para cada linea del archivo que estoy abriendo... 
			for (String linea : Files.readAllLines(Paths.get(rutaResultados))){
				
				//la corto segun los separadores coma "," y se la asigno a la fila i
				campos[i] = linea.split(",");
				
				/* PA DESPUES
				 * validacion de extension de linea de cada archivo usando
				 * campos.lenght que devuelve cantidad de elementos como int
				 */
				
				//incremento el valor de la fila para el proximo bucle
				i++;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//al salir del try-catch tengo un arreglo de dos dimensiones
		//cuyas filas contienen las lineas del archivo, separadas
		
		//sabiendo donde se ubica cada dato puedo acceder, leer, operar con ellos, etc. 
		//por ejemplo imprimiendo el elemento 4 de la segunda fila				
		System.out.println(campos[1][3]);
		
		if(Integer.parseInt(campos[0][4]) > Integer.parseInt(campos[0][5])) System.out.println("Gano " + campos[0][2]);
		
	}
	
}
