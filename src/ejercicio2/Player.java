package ejercicio2;

import java.util.Objects;

public class Player {

	private String name;
	private int squadNumber;
	private float battingAverage;
	private Team team;

	public Player(String name, int squadNumber, float battingAverage) {
		this.name = name;
		this.squadNumber = squadNumber;
		this.battingAverage = battingAverage;
	}

	public Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSquadNumber() {
		return squadNumber;
	}

	public void setSquadNumber(int squadNumber) {
		this.squadNumber = squadNumber;
	}

	public float getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(float battingAverage) {
		this.battingAverage = battingAverage;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public int hashCode() {
		return Objects.hash(battingAverage, name, squadNumber, team);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Float.floatToIntBits(battingAverage) == Float.floatToIntBits(other.battingAverage)
				&& Objects.equals(name, other.name) && squadNumber == other.squadNumber
				&& Objects.equals(team, other.team);
	}

	@Override
	public String toString() {
		return "Player->" + name + ":" + battingAverage;
	}

}
