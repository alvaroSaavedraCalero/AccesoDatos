package ejercicio3;

import java.util.List;
import com.db4o.Db4oEmbedded;
import com.db4o.EmbeddedObjectContainer;
import com.db4o.query.Predicate;
import com.db4o.query.Query;

public class Consultas {

	final static String DB4OFILENAME = "matriculas.db4o";

	public static void main(String[] args) {

		EmbeddedObjectContainer dbContainer = Db4oEmbedded.openFile(DB4OFILENAME);

		try {

			/*
			 * System.out.
			 * println("Consulta los datos de los alumnos que tengan primer apellido Ruano"
			 * ); // Consulta los datos de los alumnos que tengan primer apellido Ruano
			 * List<Alumno> resultAlumnos = dbContainer.queryByExample(new Alumno(null,
			 * null, null, "Ruano", null)); for (Alumno alumno : resultAlumnos) {
			 * System.out.println("\t" + alumno.getApellido1() + ", " + alumno.getDni());
			 * List<Notas_Alumno> notas_Alumnos = alumno.getModuloNota(); for (Notas_Alumno
			 * nota : notas_Alumnos) { System.out.println("\t\t" + '-' +
			 * nota.getModulo().getNombre() + ", " + nota.getNotaExtraordinaria()); } }
			 * 
			 * System.out.println("------------------------------------");
			 * System.out.println("modulos que tienen mas de 100 horas"); // modulos que
			 * tienen mas de 100 horas Query query1 = dbContainer.query(); // le decimos el
			 * tipo de dato que nos va a sacar y el atributo por el que tiene que filtrar
			 * query1.constrain(Modulo.class);
			 * query1.descend("horas").constrain(100).greater(); List<Modulo> resultadoMod =
			 * query1.execute(); for (Modulo modulo : resultadoMod) {
			 * System.out.println("\t" + '-' + modulo.getNombre() + ", " + modulo.getHoras()
			 * + ", " + modulo.getCurso()); }
			 * 
			 * System.out.println("--------------------------");
			 * System.out.println("Nota del alumno con dni 1 en el modulo 0486"); Query
			 * query2 = dbContainer.query(); query2.constrain(Notas_Alumno.class);
			 * Constraint constraintModulo =
			 * query2.descend("modulo").descend("codigo").constrain("0486").equal();
			 * query2.descend("alumno").descend("dni").constrain("1").equal().and(
			 * constraintModulo);
			 * 
			 * List<Notas_Alumno> resultNotas_Alumnos = query2.execute(); for (Notas_Alumno
			 * notas_Alumno : resultNotas_Alumnos) { System.out.println("\t" + '-' +
			 * notas_Alumno.getModulo().getNombre() + " / " +
			 * notas_Alumno.getAlumno().getNombre() +
			 * notas_Alumno.getAlumno().getApellido1() + " / " + notas_Alumno.getNota() +
			 * " / " + notas_Alumno.getNotaExtraordinaria()); }
			 * 
			 * 
			 * // Consulta soda para averiguar las notas ordinaria y extraodinaria de //
			 * Catalina Sanchez en los modulos de primer curso
			 * System.out.println("-------------------------"); System.out.
			 * println("Nota ordinaria y extraodinaria de Catalina Sanchez en los modulos del primero curso"
			 * ); Query query3 = dbContainer.query(); query3.constrain(Notas_Alumno.class);
			 * Constraint constraintAlumnoNombre =
			 * query3.descend("alumno").descend("nombre").constrain("Pablo").equal();
			 * Constraint constraintAlumnoApellido =
			 * query3.descend("alumno").descend("apellido1").constrain("Santos").equal();
			 * query3.descend("modulo").descend("curso").constrain("primero").equal().and(
			 * constraintAlumnoNombre).and(constraintAlumnoApellido);
			 * 
			 * 
			 * List<Notas_Alumno> resultModulosAlumno = query3.execute(); for (Notas_Alumno
			 * notas_Alumno : resultModulosAlumno) { System.out.println("\t" +
			 * notas_Alumno.getAlumno().toString()); System.out.println("\t\t" +
			 * "Nota ordinaria = " + notas_Alumno.getNota() + ", Nota extraordinaria = " +
			 * notas_Alumno.getNotaExtraordinaria()); }
			 * 
			 
			// Calificar al alumno con dni 1 con un 4 en la ordinaria y un 10 en la
			// extraordinaria en el modulo 486
			System.out.println(
					"Calificar al alumno con dni 1 con un 4 en la ordinaria y un 10 en la extraordinaria en el modulo 486");
			Query query2 = dbContainer.query();
			query2.constrain(Notas_Alumno.class);
			Constraint constraintModulo = query2.descend("modulo").descend("codigo").constrain("486").equal();
			query2.descend("alumno").descend("dni").constrain("1").equal().and(constraintModulo);

			List<Notas_Alumno> resultNotas_Alumnos = query2.execute();
			for (Notas_Alumno notas_Alumno : resultNotas_Alumnos) {

				// Actualizamos el dato
				notas_Alumno.setNota(4);
				notas_Alumno.setNotaExtraordinaria(10);
				dbContainer.store(notas_Alumno);

			}
			System.out.println("------------------------");
			MainMatriculas.listaTodasNotas(dbContainer);
			
			
			
			
			// Todas las notas tendran null en las dos notas excepto las notas que sean mayor que 1
			
			System.out.println("Todas las notas tendran null en las dos notas excepto las notas que sean mayor que 1");
			Query query = dbContainer.query();
			query.constrain(Notas_Alumno.class);
			
			List<Notas_Alumno> resultado = query.execute();
			for (Notas_Alumno notas_Alumno : resultado) {
				if (notas_Alumno.getNota() > 1 && notas_Alumno.getNotaExtraordinaria() > 1) {
					notas_Alumno.setNota(null);
					notas_Alumno.setNotaExtraordinaria(null);
					dbContainer.store(notas_Alumno);
				}
			}
			MainMatriculas.listaTodasNotas(dbContainer);


			
			
			// Consulta los datos de los alumnos que tengan primer apellido Ruano con query nativa
			Predicate<Alumno> alumnoPredicate = new Predicate<Alumno>() {

				@Override
				public boolean match(Alumno alumno) {
					return alumno.getApellido1().equals("Ruano");
				}
			};
			List<Alumno> resultado = dbContainer.query(alumnoPredicate);
			for (Alumno alumno : resultado) {
				System.out.println(alumno.toString());
			}
			
			
			// esta mal 
			System.out.println("Eliminar un alumno");
			Query query = dbContainer.query();
			query.constrain(Alumno.class);
			
			
			List<Alumno> alumnos = query.execute();
			dbContainer.delete(alumnos.get(0));
			
			MainMatriculas.listaTodosAlumnos(dbContainer);
			
			
			
			// Encuentrar el notasAlumno correspondiente al alumno con dni 1 y matriculado en el modulo 486
			Predicate<Notas_Alumno> notasAlumnoPredicate = new Predicate<Notas_Alumno>() {
				
				@Override
				public boolean match(Notas_Alumno alumno_nota) {
					return alumno_nota.getAlumno().getDni().equals("1") && alumno_nota.getModulo().getCodigo().equals("486");
				}
			};
			List<Notas_Alumno> resultado = dbContainer.query(notasAlumnoPredicate);
			for (Notas_Alumno notas_Alumno : resultado) {
				System.out.println(notas_Alumno.getAlumno().toString());
				System.out.println( notas_Alumno.getModulo().toString());
			}
			
			*/
			
			System.out.println("Alumnos que estan en modulos de mas de 100 horas (con predicado)");
			Predicate<Notas_Alumno> modulosPredicate = new Predicate<Notas_Alumno>() {

				@Override
				public boolean match(Notas_Alumno notas_Alumno) {
					return notas_Alumno.getModulo().getHoras() > 100;
				}
				
			};
			List<Notas_Alumno> alumnos = dbContainer.query(modulosPredicate);
			for (Notas_Alumno notas_Alumno : alumnos) {
				System.out.println(notas_Alumno.getAlumno().toString() + ", en el modulo " + notas_Alumno.getModulo().getNombre());
			}
			System.out.println();
			
			System.out.println("Alumnos que estan en modulos de mas de 100 horas (con SODA)");
			Query query = dbContainer.query();
			query.constrain(Notas_Alumno.class);
			query.descend("modulo").descend("horas").constrain(100).greater();
			List<Notas_Alumno> alumnos2 = query.execute();
			for (Notas_Alumno notas_Alumno : alumnos2) {
				System.out.println(notas_Alumno.getAlumno().toString() + ", en el modulo " + notas_Alumno.getModulo().getNombre());
			}

		} finally {
			dbContainer.close();
		}

	}
	


}
