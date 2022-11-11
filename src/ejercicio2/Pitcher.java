package ejercicio2;

import java.util.Objects;

public class Pitcher extends Player {

	private int wins;

	public Pitcher(String name, int squadNumber, float battingAverage, int wins) {
		super(name, squadNumber, battingAverage);
		this.wins = wins;
	}

	public Pitcher() {

	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(wins);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pitcher other = (Pitcher) obj;
		return wins == other.wins;
	}

	@Override
	public String toString() {
		return "Pitcher->" + super.getName() + ":" + super.getBattingAverage() + ", " + wins;
	}

}
