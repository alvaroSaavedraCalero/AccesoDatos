package serializarObjetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) {
		
		
		
	}
	
	public static void escribir() {
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
	
	public static void leer() {
		File fichero = new File("ruta");
		ObjectInputStream objectInputStream;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream(fichero));
			Object object = objectInputStream.readObject();
			
			while (object != null) {
				if (object instanceof Persona) {
					System.out.println(object.toString());
					objectInputStream.readObject();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
