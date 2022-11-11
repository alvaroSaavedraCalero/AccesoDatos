package ejercicio3;

import java.util.Objects;

public class Notas_Alumno {
	
	private Modulo modulo;
	private Alumno alumno;
	private Integer nota;
	private Integer notaExtraordinaria;
	
	
	public Notas_Alumno(Modulo modulo, Alumno alumno, Integer nota, Integer notaExtraordinaria) {
		this.modulo = modulo;
		this.alumno = alumno;
		this.nota = nota;
		this.notaExtraordinaria = notaExtraordinaria;
	}

	
	public Notas_Alumno() {}

	public Modulo getModulo() {
		return modulo;
	}


	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	public Integer getNota() {
		return nota;
	}


	public void setNota(Integer nota) {
		this.nota = nota;
	}


	public Integer getNotaExtraordinaria() {
		return notaExtraordinaria;
	}


	public void setNotaExtraordinaria(Integer notaExtraordinaria) {
		this.notaExtraordinaria = notaExtraordinaria;
	}


	@Override
	public int hashCode() {
		return Objects.hash(alumno, modulo, nota, notaExtraordinaria);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notas_Alumno other = (Notas_Alumno) obj;
		return Objects.equals(alumno, other.alumno) && Objects.equals(modulo, other.modulo)
				&& Objects.equals(nota, other.nota) && Objects.equals(notaExtraordinaria, other.notaExtraordinaria);
	}


	@Override
	public String toString() {
		return "Notas_Alumno --> [modulo=" + modulo.getNombre() + ", alumno=" + alumno.getDni() + ", nota=" + nota + ", notaExtraordinaria=" + notaExtraordinaria + "]";
	}
	
	

	
	
}
