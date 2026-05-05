public class Hydro extends Mage {
    public Hydro(int x, int y) {
        super(x, y, Element.EAU);
    }

    @Override
    public int calculerPoints(String[][] grille) {
        int points = 0;
        int n = grille.length;

        //ligne
        for (int j = 0; j < n; j++) {
            if (j == y) continue;
            if (Element.EAU.equals(grille[x][j])) {
                points++;
            }
        }

        //colonne
        for (int i = 0; i < n; i++) {
            if (i == x) continue;
            if (Element.EAU.equals(grille[i][y])) {
                points++;
            }
        }

        return points;
    }
}