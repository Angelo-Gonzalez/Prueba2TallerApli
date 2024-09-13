package skin;

public class AdamantiumAGL extends OutfitAGL{
    public AdamantiumAGL(int Hp, String material) {
        super(Hp, material);
    }
    @Override
    public String ataque() {
        return " tempestad de potencia.";
    }

    @Override
    public String toString(){
        return "la armadura de " + getMaterial() + "\nRecibes " + getHp() + " puntos de vida.\nAhora puedes atacar con " + ataque();
    }

}