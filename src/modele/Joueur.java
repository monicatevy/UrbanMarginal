package modele;

/**
 * 
 * Gestion des joueurs
 *
 */
public class Joueur extends Objet {
	
	/**
	 * Vie de départ pour tous les joueurs
	 */
	private static final int MAXVIE = 10;
	
	/**
	 * Gain de point de vie lors d'une attaque
	 */
	private static final int GAIN = 1;
	
	/**
	 * Perte de point de vie lors d'une attaque
	 */
	private static final int PERTE = 2;
	
	/**
	 * Pseudo saisi
	 */
	private String pseudo;
	
	/**
	 * numéro correspondant au personnage (avatar) pour le fichier correspondant
	 */
	private int numPerso;
	
	/**
	 * Instance de JeuServeur pour communiquer avec lui
	 */
	
	/**
	 * vie restante du joueur
	 */
	private int vie;
	
	/**
	 * tourné vers la gauche (0) , vers la droite (1)
	 */
	private int orientation;
	
	private JeuServeur jeuServeur;
	
	/**
	 * numéro d'étapes dans l'animation (marche, touché, mort)
	 */
	private int etape;
	
	/**
	 * la boule du joueur
	 */
	private Boule boule;
	
	/**
	 * Constructeur
	 */
	public Joueur() {
		
	}

	/**
	 * Initialisation d'un joueur
	 * pseudo, numéro, calcul de la première position, affichage, création de la boule
	 */
	public void initPerso() {
		
	}
	
	/**
	 * Calcul la première position aléatoire du joueur
	 * (sans chevacher un autre joueur ou un mur)
	 */
	private void premierePosition() {
		
	}
	
	/**
	 * Affiche le personnage et son message
	 */
	public void affiche() {
		
	}
	
	/**
	 * Gère une action reçue et qu'il faut afficher
	 * (déplacement, tire une boule...)
	 */
	public void action() {
		
	}
	
	/**
	 * Contrôle si le joueur touche un des autres joueurs
	 * @return true si deux joueurs se touchent
	 */
	private Boolean toucheJoueur() {
		return null;
	}
	
	/**
	 * Contrôle si le joueur touche un mur
	 * @return true si un joueur touche un mur
	 */
	private Boolean toucheMur() {
		return null;
	}
	
	/**
	 * Gain de point de vie après avoir touché un joueur
	 */
	public void gainVie() {
		
	}
	
	/**
	 * Perte de point de vie après avoir été touché
	 */
	public void perteVie() {
		
	}
	
	/**
	 * @return true si vie = 0
	 */
	public Boolean estMort() {
		return null;
	}
	
	/**
	 * le joueur se déconnecte et disparait
	 */
	public void departJoueur() {
		
	}
}
	
	
	
	
	
	
	
