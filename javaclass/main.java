package javaclass;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hola mon");
			Scanner scan= new Scanner(System.in);
			
			
		Partida joc = new Partida();	
		
		System.out.println("Escriut el Nom");
		String nom = scan.nextLine();
		System.out.println("Escriut el Edat");
		int  edat = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Escriut el Color");
		String color = scan.nextLine();
		System.out.println("Escriut el avatar");
		String avatar = scan.nextLine();
		
		System.out.println("Escriut el nick");
		String nick = scan.nextLine();
		
		Jugador j1 = new Jugador(color, avatar, nick,1, nom, edat, true);
		Jugador j2 = new Jugador("verd", "kiko", "jop",2, "CPU", 10, true);
		joc.setPlayer1(j1);
		joc.setPlayer2(j2);
		
		
		
		System.out.println(joc.getPlayer1().getNom());
		
		
			
			
			System.out.println(joc.QuiGuanya());
			
			scan.close();
	}

}
