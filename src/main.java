
/**
 * Point d'entrée du programme
 *
 * @param args Arguments de la ligne de commande (non utilisés)
 */

public static void main(String[] args) {
        // Création des joueurs
        Joueur marc = new Joueur("Marc-Aurel");
        Joueur blondia = new Joueur("Blondia");
        Joueur mbappe = new Joueur("M'bappé");

        // Initialisation du jeu
        JeuDeDevinettes jeu = new JeuDeDevinettes();

        // Ajout des joueurs
        jeu.ajouterJoueur(marc);
        jeu.ajouterJoueur(blondia);
        jeu.ajouterJoueur(mbappe);

        // Lancement du jeu
        jeu.devinerNombre();
    }
