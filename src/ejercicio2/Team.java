package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team {

	private String name;
	private String city;
	private int won;
	private int lost;
	private List<Player> players;

	public Team(String name, String city, int won, int lost) {
		this.name = name;
		this.city = city;
		this.won = won;
		this.lost = lost;
		this.players = new ArrayList<Player>();
	}

	public Team() {
		this.players = new ArrayList<Player>();
	}

	public void addPlayer(Player p) {
		players.add(p);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getLost() {
		return lost;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, lost, name, players, won);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return Objects.equals(city, other.city) && lost == other.lost && Objects.equals(name, other.name)
				&& Objects.equals(players, other.players) && won == other.won;
	}

	@Override
	public String toString() {
		return "Team->" + name;
	}

}
