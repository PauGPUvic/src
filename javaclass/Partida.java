package javaclass;

public class Partida implements Activitat{

	private String match_Name;
	private Jugador Player1;
	private Jugador Player2;

	
	
	public String getMatch_Name() {
		return match_Name;
	}



	public void setMatch_Name(String match_Name) {
		this.match_Name = match_Name;
	}



	

	public Jugador getPlayer1() {
		return Player1;
	}



	public void setPlayer1(Jugador player1) {
		Player1 = player1;
	}



	public Jugador getPlayer2() {
		return Player2;
	}



	public void setPlayer2(Jugador player2) {
		Player2 = player2;
	}



	@Override
	public String QuiGuanya() {
		// TODO Auto-generated method stub
		
		if(this.Player1.getPuntuacio_total()>this.Player2.getPuntuacio_total()) return Player1.getNom();
		else if(this.Player2.getPuntuacio_total()>this.Player1.getPuntuacio_total()) return Player2.getNom();	
		else return "empatats";
	}
	
}
