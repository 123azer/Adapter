
public class programme {

	public static void main(String[] args) {
		
		Clavier c= new Clavier();
		Jeu J =new Jeu((Manette) new ManetteClavier(c));
		c.setKeyPessed(Key.ARROW_LEFR);
		J.JeuLoop();
		c.setKeyPessed(Key.ARROW_RIGHT);
		J.JeuLoop();
		c.setKeyPessed(Key.SPACEBAR);
		J.JeuLoop();
		

	}

}
