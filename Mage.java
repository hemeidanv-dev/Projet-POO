public abstract class Mage{
    private int x;
    private int y;
    
    private Element element;

    public Mage(int x, int y, Element element) {
        this.x = x;
        this.y = y;
        this.element = element;
    }

    public abstract int calculerPoints(Element[][] grille);

    public Element getElement() {
        return this.element;
    }
}