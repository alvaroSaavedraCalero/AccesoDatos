package ejercicio2;

import java.io.File;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.EmbeddedObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Constraint;
import com.db4o.query.Predicate;
import com.db4o.query.Query;

import EDU.purdue.cs.bloat.tree.NewArrayExpr;

public class MainBeisbol {

	final static String DB4OFILENAME = "beisbol.db4o";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Eliminamos y creamos la base de datos
		new File(DB4OFILENAME).delete();
		EmbeddedObjectContainer dbContainer = Db4oEmbedded.openFile(DB4OFILENAME);
		
		try {
			introducirDatos(dbContainer);
			System.out.println("-----------------");
			listaTodosDatos(dbContainer);
			System.out.println("-----------------");
			
			System.out.println("Consulta (Los jugadores que tienen un battingAverage mayor a 0.3):");
			Query q = dbContainer.query();
			q.constrain(Player.class);
			q.descend("battingAverage").constrain(new Float(0.3f)).greater();
			ObjectSet<Object> result = q.execute();
			listaDatos(result);
			
			System.out.println("Consulta (Jugadores que son Pitcher, que su battingAverage es mayor que 0.13 y wins mayor a 5)");
			q = dbContainer.query();
			q.constrain(Player.class);
			Constraint constr = q.descend("battingAverage").constrain(new Float(0.13f)).greater();
			q.descend("wins").constrain(new Integer(5)).greater().and(constr);
			result = q.execute();
			listaDatos(result);
			
			/*
			// query nativa
			System.out.println("query nativa");
			System.out.println("Jugadores que se llaman Barry Bonds");
			List<Player> playerList = dbContainer.query(new Predicate<Player>() {
				public boolean match(Player player) {
					return player.getName().equals("Barry Bonds");
				}
			});
			*/
			
		} finally {
			dbContainer.close();
		}

	}

	public static void introducirDatos(EmbeddedObjectContainer db) {
		// Create Players
		Player p1 = new Player("Barry Bonds", 25, 0.362f);
		Player p2 = new Player("Marquis Grissom", 9, 0.279f);
		Player p3 = new Player("Ray Durham", 5, 0.282f);
		Player p4 = new Player("Adrian Beltre", 29, 0.334f);
		Player p5 = new Player("Cesar Izturis", 3, 0.288f);
		Player p6 = new Player("Shawn Green", 15, 0.266f);

		// Create Pitchers
		Player p7 = new Pitcher("Kirk Rueter", 46, 0.131f, 9);
		Player p8 = new Pitcher("Kazuhisa Ishii", 17, 0.127f, 13);

		// Create Teams
		Team t1 = new Team("Giants", "San Francisco", 91, 71);
		Team t2 = new Team("Dodgers", "Los Angeles", 93, 69);

		// Add Players to Teams
		t1.addPlayer(p1);
		p1.setTeam(t1);
		t1.addPlayer(p2);
		p2.setTeam(t1);
		t1.addPlayer(p3);
		p3.setTeam(t1);
		t2.addPlayer(p4);
		p4.setTeam(t2);
		t2.addPlayer(p5);
		p5.setTeam(t2);
		t2.addPlayer(p6);
		p6.setTeam(t2);

		// Add Pitchers to Teams
		t1.addPlayer(p7);
		p7.setTeam(t1);
		t2.addPlayer(p8);
		p8.setTeam(t2);
		
		db.store(t1);
		db.store(t2);

	}
	
	public static void listaTodosDatos(EmbeddedObjectContainer db) {
		List<Object> result = db.queryByExample(new Object());
		for (Object object : result) {
			System.out.println(object);
		}
		
	}
	
	public static void listaDatos(List<Object> result) {
		for (Object obj : result) {
			System.out.println(obj);
		}
	}

}
