package javaclass;

public class Persona {

	private String nom;
	private int edat;
	private boolean tecarnet;
	
	public Persona() {
		this.nom = "Desconegut";
		this.edat = 0;
		this.tecarnet = false;
	}
	public Persona(String nm, int edt, boolean carnet) {
		
		
		this.nom = nm;
		this.edat = edt;
		this.tecarnet = carnet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public boolean isTecarnet() {
		return tecarnet;
	}

	public void setTecarnet(boolean tecarnet) {
		this.tecarnet = tecarnet;
	}
	
	
	@Override
	public String toString() 	{
		
		
		 return"Persona{" +"nom='" + nom + '\'' +", edat=" + edat +", tecarnet=" + tecarnet+'}';
	}
	
}
