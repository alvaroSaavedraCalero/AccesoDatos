package ejercicio1;

import java.io.File;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.EmbeddedObjectContainer;
import com.db4o.ObjectSet;

public class MainPilots {

	public static void main(String[] args) {
		// Borraremos el fichero de base de datos
		new File("corredores.db4o").delete();

		// Creamos un nuevo archivo de base de datos
		EmbeddedObjectContainer db = Db4oEmbedded.openFile("corredores.db4o");

		try {

			// Creamos unos pilotos
			Pilot p1 = new Pilot("Michael Shumacher", 100);
			Pilot p2 = new Pilot("Rubens Barrichelo", 98);
			// Los almacenamos en la base de datos
			db.store(p1);
			db.store(p2);

			// Recuperamos los pilotos de la base de datos
			Pilot patron = new Pilot();
			ObjectSet<Object> result = db.queryByExample(patron);
			System.out.println("Listamos los corredores");
			listaCorredores(result);

			// otra forma de obtener todos los datos con otro patron
			ObjectSet<Object> resultOtro = db.queryByExample(new Object());
			System.out.println("Volvemos a listar: ");
			listaCorredores(resultOtro);

			// para eliminar objetos de la base de datos
			for (Object object : result) {
				db.delete(object);
			}
			ObjectSet<Object> resultEliminados = db.queryByExample(patron);
			System.out.println("Listamos los corredores eliminados");
			listaCorredores(resultEliminados);

		} finally {
			db.close();
		}

	}

	public static void listaCorredores(List<Object> result) {
		System.out.println(result.size());
		for (Object obj : result) {
			System.out.println(obj);
		}
	}

	public static void borrarDB() {

	}

}
