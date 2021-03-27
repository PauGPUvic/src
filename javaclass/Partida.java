package javaclass;
/**
 * <h1> Create a match</h1>
 * The classe Partida generates a match with two players
 * @author Pau Grau Palomar
 * @version 1.0
 * 
 * 
 * */

public class Partida implements Activitat{

	private String match_Name;
	private Jugador Player1;
	private Jugador Player2;

	
	/**
	 * @return String  return the name of the match
	 **/
	public String getMatch_Name() {
		return match_Name;
	}


	/**
	 * @param match_Name String  set the name of the match
	 **/
	public void setMatch_Name(String match_Name) {
		this.match_Name = match_Name;
	}



	
	/**
	 * @return Player1  return the Jugador object of player1
	 **/
	public Jugador getPlayer1() {
		return Player1;
	}


	/**
	 * @param player1  set  the first player  of the match
	 **/
	public void setPlayer1(Jugador player1) {
		Player1 = player1;
	}


	/**
	 * @return Player2  return the Jugador object of player2
	 **/
	public Jugador getPlayer2() {
		return Player2;
	}


	/**
	 * @param player2  set  the second player  of the match
	 **/
	public void setPlayer2(Jugador player2) {
		Player2 = player2;
	}


	/**
	 *  Calculates who wins
	 **/
	@Override
	public String QuiGuanya() {
		// TODO Auto-generated method stub
		
		if(this.Player1.getPuntuacio_total()>this.Player2.getPuntuacio_total()) return Player1.getNom();
		else if(this.Player2.getPuntuacio_total()>this.Player1.getPuntuacio_total()) return Player2.getNom();	
		else return "empatats";
	}
	
}
