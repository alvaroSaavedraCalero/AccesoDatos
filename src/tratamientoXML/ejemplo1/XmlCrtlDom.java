package tratamientoXML.ejemplo1;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XmlCrtlDom {

	public final static String FICHERO = "cd_catalog.xml";
	public final static File CD_TEXTO = new File("catalogo.txt");

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, TransformerException {
		// Instanciamos el documento con el fichero .xml
		Document documento = instanciarDocument(new File(FICHERO));
		// Escribimos en el nuevo documento catalogo lo que recogemos en el "documento
		// DOM"
		escribeDocumentATextXml(documento, CD_TEXTO);
	}

	// crea el documento (de DOM)
	public static Document instanciarDocument() throws ParserConfigurationException {
		Document doc = null;
		doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		return doc;

	}

	public static void escribeDocumentATextXml(Document doc, File file) throws TransformerException {

		// escribe un documento como fichero xml

		Transformer trans = TransformerFactory.newInstance().newTransformer();

		trans.setOutputProperty(OutputKeys.INDENT, "yes");
		StreamResult result = new StreamResult(file);
		DOMSource source = new DOMSource(doc);
		trans.transform(source, result);
	}

//escribe un documento como fichero xml

	public static Document instanciarDocument(File fXmlFile)
			throws ParserConfigurationException, SAXException, IOException {

//lee un fichero XML y crea un documento (de dom, un arbol) en memoria)
		Document doc = null;
		doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fXmlFile);
		doc.getDocumentElement().normalize();
		return doc;

	}

}
