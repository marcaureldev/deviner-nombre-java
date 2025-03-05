
import java.util.*;

/**
 * Classe principale du jeu de devinettes
 */
public class JeuDeDevinettes {

    private final ArrayList<Joueur> joueursList;
    private int nombreATrouver;

    /**
     * Constructeur du jeu de devinettes
     */
    public JeuDeDevinettes() {
        this.joueursList = new ArrayList<>();
    }

    /**
     * Génère un nombre aléatoire entre 1 et 100
     *
     * @return Le nombre généré
     */
    public int genererNombre() {
        double nombreGenerer = (Math.random() * 100) + 1;
        return (int) nombreGenerer;
    }

    /**
     * Initialise le nombre à trouver
     */
    public void initNombreATrouver() {
        nombreATrouver = genererNombre();
    }

    /**
     * Ajoute un joueur au jeu
     *
     * @param joueur Le joueur à ajouter
     */
    public void ajouterJoueur(Joueur joueur) {
        joueursList.add(joueur);
    }

    /**
     * Affiche un message selon que le nombre proposé est trop grand ou trop
     * petit
     *
     * @param msg Le type de message ("high" ou "low")
     */
    public void message(String msg) {
        if (msg.equals("high")) {
            System.out.println("Le nombre proposé est trop grand");
        } else if (msg.equals("low")) {
            System.out.println("Le nombre proposé est trop petit");
        }

    }

    /**
     * Gère le déroulement du jeu Fait deviner les joueurs à tour de rôle
     * jusqu'à ce que l'un d'eux trouve le nombre
     */
    public void devinerNombre() {
        initNombreATrouver();
        boolean nombreTrouve = false;

        System.out.println("Le jeu commence! Devinez un nombre entre 1 et 100");

        while (!nombreTrouve) {
            for (Joueur joueur : joueursList) {
                System.out.println("\nC'est au tour de " + joueur.getNom());
                int tentative = joueur.deviner();

                if (tentative < nombreATrouver) {
                    message("low");
                } else if (tentative > nombreATrouver) {
                    message("high");
                } else {
                    System.out.print("Bravo ");
                    joueur.afficherJoueurGagnant();
                    System.out.println("Le nombre était bien " + nombreATrouver);
                    nombreTrouve = true;
                    break;
                }
            }
        }
    }

}
