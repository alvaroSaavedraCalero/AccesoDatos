package tratamientoXML.ejemplo2;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParserDemo {
	
	 public static void main(String[] args) {

	      try {
	         File inputFile = new File("clase.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize(); //**
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("alumno");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {//comprueba si el nodo recuperado es del tipo nodo
	               Element eElement = (Element) nNode;
	               System.out.println("numero de alumno : " 
	                  + eElement.getAttribute("numero"));
	               System.out.println("nombre : " 
	                  + eElement
	                  .getElementsByTagName("nombre")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("apellido : " 
	                  + eElement
	                  .getElementsByTagName("apellido")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("apodo : " 
	                  + eElement
	                  .getElementsByTagName("apodo")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("marcas : " 
	                  + eElement
	                  .getElementsByTagName("marcas")
	                  .item(0)
	                  .getTextContent());
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

}
