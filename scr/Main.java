
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Dieses Programm simuliert ein kleines Console-Game.");
		System.out.println("Als Spieler wirst du in einem zufällig generierten Labyrinth gespawnt:\n");
		System.out.println("W = Wand");
		System.out.println("S = Start");
		System.out.println("T = Target");
		System.out.println("P = Player");
		System.out.println("E = Enemy\n");
		System.out.println("(Keine Angst, zuvor wird mit einem rekursiven Algorithmus überprüft,");
		System.out.println("ob das Labyrinth überhaupt 'lösbar' ist.");
		System.out.println("Die zufällig generierten Wände könnten dir ja den Weg versperren.)\n");
		System.out.println("Auf dem Weg hinaus musst du einigen Gegnern ausweichen - ");
		System.out.println("sie bewegen sich zufällig durch das Labyrinth.\n");
		System.out.println("Solltest du ihnen in die Quere kommen, musst du von Neuem beginnen.\n");
		System.out.println("Der Verlauf des Spiels wird im Folgenden simuliert:");
		
		Game g = new Game();
		g.startGame();
	}

}
