package ejercicio3Profe;

public class Modulo {
	private String codigo;
	private String nombre;
	private Integer horas;
	private String curso;
	private Ciclo ciclo;

	public Modulo(String codigo, String nombre, Integer horas, String curso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horas = horas;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Modulo [codigo=" + codigo + ", nombre=" + nombre + ", horas=" + horas + ", curso=" + curso + ", ciclo="
				+ ciclo + "]";
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

	public Modulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modulo(String codigo, String nombre, Integer horas, String curso, Ciclo ciclo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horas = horas;
		this.curso = curso;
		this.ciclo = ciclo;

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

}
