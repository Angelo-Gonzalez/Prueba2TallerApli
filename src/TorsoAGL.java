public class TorsoAGL {
    private String material;
    private String PuntosVida;

    public TorsoAGL(String material, String PuntosVida) {
        this.material = material;
        this.PuntosVida = PuntosVida;
    }

    public String getPuntosVida() {
        return PuntosVida;
    }

    public void setPuntosVida(String puntosVida) {
        PuntosVida = puntosVida;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "el nucleo está hecho de " + getMaterial() + "y cuenta con " + getPuntosVida() + "hp en total.";
    }
}
