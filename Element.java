public enum Element implements Entite{
    FEU("F"), EAU("E"), PLANTE("P");

    private String symbole;

    Element(String symbole) {
        this.symbole = symbole;
    }

    @Override
    public String getSymbole() { return this.symbole; }

    public static Element getElementAleatoire() {
        Element[] elements = Element.values();
        return elements[(int)(elements.length * Math.random())];
    }

    public boolean domine(Element autre) {
        if (this == FEU    && autre == PLANTE) return true;
        if (this == EAU    && autre == FEU)    return true;
        if (this == PLANTE && autre == EAU)    return true;
        return false;
    }

    public Element cible() {
        if (this == FEU)    return PLANTE;
        if (this == EAU)    return FEU;
        if (this == PLANTE) return EAU;
        return null;
    }
}