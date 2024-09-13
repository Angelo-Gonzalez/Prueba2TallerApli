package skin;

public class OutfitAGL {
    private int Hp ;
    private String material;

    public OutfitAGL(int hp, String material) {
        this.Hp = hp;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }
    public String ataque(){
        return "ataque";
    }
}


