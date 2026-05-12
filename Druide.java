public class Druide extends Mage {
    public Druide() {
        super(Element.PLANTE); // associé à l'élément Plante
    }

    @Override
    public String getSymbole() {
        return "D"; 
    }

    @Override
    public int calculerPoints(Entite[][] grille, int x, int y) {
        int points = 0;
        int n = grille.length;

        // 1. Case juste au-dessus (x-1, y)
        if (x - 1 >= 0) {
            if (grille[x - 1][y]==Element.PLANTE) points++;
        }

        // 2. Case juste en-dessous (x+1, y)
        if (x + 1 < n) {
            if (grille[x + 1][y]==Element.PLANTE) points++;
        }

        // 3. Case à gauche (x, y-1)
        if (y - 1 >= 0) {
            if (grille[x][y - 1]==Element.PLANTE) points++;
        }

        // 4. Case à droite (x, y+1)
        if (y + 1 < n) {
            if (grille[x][y + 1]==Element.PLANTE) points++;
        }

        // 5. Diagonale Haut-Gauche (x-1, y-1)
        if (x - 1 >= 0 && y - 1 >= 0) {
            if (grille[x - 1][y - 1]==Element.PLANTE) points++;
        }

        // 6. Diagonale Haut-Droite (x-1, y+1)
        if (x - 1 >= 0 && y + 1 < n) {
            if (grille[x - 1][y + 1]==Element.PLANTE) points++;
        }

        // 7. Diagonale Bas-Gauche (x+1, y-1)
        if (x + 1 < n && y - 1 >= 0) {
            if (grille[x + 1][y - 1]==Element.PLANTE) points++;
        }

        // 8. Diagonale Bas-Droite (x+1, y+1)
        if (x + 1 < n && y + 1 < n) {
            if (grille[x + 1][y + 1]==Element.PLANTE) points++;
        }

        return points;
    }
}