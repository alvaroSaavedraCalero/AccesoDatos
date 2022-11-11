package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno {
	
	private String numMatricula;
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Integer telefono;
	private List<Notas_Alumno> moduloNota;
	
	public Alumno(String numMatricula, String dni, String nombre, String apellido1, String apellido2,
			Integer telefono) {
		this.numMatricula = numMatricula;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.telefono = telefono;
		this.moduloNota = new ArrayList<>();
	}
	
	
	
	public Alumno(String numMatricula, String dni, String nombre, String apellido1, String apellido2) {
		this.numMatricula = numMatricula;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.moduloNota = new ArrayList<>();
	}



	public Alumno() {this.moduloNota = new ArrayList<>();}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public List<Notas_Alumno> getModuloNota() {
		return moduloNota;
	}

	public void setModuloNota(List<Notas_Alumno> moduloNota) {
		this.moduloNota = moduloNota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido1, apellido2, dni, moduloNota, nombre, numMatricula, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellido1, other.apellido1) && Objects.equals(apellido2, other.apellido2)
				&& Objects.equals(dni, other.dni) && Objects.equals(moduloNota, other.moduloNota)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(numMatricula, other.numMatricula)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Alumno -->[dni = " + dni + ", nombre = " + nombre + ", apellido1 = " + apellido1 + ", apellido2 = " + apellido2 + "]";
	}
	
	
	
	
	

}
