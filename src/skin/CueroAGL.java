package skin;

public class CueroAGL extends OutfitAGL{
    public CueroAGL(int Hp, String material) {
        super(Hp, material);
    }
    @Override
    public String ataque() {
        return "ataque de hojas giratorias.";
    }

    @Override
    public String toString(){
        return "La armadura de " + getMaterial() + "Te da " + getHp() + "y podras atacar con " + ataque();
    }

}

