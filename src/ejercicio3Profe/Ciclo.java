package ejercicio3Profe;

public class Ciclo {
	private String codigo;
	private String nombre;
	private String nivel;
	private Integer horas;

	public Ciclo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciclo(String codigo, String nombre, String nivel, Integer horas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nivel = nivel;
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Ciclo [codigo=" + codigo + ", nombre=" + nombre + ", nivel=" + nivel + ", horas=" + horas + "]";
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

}
