
public class ManetteClavier implements Manette {

	private Clavier clavier;
	
	public ManetteClavier(Clavier clavier) {
		this.clavier=clavier;
	}
	
	@Override
	public boolean IsLeft() {
		if(clavier.getKeyPessed()==Key.ARROW_LEFR)
		    return true;
		else 
			return false;
	}

	@Override
	public boolean IsRight() {
		if(clavier.getKeyPessed()==Key.ARROW_RIGHT)
		    return true;
		else 
			return false;
	}

	@Override
	public boolean IsPush() {
		if(clavier.getKeyPessed()==Key.SPACEBAR)
		    return true;
		else 
			return false;
	}

}
