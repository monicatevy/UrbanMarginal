package modele;

/**
 * 
 * Information communes à tous les objets (joueurs, murs, boules)
 * permet de mémoriser la position de l'objet et de gérer les collisions
 *
 */
public abstract class Objet {

	/**
	 * position X de l'objet
	 */
	protected Integer posX ;
	
	/**
	 * position Y de l'objet
	 */
	protected Integer posY ;
	
	/**
	 * Contrôle si l'objet actuel touche l'objet passé en paramètre
	 * @param objet contient l'objet à contrôler
	 * @return true si les deux objets se touchent
	 */
	public Boolean toucheObjet (Objet objet) {
		return null;
	}
	
}
