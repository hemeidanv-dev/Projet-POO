public class Pyro extends Mage{

    public Pyro(int x, int y) {
        super(x, y, Element.FEU);
    }

    @Override
    public int calculerPoints(Element[][] grille) {
        int points = 0;
        int n = grille.length;

        //diagonale en haut a gauche
        int i = x - 1;
        int j = y - 1;
        while (i >= 0 && j >= 0) {
            if (grille[i][j]==Element.FEU) points++;
            i--; j--;
        }

        //diagonale en haut a doite
        i = x - 1;
        j = y + 1;
        while (i >= 0 && j < n) {
            if (grille[i][j]==Element.FEU) points++;
            i--; j++;
        }

        //diagonale en bas a gauche
        i = x + 1;
        j = y - 1;
        while (i < n && j >= 0) {
            if (grille[i][j]==Element.FEU) points++;
            i++; j--;
        }

        //diagonale en bas a doite
        i = x + 1;
        j = y + 1;
        while (i < n && j < n) {
            if (grille[i][j]==Element.FEU) points++;
            i++; j++;
        }

        return points;
    }
}