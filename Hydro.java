public class Hydro extends Mage {
    public Hydro() {
        super(Element.EAU); // associé à l'élément Eau
    }

    @Override
    public String getSymbole() {
        return "H"; 
    }

    @Override
    public int calculerPoints(Entite[][] grille, int x, int y) {
        
        int points = 0;
        int n = grille.length;

        //ligne
        for (int j = 0; j < n; j++) {
            if (j == y) continue;
            if (grille[x][j]==Element.EAU) {
                points++;
            }
        }

        //colonne
        for (int i = 0; i < n; i++) {
            if (i == x) continue;
            if (grille[i][y]==Element.EAU) {
                points++;
            }
        }

        return points;
    }
}