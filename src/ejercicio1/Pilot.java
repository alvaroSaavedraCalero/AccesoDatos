package ejercicio1;

import java.util.Objects;

public class Pilot {
	
	private String name;
	private Integer points;
	
	public Pilot(String name, Integer points) {
		this.name = name;
		this.points = points;
	}
	
	public Pilot() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, points);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilot other = (Pilot) obj;
		return Objects.equals(name, other.name) && Objects.equals(points, other.points);
	}

	@Override
	public String toString() {
		return "Pilot [name=" + name + ", points=" + points + "]";
	}
	
	
	

}
