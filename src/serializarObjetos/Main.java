package serializarObjetos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) {
		File fichero = new File("ruta");
		ObjectOutputStream objectOutputStream;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(fichero));
			for (int i = 0; i < 5; i++) {
				Persona persona = new Persona(i);
				objectOutputStream.writeObject(persona);
			}
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
