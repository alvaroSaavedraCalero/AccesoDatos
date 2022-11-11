package ficheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeeCaracteres {

	public static void main(String[] args) {
		
		leerFichero();
		escribirFichero();
		leerFichero();
		
	}
	
	public static void leerFichero() {
		try {
			// Guardamos en un objeto de tipo FileReader la ruta del archivo del que queremos leer
			FileReader fileReader = new FileReader("C:\\Users\\alumno\\Desktop\\HolaMundo.txt");

			// guardamos en assci el caracter primero
			int assci = fileReader.read();

			// El ultimo caracter que lee es -1
			while (assci != -1) {
				// transformamos el caracter assci en char para ver el caracter
				System.out.print((char) assci);
				// leemos el siguiente caracter
				assci = fileReader.read();
			}
			System.out.println();
			// vemos el ultimo caracter y cerramos
			System.out.println(assci);
			fileReader.close();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	// elimina el contenido del fichero y escribe lo que le pongamos
	public static void escribirFichero() {
		try {
			// Creamos un fileWriter con la ruta del fichero
			FileWriter fileWriter = new FileWriter("C:\\Users\\alumno\\Desktop\\HolaMundo.txt");
			// guardamos la cadena
			String cadenaString = "me cago en mis muertos";
			// iteramos en el string para guardar caracter a caracter
			for (int i = 0; i < cadenaString.length(); i++) {
				char c = cadenaString.charAt(i);
				fileWriter.write(c);
			}
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
