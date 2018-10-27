
public class Jeu {
 
 private Manette manette;
 
 public Jeu(Manette manette) {
	 this.manette=manette;
 }
 
 public void JeuLoop() {
	 if (manette.IsLeft())
		 System.out.println("left key pessed");
	 else 
		 if (manette.IsRight())
			 System.out.println("right key pessed");
		 else
			 if (manette.IsPush())
				 System.out.println("spacebar key pessed");
	 
 }

public Manette getManette() {
	return manette;
}

public void setManette(Manette manette) {
	this.manette = manette;
}
 
}
