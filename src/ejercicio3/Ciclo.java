package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ciclo {
	
	private String codigo;
	private String nombre;
	private List<Cualificacion> cualificaciones;
	private String nivel;
	private Integer horas;
	private List<Modulo> modulos;
	
	
	public Ciclo(String codigo, String nombre, String nivel, Integer horas) {
		this.cualificaciones = new ArrayList<>();
		this.modulos = new ArrayList<>();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nivel = nivel;
		this.horas = horas;
	}
	
	public Ciclo() {
		this.cualificaciones = new ArrayList<>();
		this.modulos = new ArrayList<>();
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


	public List<Cualificacion> getCualificaciones() {
		return cualificaciones;
	}


	public void setCualificaciones(List<Cualificacion> cualificaciones) {
		this.cualificaciones = cualificaciones;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}


	public Integer getHoras() {
		return horas;
	}


	public void setHoras(Integer horas) {
		this.horas = horas;
	}


	public List<Modulo> getModulos() {
		return modulos;
	}


	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo, cualificaciones, horas, modulos, nivel, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciclo other = (Ciclo) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(cualificaciones, other.cualificaciones)
				&& Objects.equals(horas, other.horas) && Objects.equals(modulos, other.modulos)
				&& Objects.equals(nivel, other.nivel) && Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Ciclo --> [codigo = " + codigo + ", nombre = " + nombre + "]";
	}
	
	
	
	

}
