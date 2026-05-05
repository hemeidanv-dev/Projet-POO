
public enum Element {
    FEU("🔥", "F"), EAU("💧","E"), PLANTE("🌿","P");

    private String emoji;
    private String symbole;
    Element(String emoji, String symbole) {
        this.emoji = emoji;
        this.symbole = symbole;
    }

    public String getEmoji(){
        return this.emoji;
    }

    public String getSymbole(){
        return this.symbole;
    }

    public static Element getElementAleatoire() {
        Element[] elements = Element.values();
        return elements[(int)(elements.length * Math.random())];
    }

    public boolean domine(Element autre){
        return switch (this) {
            case FEU -> autre == PLANTE;
            case EAU -> autre == FEU;
            case PLANTE -> autre == EAU; 
 
        };
    }


};
