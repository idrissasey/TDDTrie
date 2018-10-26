import java.awt.print.Printable;

/**
 * 
 */

/**
 * @author Idrissa SI
 *
 */
public class chaineTri {

	/**
	 * 
	 */
	
	String chaineRetour = "";
	String chaineDepart= "";
	


	public chaineTri() {
		// TODO Auto-generated constructor stub

	}

	public void add(int lettre) {


	}

	public void ajouterLettre(String machaine) {
		if(machaine !="") {
			
			machaine = machaine.replaceAll("[-+*!:;,?§!%*µ£$^¨/.`#\"]", "");
			this.chaineRetour = machaine.toLowerCase();
			
		}
			

		

	}
	
	public String getMachaine() {
		return chaineRetour;
		
	}


}
