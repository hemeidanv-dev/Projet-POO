public class Grille {
    private int largeur;
    private int hauteur;
    private Entite[][] grille;

    public Grille(int largeur, int hauteur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.grille = new Entite[hauteur][largeur];
    }

    public void afficheGrille() {
        System.out.println("   __1___2___3___4___5__");
        System.out.println("   _____________________");

        for (int i = 0; i < this.hauteur; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < this.largeur; j++) {
                if (this.grille[i][j] == null) {
                    System.out.print("|   ");
                } else {
                    System.out.print("| " + this.grille[i][j].getSymbole() + " ");
                }
            }
            System.out.print("|");
            System.out.println();
                System.out.println("   |___|___|___|___|___|");

        }

        System.out.println("   ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

    public void ajouterEntite(int tour, Entite entite, int x, int y) {
        // vérif coordonnées (x et y entre 0 et taille-1)
        if (x < 0 || x >= this.hauteur || y < 0 || y >= this.largeur) {
            System.out.println("Coordonnées invalides !");
            return;
        }
        // vérif case vide
        if (this.grille[x][y] != null) {
            System.out.println("Case déjà occupée !");
            return;
        }
        // vérif adjacence (sauf premier tour)
        if (tour != 1 && !adjacent(x, y)) {
            System.out.println("Doit être adjacent à une case occupée !");
            return;
        }
        this.grille[x][y] = entite;
    }

    public boolean adjacent(int ligne, int col) {
        if (ligne - 1 >= 0 && this.grille[ligne - 1][col] != null) return true;
        if (ligne + 1 < this.hauteur && this.grille[ligne + 1][col] != null) return true;
        if (col - 1 >= 0 && this.grille[ligne][col - 1] != null) return true;
        if (col + 1 < this.largeur && this.grille[ligne][col + 1] != null) return true;
        return false;
    }

    public boolean grillePleine() {
        for (int i = 0; i < this.hauteur; i++) {
            for (int j = 0; j < this.largeur; j++) {
                if (this.grille[i][j] == null) return false;
            }
        }
        return true;
    }

    public Entite getEntite(int x, int y) {
        return this.grille[x][y];
    }

    public int getHauteur() { return this.hauteur; }
    public int getLargeur() { return this.largeur; }
}