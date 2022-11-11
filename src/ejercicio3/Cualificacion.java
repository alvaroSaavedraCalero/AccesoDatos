package ejercicio3;

import java.util.Objects;

public class Cualificacion {
	
	private String codigo;
	private String completa;
	private String cualifica;
	
	
	public Cualificacion(String codigo, String completa, String cualifica) {
		this.codigo = codigo;
		this.completa = completa;
		this.cualifica = cualifica;
	}
	
	public Cualificacion() {}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getCompleta() {
		return completa;
	}


	public void setCompleta(String completa) {
		this.completa = completa;
	}


	public String getCualifica() {
		return cualifica;
	}


	public void setCualifica(String cualifica) {
		this.cualifica = cualifica;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo, completa, cualifica);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cualificacion other = (Cualificacion) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(completa, other.completa)
				&& Objects.equals(cualifica, other.cualifica);
	}


	@Override
	public String toString() {
		return "Cualificacion [codigo=" + codigo + ", completa=" + completa + ", cualifica=" + cualifica + "]";
	}
	
	

}
