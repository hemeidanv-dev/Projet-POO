public class Pyro extends Mage{

    private int x;
    private int y;

    public Pyro(int x, int y) {
        super(x, y, Element.FEU);
    }

    @Override
    public int calculerPoints(String[][] grille) {
        int points = 0;
        int n = grille.length;

        //diagonale en haut a gauche
        int i = x - 1;
        int j = y - 1;
        while (i >= 0 && j >= 0) {
            if (Element.FEU.equals(grille[i][j])) points++;
            i--; j--;
        }

        //diagonale en haut a doite
        i = x - 1;
        j = y + 1;
        while (i >= 0 && j < n) {
            if (Element.FEU.equals(grille[i][j])) points++;
            i--; j++;
        }

        //diagonale en bas a gauche
        i = x + 1;
        j = y - 1;
        while (i < n && j >= 0) {
            if (Element.FEU.equals(grille[i][j])) points++;
            i++; j--;
        }

        //diagonale en bas a doite
        i = x + 1;
        j = y + 1;
        while (i < n && j < n) {
            if (Element.FEU.equals(grille[i][j])) points++;
            i++; j++;
        }

        return points;
    }
}