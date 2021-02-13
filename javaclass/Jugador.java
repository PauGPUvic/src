package javaclass;

public class Jugador extends Persona {
		
	private String color;
	private String avatar;
	private String nickname;
	private int puntuacio_total;
	
	public  Jugador(String col, String av, String nick, int punt, String nm, int edt, boolean carnet) {
			
		super(nm,edt,carnet);
			this.color = col;
			this.avatar = av;
			this.nickname = nick;
			this.puntuacio_total = punt;
			
	}
	
	


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getPuntuacio_total() {
		return puntuacio_total;
	}
	public void setPuntuacio_total(int puntuacio_total) {
		this.puntuacio_total = puntuacio_total;
	}
	
	
	
	
	
	
	
	
		
}
