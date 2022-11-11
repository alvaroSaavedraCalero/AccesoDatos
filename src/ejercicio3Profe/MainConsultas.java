package ejercicio3Profe;

import com.db4o.Db4oEmbedded;
import com.db4o.EmbeddedObjectContainer;

public class MainConsultas {
	
	final static String DB4OFILENAME = "matriculasEj3_1.db4o";
	
	public static void main(String[] args) {
		EmbeddedObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DB4OFILENAME);
		
		try {
			
			
			
		} finally {
			db.close();
		}
	}

}
