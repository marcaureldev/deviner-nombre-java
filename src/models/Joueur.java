
import java.util.Scanner;

/**
 * Classe représentant un joueur dans le jeu de devinettes
 */
public class Joueur {

    private String nom;
    private static final Scanner sc = new Scanner(System.in);

    /**
     * Constructeur de la classe Joueur
     *
     * @param nom Le nom du joueur
     */
    public Joueur(String nom) {
        this.nom = nom;
    }

    /**
     * Récupère le nom du joueur
     *
     * @return Le nom du joueur
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom du joueur
     *
     * @param nom Le nouveau nom du joueur
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Demande au joueur de deviner un nombre
     *
     * @return Le nombre deviné par le joueur
     */
    public int deviner() {
        System.out.println("Veuillez saisir un nombre: ");
        return sc.nextInt();
    }

    /**
     * Représentation textuelle du joueur
     *
     * @return Le nom du joueur
     */
    @Override
    public String toString() {
        return nom;
    }

    /**
     * Affiche le joueur gagnant
     */
    public void afficherJoueurGagnant() {
        System.out.println(this);
    }
}
