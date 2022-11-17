package tratamientoXML.ejemplo5;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class ListaAlumnos {
	
	public static void main(String[] args) {
		
		// instanciar un arryList de alumnos 
		
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
			
			// recorrer el arrayList de alumnos y por cada alumno creamos un nodo con los 
			// nodos correspondientes a sus atributos y con los datos que estan en el arrayList
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
