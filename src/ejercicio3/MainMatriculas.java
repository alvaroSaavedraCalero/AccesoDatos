package ejercicio3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.EmbeddedObjectContainer;

public class MainMatriculas {

	final static String DB4OFILENAME = "matriculasEj3.db4o";

	public static void main(String[] args) {
		new File(DB4OFILENAME).delete();
		EmbeddedObjectContainer dbContainer = Db4oEmbedded.openFile(DB4OFILENAME);

		try {
			insertaDatos(dbContainer);
			//introducirDatos(dbContainer);
			//listaTodosAlumnos(dbContainer);
			listaTodosDatos(dbContainer);
			//listaTodosModulos(dbContainer);
			//listaTodasNotas(dbContainer);
		} finally {
			dbContainer.close();
		}
	}
	
	/*Funcion de datos profesora*/
	
	public static void insertaDatos(EmbeddedObjectContainer db) {
		Ciclo c1 = new Ciclo("IFCS02", "desarrollo aplicaciones multiplataforma", "superior", 2000);
		ArrayList<Modulo> mod = new ArrayList<Modulo>();
		c1.setModulos(mod);
		Cualificacion cu1 = new Cualificacion("IFC155_3",
				"Programacion en lenguajes estructurados de aplicaciones de gestion", "completa");
		Cualificacion cu2 = new Cualificacion("IFC080_3",
				"Programacion con lenguajes orientados a objetos y bases de datos relacionales", "completa");
		Cualificacion cu3 = new Cualificacion("IFC363_3",
				"Administracion en sistemas de planificacion de recursos empresariales y gestion de relaciones con clientes",
				"incompleta");
		Cualificacion cu4 = new Cualificacion("IFC303_3", "Programacion de sistemas informaticos", "incompleta");
		ArrayList<Cualificacion> cuDAM = new ArrayList<Cualificacion>();
		cuDAM.add(cu1);
		cuDAM.add(cu2);
		cuDAM.add(cu3);
		cuDAM.add(cu4);
		c1.setCualificaciones(cuDAM);

		Modulo m1 = new Modulo("484", "bases datos", 220, "primero", c1);
		c1.getModulos().add(m1);
		Modulo m2 = new Modulo("483", "Sistemas informaticos", 220, "primero", c1);
		c1.getModulos().add(m2);
		Modulo m3 = new Modulo("485", "Programacion", 0, "primero", c1);
		c1.getModulos().add(m3);
		Modulo m4 = new Modulo("373", "Lenguaje de Marcas", 0, "primero", c1);
		c1.getModulos().add(m4);
		Modulo m5 = new Modulo("487", "Entornos de Desarrollo", 0, "primero", c1);
		c1.getModulos().add(m5);
		Modulo m6 = new Modulo("493", "Fol", 0, "primero", c1);
		c1.getModulos().add(m6);
		Modulo m7 = new Modulo("486", "Acceso a Datos", 0, "segundo", c1);
		c1.getModulos().add(m7);
		Modulo m8 = new Modulo("488", "Desarrollo de Interfaces", 0, "segundo", c1);
		c1.getModulos().add(m8);
		Modulo m9 = new Modulo("490", "Programacion de Servicios y Procesos", 0, "segundo", c1);
		c1.getModulos().add(m9);
		Modulo m10 = new Modulo("491", "Sistemas de Gestion Empresarial", 0, "segundo", c1);
		c1.getModulos().add(m10);
		Modulo m11 = new Modulo("492", "Proyecto de desarrollo de Aplicaciones Multiplataforma", 0, "segundo", c1);
		c1.getModulos().add(m11);
		Modulo m12 = new Modulo("494", "Empresa e Iniciativa Emprendedora", 0, "segundo", c1);
		c1.getModulos().add(m12);
		Modulo m13 = new Modulo("495", "Formacion en Centros de Trabajo", 0, "segundo", c1);
		c1.getModulos().add(m13);
		Modulo m14 = new Modulo("10", "Ingles Tecnico", 0, "segundo", c1);
		c1.getModulos().add(m14);

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

		altaNota(m1, a1, 1, 1);
		altaNota(m2, a1, 1, 1);
		altaNota(m3, a1, 1, 1);
		altaNota(m4, a1, 1, 1);
		altaNota(m5, a1, 1, 1);
		altaNota(m6, a1, 1, 1);
		altaNota(m7, a1, 1, 1);

		altaNota(m1, a2, 1, 1);
		altaNota(m2, a2, 1, 1);
		altaNota(m3, a2, 1, 1);
		altaNota(m4, a2, 1, 1);
		altaNota(m5, a2, 1, 1);
		altaNota(m6, a2, 1, 1);
		altaNota(m7, a2, 1, 1);

		altaNota(m1, a3, 1, 1);
		altaNota(m2, a3, 1, 1);
		altaNota(m3, a3, 1, 1);
		altaNota(m4, a3, 1, 1);

		altaNota(m7, a4, 1, 1);
		altaNota(m8, a4, 1, 1);
		altaNota(m9, a4, 1, 1);
		altaNota(m10, a4, 1, 1);
		altaNota(m1, a4, 1, 1);
		altaNota(m3, a4, 1, 1);

		altaNota(m7, a5, 1, 1);
		altaNota(m8, a5, 1, 1);
		altaNota(m9, a5, 1, 1);
		altaNota(m10, a5, 1, 1);
		altaNota(m14, a5, 1, 1);

		altaNota(m7, a6, 1, 1);
		altaNota(m8, a6, 1, 1);
		altaNota(m9, a6, 1, 1);
		altaNota(m10, a6, 1, 1);
		altaNota(m14, a6, 1, 1);

		altaNota(m7, a7, 1, 1);
		altaNota(m8, a7, 1, 1);
		altaNota(m9, a7, 1, 1);
		altaNota(m10, a7, 1, 1);

		altaNota(m11, a8, 1, 1);
		altaNota(m13, a8, 1, 1);
		altaNota(m14, a8, 1, 1);

		altaNota(m11, a9, 1, 1);
		altaNota(m13, a9, 1, 1);

		db.store(a1);
		db.store(a2);
		db.store(a3);
		db.store(a4);
		db.store(a5);
		db.store(a6);
		db.store(a7);
		db.store(a8);
		db.store(a9);
		db.store(a10);
		db.store(a11);
		db.store(a12);
		db.store(a13);
		db.store(a14);

		db.store(m1);
		db.store(m2);
		db.store(m3);
		db.store(m4);
		db.store(m5);
		db.store(m6);
		db.store(m7);
		db.store(m8);
		db.store(m9);
		db.store(m10);
		db.store(m11);
		db.store(m12);
		db.store(m13);
		db.store(m14);

	}

	public static void altaNota(Modulo m, Alumno a, Integer n1, Integer n2) {
		Notas_Alumno amNota = new Notas_Alumno(m, a, n1, n2);

		m.getModuloNota().add(amNota);
		a.getModuloNota().add(amNota);
	}
	
	/*****************************/
	

	/*funcion de datos propios*/
	public static void introducirDatos(EmbeddedObjectContainer db) {
		
		// Creamos el ciclo
		Ciclo c = new Ciclo("IFCS02", "Desarrollo de Aplicaciones Multiplataforma", "Superior", 2000);
		
		// Creamos todos los modulos de primero
		Modulo modBaseDatos = new Modulo("0484", "Bases de Datos" , 205, "Primero", c);
		Modulo modEntornos = new Modulo("0487", "Entornos de Desarrollo" , 90, "Primero", c);
		Modulo modFol = new Modulo("0495", "Formacion y Orientacion Laboral", 90, "Primero", c);
		Modulo modLengMarc = new Modulo("0373", "lenguaje de Marcas y sistemas de gestion de la Informacion", 140, "Primero", c);
		Modulo modProgr = new Modulo("0485", "Programacion", 270, "Primero", c);
		Modulo modSisInf = new Modulo("0483", "Sistemas Informaticos", 205, "Primero", c);
		
		// Modulos de segundo
		Modulo modAccDat = new Modulo("0486", "Acceso a Datos", 120, "Segundo", c);
		Modulo modDI = new Modulo("0488", "Desarrollo de Interfaces", 120, "Segundo", c);
		Modulo modEmpre = new Modulo("0494", "Empresa e Iniciativa Emprendedora", 65, "Segundo", c);
		Modulo modIngle = new Modulo("0010", "Ingles tecnico", 40, "Segundo", c);
		Modulo modProSerPro = new Modulo("0490", "Programacion de Servicios y Procesos", 115, "Segundo", c);
		Modulo modMultMovi = new Modulo("0489", "Programacion Multimedia y Dispositivos Moviles", 80, "Segundo", c);
		Modulo modSGE = new Modulo("0491", "Sistemas de Gestion Empresarial", 95, "Segundo", c);
		
		// el proyecto y las fct
		Modulo modProy = new Modulo("0492", "Proyecto de Desarrollo de Aplicaciones Multiplataforma", 30, "Segundo", c);
		Modulo modFCT = new Modulo("0495", "Formacion en Centros de Trabajo", 370, "Segundo", c);
		
		Modulo [] arrayModulos = {modBaseDatos, modEntornos, modFol, modLengMarc, modProgr, modSisInf, modAccDat, modDI, 
				modEmpre, modIngle, modProSerPro, modMultMovi, modSGE, modProy, modFCT};
		for (Modulo modulo : arrayModulos) {
			c.getModulos().add(modulo);
		}
		
		// Realizamos las cualificaciones
		Cualificacion cuali1 = new Cualificacion("IFC155_3", "completa", "Programación en lenguajes estructurados de aplicaciones de gestión");
		Cualificacion cuali2 = new Cualificacion("IFC080_3 ", "completa", "Programación con lenguajes orientados a objetos y bases de datos relacionales");
		Cualificacion cuali3 = new Cualificacion("UC1213_3", "incompleta", "Instalar y configurar sistemas de planificación de recursos empresariales\r\n"
				+ "y de gestión de relaciones con clientes.");
		Cualificacion cuali4 = new Cualificacion("UC0964_3", "incompleta", "Crear elementos software para la gestión del sistema y sus recursos");
		
		Cualificacion [] arrayCualificaciones = {cuali1, cuali2, cuali3, cuali4};
		for (Cualificacion cualificacion : arrayCualificaciones) {
			c.getCualificaciones().add(cualificacion);
		}
		
		// Creamos los alumnos
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
		
		Alumno [] arrayAlumnos = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14};
		
		// Agregamos las notas a los alumnos y a los modulos
		for (Alumno alumno : arrayAlumnos) {
			for (Modulo modulo : arrayModulos) {
				Integer notaOrdinaria = (int) (Math.random() * 9 + 1);
				Integer notaExtraordinaria = (int) (Math.random() * 9 + 1);
				Notas_Alumno nota = new Notas_Alumno(modulo, alumno, notaOrdinaria, notaExtraordinaria);
				alumno.getModuloNota().add(nota);
				modulo.getModuloNota().add(nota);
			}
		}
		
		// Agregaremos a la base de datos los alumnos, los modulos y el ciclo
		db.store(c);
		
		for (Alumno alumno : arrayAlumnos) {
			db.store(alumno);
		}
		
		for (Modulo modulo : arrayModulos) {
			db.store(modulo);
		}
		
	}

	public static void listaTodosDatos(EmbeddedObjectContainer db) {
		List<Object> result = db.queryByExample(new Object());
		for (Object object : result) {
			System.out.println(object);
		}

	}

	public static void listaTodosAlumnos(EmbeddedObjectContainer db) {
		List<Alumno> resultAlumnos = db.queryByExample(new Alumno());
		for (Alumno alumno : resultAlumnos) {
			System.out.println(alumno);
		}
	}
	
	public static void listaTodasNotas(EmbeddedObjectContainer db) {
		List<Notas_Alumno> resultAlumnosNotas = db.queryByExample(new Notas_Alumno());
		for (Notas_Alumno nota : resultAlumnosNotas) {
			System.out.println(nota);
		}
	}
	
	
	public static void listaTodosModulos(EmbeddedObjectContainer db) {
		List<Modulo> resultModulos = db.queryByExample(new Modulo());
		for (Modulo modulo : resultModulos) {
			System.out.println(modulo);
		}
	}
}
