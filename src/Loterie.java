import java.awt.print.Printable;

/**
 * 
 */

/**
 * @author Idrissa SI
 *
 */
public class Loterie {

	/**
	 * 
	 */
	int nbBoules;

	String bouleTirer;
	int[] bouleTirerTrier;


	public Loterie() {
		// TODO Auto-generated constructor stub
		this.nbBoules = 60;
		this.bouleTirerTrier  = new int[nbBoules];
		this.bouleTirer  = "";
		for (int i = 0; i < bouleTirerTrier.length; i++) {
			bouleTirerTrier[i] = 0;
		}
	}

	public void add(int valeurBoule) {
		if(valeurBoule != -1) {
			bouleTirerTrier[valeurBoule] = 1;
		}

	}

	public void tirerBoule(String numBoule) {
		int numBoul = -1;
		//ajout dans le tableau en tirant une boule 
		if(numBoule != "") {
			numBoul = Integer.parseInt(numBoule);
			this.add(numBoul);
			//this.bouleTirer =this.bouleTirer+" "+ numBoule;

		}
		//construction du résultat afficher
		String result = "";
		for (int i = 0; i < bouleTirerTrier.length; i++) {
			if(bouleTirerTrier[i] == 1) {
				result =  result + " " + i;   ;
			}
		}
		//on enleve me premier espace du résultat afficher
		if(result != "")
			result = result.substring(1);
		this.bouleTirer = result;

	}

	public String getBouleTirer() {
		return this.bouleTirer;
	}
	
	public int getNbBoule() {
		return nbBoules;
	}

}
