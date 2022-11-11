package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Modulo {
	
	private String codigo;
	private String nombre;
	private Integer horas;
	private String curso;
	private Ciclo ciclo;
	private List<Notas_Alumno> moduloNota;
	
	
	public Modulo(String codigo, String nombre, Integer horas, String curso, Ciclo ciclo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horas = horas;
		this.curso = curso;
		this.ciclo = ciclo;
		this.moduloNota = new ArrayList<>();
	}
	
	public Modulo() {this.moduloNota = new ArrayList<>();}


	public List<Notas_Alumno> getModuloNota() {
		return moduloNota;
	}

	public void setModuloNota(List<Notas_Alumno> moduloNota) {
		this.moduloNota = moduloNota;
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getHoras() {
		return horas;
	}


	public void setHoras(Integer horas) {
		this.horas = horas;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public Ciclo getCiclo() {
		return ciclo;
	}


	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ciclo, codigo, curso, horas, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modulo other = (Modulo) obj;
		return Objects.equals(ciclo, other.ciclo) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(curso, other.curso) && Objects.equals(horas, other.horas)
				&& Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Modulo --> [nombre = " + nombre + ", horas = " + horas + ", ciclo = " + ciclo.getNombre() + "]";
	}
	
	
	
	

}
