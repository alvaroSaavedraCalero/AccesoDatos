package tratamientoXML.ejemplo4;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Main {

	// listar titulo de cd, artistas, año
	public static void main(String[] args) {
		try {
			File file = new File("cd_catalog.xml");
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println(doc);

			System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("CD");
			System.out.println("--------------");

			for (int i = 0; i < nodeList.getLength(); i++) {

				Element element = (Element) nodeList.item(i);
				System.out.println(element);
				
				System.out.println("Titulo--> " + element.getElementsByTagName("TITTLE").item(0).getTextContent());
				System.out.println("Artistas--> ");
				for (int j = 0; j < element.getElementsByTagName("ARTIST").getLength(); j++) {
					System.out.println(element.getElementsByTagName("ARTIST").item(j).getTextContent());
				}
				System.out.println("Año--> " + element.getElementsByTagName("YEAR").item(0).getTextContent());

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
