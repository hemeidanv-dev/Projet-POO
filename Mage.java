public abstract class Mage implements Entite {
    protected Element element;

    public Mage(Element element) {
        this.element = element;
    }

    public Element getElement() {
         return this.element;
    }

    @Override
    public abstract String getSymbole();

    public abstract int calculerPoints(Entite[][] grille, int x, int y);

    public static Mage getMageAleatoire() {
        int random = (int)(3 * Math.random());
        return switch (random) {
            case 0 -> new Pyro();
            case 1 -> new Hydro();
            case 2 -> new Druide();
            default -> new Pyro();
        };
    }
}