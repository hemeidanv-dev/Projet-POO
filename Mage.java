public abstract class Mage{
    private int x;
    private int y;
    
    private Element element;

    public Mage(int x, int y, Element element) {
        this.x = x;
        this.y = y;
        this.element = element;
    }

    public abstract int calculerPoints(String[][] grille);

    public String getElement() {
        return this.element;
    }
}