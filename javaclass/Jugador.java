package javaclass;



/**
 * <h1> Create a player</h1>
 * The classe jugador implements diferent methos and params that allows the player join a match
 * @author Pau Grau Palomar
 * @version 1.0
 * 
 * 
 * */
public class Jugador extends Persona {
	
	
	private String color;
	private String avatar;
	private String nickname;
	private int puntuacio_total;
	
	
	/**
	 * @param color  String components that define which color uses
	 * @param avatar String component that defines the name of avatar used for the player
	 * @param nickname String component that define the display name of the player
	 * @param puntuacio_total int component that define the current points of the player
	 */
	public  Jugador(String col, String av, String nick, int punt, String nm, int edt, boolean carnet) {
			
		super(nm,edt,carnet);
			this.color = col;
			this.avatar = av;
			this.nickname = nick;
			this.puntuacio_total = punt;
			
	}
	
	

	/**
	 * @return String  return the color code
	 **/
	public String getColor() {
		return color;
	}
	
	/**
	 * @param color  String components that define which color uses
	 **/
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return String  return  the name of the avatar
	 **/
	public String getAvatar() {
		return avatar;
	}
	/**
	 * @param avatar  String components that define which color uses
	 **/
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	/**
	 * @return String  return the display name of the player
	 **/
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname  String components that define which color uses
	 **/
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return int  return the points of the current player
	 **/
	public int getPuntuacio_total() {
		return puntuacio_total;
	}
	/**
	 * @param puntuacio_total  int components that define which color uses
	 **/
	public void setPuntuacio_total(int puntuacio_total) {
		this.puntuacio_total = puntuacio_total;
	}
	
	
	
	
	
	
	
	
		
}
