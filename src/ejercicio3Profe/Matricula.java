package ejercicio3Profe;

import java.io.File;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.EmbeddedObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Constraint;
import com.db4o.query.Predicate;
import com.db4o.query.Query;

public class Matricula {
	final static String DB4OFILENAME = "matriculasEj3_1.db4o";

	public static void main(String[] args) {

		new File(DB4OFILENAME).delete();
		EmbeddedObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DB4OFILENAME);
		try {
			insertaDatos(db);

			listaAlumnos(db);
//			listaModulos(db);
//			ListaNotas(db);
			//listaCiclos(db);

		} finally {
			db.close();
		}
	}

	public static void insertaDatos(EmbeddedObjectContainer db) {
		Ciclo c1 = new Ciclo("IFCS02", "desarrollo aplicaciones multiplataforma", "superior", 2000);

		Cualificacion cu1 = new Cualificacion("IFC155_3",
				"Programacion en lenguajes estructurados de aplicaciones de gestion", "completa");
		cu1.setCiclo(c1);
		Cualificacion cu2 = new Cualificacion("IFC080_3",
				"Programacion con lenguajes orientados a objetos y bases de datos relacionales", "completa");
		cu2.setCiclo(c1);
		Cualificacion cu3 = new Cualificacion("IFC363_3",
				"Administracion en sistemas de planificacion de recursos empresariales y gestion de relaciones con clientes",
				"incompleta");
		cu3.setCiclo(c1);
		Cualificacion cu4 = new Cualificacion("IFC303_3", "Programacion de sistemas informaticos", "incompleta");

		db.store(cu1);
		db.store(cu2);
		db.store(cu3);
		db.store(cu4);

		Modulo m1 = new Modulo("484", "bases datos", 220, "primero", c1);

		Modulo m2 = new Modulo("483", "Sistemas informaticos", 220, "primero", c1);

		Modulo m3 = new Modulo("485", "Programacion", 0, "primero", c1);

		Modulo m4 = new Modulo("373", "Lenguaje de Marcas", 0, "primero", c1);

		Modulo m5 = new Modulo("487", "Entornos de Desarrollo", 0, "primero", c1);

		Modulo m6 = new Modulo("493", "Fol", 0, "primero", c1);

		Modulo m7 = new Modulo("486", "Acceso a Datos", 0, "segundo", c1);

		Modulo m8 = new Modulo("488", "Desarrollo de Interfaces", 0, "segundo", c1);

		Modulo m9 = new Modulo("490", "Programacion de Servicios y Procesos", 0, "segundo", c1);

		Modulo m10 = new Modulo("491", "Sistemas de Gestion Empresarial", 0, "segundo", c1);

		Modulo m11 = new Modulo("492", "Proyecto de desarrollo de Aplicaciones Multiplataforma", 0, "segundo", c1);

		Modulo m12 = new Modulo("494", "Empresa e Iniciativa Emprendedora", 0, "segundo", c1);

		Modulo m13 = new Modulo("495", "Formacion en Centros de Trabajo", 0, "segundo", c1);

		Modulo m14 = new Modulo("10", "Ingles Tecnico", 0, "segundo", c1);
		Alumno a1 = new Alumno("1", "1", "Juan", "Cornejo", "Lopez");
		Alumno a2 = new Alumno("2", "2", "Pablo", "Santos", "");
		Alumno a3 = new Alumno("3", "3", "Dolores", "Ruano", "Goñi");
		Alumno a4 = new Alumno("4", "4", "Leonor", "Carvajal", "Noguera");
		Alumno a5 = new Alumno("5", "5", "Catalina", "Sanchez", "Pol");
		Alumno a6 = new Alumno("6", "6", "Ada", "Cabezas", "Diaz");
		Alumno a7 = new Alumno("7", "7", "Ruth", "Guerrero", "Sanchez");
		Alumno a8 = new Alumno("8", "8", "Anton", "Carballo", "Lopez");
		Alumno a9 = new Alumno("9", "9", "Vicente", "Parrilla", "Godoy");
		Alumno a10 = new Alumno("10", "10", "Elena", "Diaz", "de la Cruz");
		Alumno a11 = new Alumno("11", "11", "Carlos", "Ruano", "Guerrero");
		Alumno a12 = new Alumno("12", "12", "Sandra", "Alvarado", "Arranz");
		Alumno a13 = new Alumno("13", "13", "Brais", "Blanco", "Rivas");
		Alumno a14 = new Alumno("14", "14", "Miriam", "Olmedo", "");

		AlumnoModulo am11 = new AlumnoModulo(m1, a1, 1, 1);
		AlumnoModulo am21 = new AlumnoModulo(m2, a1, 1, 1);
		AlumnoModulo am31 = new AlumnoModulo(m3, a1, 1, 1);
		AlumnoModulo am41 = new AlumnoModulo(m4, a1, 1, 1);
		AlumnoModulo am51 = new AlumnoModulo(m5, a1, 1, 1);
		AlumnoModulo am61 = new AlumnoModulo(m6, a1, 1, 1);
		AlumnoModulo am71 = new AlumnoModulo(m7, a1, 1, 1);

		AlumnoModulo am12 = new AlumnoModulo(m1, a2, 1, 1);
		AlumnoModulo am22 = new AlumnoModulo(m2, a2, 1, 1);
		AlumnoModulo am32 = new AlumnoModulo(m3, a2, 1, 1);
		AlumnoModulo am42 = new AlumnoModulo(m4, a2, 1, 1);
		AlumnoModulo am52 = new AlumnoModulo(m5, a2, 1, 1);
		AlumnoModulo am62 = new AlumnoModulo(m6, a2, 1, 1);
		AlumnoModulo am72 = new AlumnoModulo(m7, a2, 1, 1);

		AlumnoModulo am13 = new AlumnoModulo(m1, a3, 1, 1);
		AlumnoModulo am23 = new AlumnoModulo(m2, a3, 1, 1);
		AlumnoModulo am33 = new AlumnoModulo(m3, a3, 1, 1);
		AlumnoModulo am43 = new AlumnoModulo(m4, a3, 1, 1);

		AlumnoModulo am74 = new AlumnoModulo(m7, a4, 1, 1);
		AlumnoModulo am84 = new AlumnoModulo(m8, a4, 1, 1);
		AlumnoModulo am94 = new AlumnoModulo(m9, a4, 1, 1);
		AlumnoModulo am104 = new AlumnoModulo(m10, a4, 1, 1);
		AlumnoModulo am14 = new AlumnoModulo(m1, a4, 1, 1);
		AlumnoModulo am34 = new AlumnoModulo(m3, a4, 1, 1);

		AlumnoModulo am75 = new AlumnoModulo(m7, a5, 1, 1);
		AlumnoModulo am85 = new AlumnoModulo(m8, a5, 1, 1);
		AlumnoModulo am95 = new AlumnoModulo(m9, a5, 1, 1);
		AlumnoModulo am105 = new AlumnoModulo(m10, a5, 1, 1);
		AlumnoModulo am145 = new AlumnoModulo(m14, a5, 1, 1);

		AlumnoModulo am76 = new AlumnoModulo(m7, a6, 1, 1);
		AlumnoModulo am86 = new AlumnoModulo(m8, a6, 1, 1);
		AlumnoModulo am96 = new AlumnoModulo(m9, a6, 1, 1);
		AlumnoModulo am106 = new AlumnoModulo(m10, a6, 1, 1);
		AlumnoModulo am146 = new AlumnoModulo(m14, a6, 1, 1);

		AlumnoModulo am77 = new AlumnoModulo(m7, a7, 1, 1);
		AlumnoModulo am87 = new AlumnoModulo(m8, a7, 1, 1);
		AlumnoModulo am97 = new AlumnoModulo(m9, a7, 1, 1);
		AlumnoModulo am107 = new AlumnoModulo(m10, a7, 1, 1);

		AlumnoModulo am118 = new AlumnoModulo(m11, a8, 1, 1);
		AlumnoModulo am138 = new AlumnoModulo(m13, a8, 1, 1);
		AlumnoModulo am148 = new AlumnoModulo(m14, a8, 1, 1);

		AlumnoModulo am119 = new AlumnoModulo(m11, a9, 1, 1);
		AlumnoModulo am139 = new AlumnoModulo(m13, a9, 1, 1);
//		guardo datos.

		db.store(am11);
		db.store(am21);
		db.store(am31);
		db.store(am41);
		db.store(am51);
		db.store(am61);
		db.store(am71);

		db.store(am12);
		db.store(am22);
		db.store(am32);
		db.store(am42);
		db.store(am52);
		db.store(am62);
		db.store(am72);

		db.store(am13);
		db.store(am23);
		db.store(am33);
		db.store(am43);

		db.store(am74);
		db.store(am84);
		db.store(am94);
		db.store(am104);
		db.store(am14);
		db.store(am34);

		db.store(am75);
		db.store(am85);
		db.store(am95);
		db.store(am105);
		db.store(am145);

		db.store(am76);
		db.store(am86);
		db.store(am96);
		db.store(am106);
		db.store(am146);

		db.store(am77);
		db.store(am87);
		db.store(am97);
		db.store(am107);

		db.store(am118);
		db.store(am138);
		db.store(am148);

		db.store(am119);
		db.store(am139);
//ejercicio1
//guardar los datos de los alumnos que no estan matriculados en ningun modulo
		db.store(a10);
		db.store(a11);
		db.store(a12);
		db.store(a13);
		db.store(a14);
//guardar los datos de los modulos en lo que no se matricula ningun alumno
		db.store(m12);
		db.commit();
	}

	@SuppressWarnings("serial")
	public static void listaAlumnos(EmbeddedObjectContainer db) {
		ObjectSet<Alumno> result = db.queryByExample(new Alumno());
		for (Alumno a : result) {
			System.out.println(a);
// hay que listar los modulos en los que esta matriculado el alumno a
			
			

			//ejercicio2 query nativa (predicate)
			Predicate<AlumnoModulo> modulosPredicate = new Predicate<AlumnoModulo>() {

				@Override
				public boolean match(AlumnoModulo alumnoModulo) {
					return alumnoModulo.getAlumno().equals(a);
				}
			};
			List<AlumnoModulo> modulos = db.query(modulosPredicate);
			for (AlumnoModulo modulo : modulos) {
				System.out.println("Nombre --> " + modulo.getModulo().getNombre() + ", codigo --> " + modulo.getModulo().getCodigo());
			}
			
				
				
			
			//ejercicio3 soda
			Query query = db.query();
			query.constrain(AlumnoModulo.class);
			Constraint constraint = query.descend("alumno").constrain(a).equal();
			query.descend("modulo").constrain(Modulo.class).and(constraint);
			List<AlumnoModulo> modulos3 = query.execute();
			for (AlumnoModulo modulo : modulos3) {
				System.out.println("Nombre --> " + modulo.getModulo().getNombre() + ", codigo --> " + modulo.getModulo().getCodigo());
			}
			
			
			
			//ejercicio4 query by example
			
			List<AlumnoModulo> modulos2 = db.queryByExample(new AlumnoModulo(null, a));
			for (AlumnoModulo modulo : modulos2) {
				System.out.println("Nombre --> " + modulo.getModulo().getNombre() + ", codigo --> " + modulo.getModulo().getCodigo());
			}
			
			
		}
	}

	public static void listaModulos(EmbeddedObjectContainer db) {
		ObjectSet<Modulo> result = db.queryByExample(new Modulo());
		for (Modulo m : result) {
			System.out.println(m.getNombre() + m.getHoras().shortValue() + m.getCiclo().getNombre());
//lista alumnos matriculados en el modulo
		}
		
	}

			 
	public static void ListaNotas(EmbeddedObjectContainer db) {
		// TODO Auto-generated method stub
		ObjectSet<AlumnoModulo> result = db.queryByExample(new AlumnoModulo());
		for (AlumnoModulo alumnoModulo : result) {
			System.out.println(alumnoModulo.getModulo().getNombre());
			//	ejercicio5		listado completo de notas, dni, nombre y apellidos de los alunos y nombre del modulo y nota obtenida.
			System.out.println("Notas-->[ " + alumnoModulo.getExtraordinaria() + ", " + alumnoModulo.getOrdinaria() + " ]," + 
						" dni-->" + alumnoModulo.getAlumno().getDni() + " nombre y apellidos-->" + alumnoModulo.getAlumno().getNombre() + " " + 
					alumnoModulo.getAlumno().getApe1() + " " + alumnoModulo.getAlumno().getApe2() + ", NombreModulo-->" + alumnoModulo.getModulo().getNombre() + 
					", NotaObtenida-->" + alumnoModulo.getOrdinaria() + ", " + alumnoModulo.getExtraordinaria());
			
		}

	}

	public static void listaCiclos(EmbeddedObjectContainer db) {
		ObjectSet<Ciclo> result = db.queryByExample(new Ciclo());
		for (Ciclo c : result) {
			System.out.println(c);
			Modulo mod = new Modulo();
			mod.setCiclo(c);
			ObjectSet<Modulo> modulos = db.ext().queryByExample(mod);
			for (Modulo m : modulos) {
				System.out.println(m.getNombre());
			}
		}

	}

}
