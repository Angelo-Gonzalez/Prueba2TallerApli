public class PiernaAGL {
    private int CantidadDedos;
    private String DerechaoIzquierda;

    public PiernaAGL(String DerechaoIzquierda) {
        this.CantidadDedos = 5;
        this.DerechaoIzquierda = DerechaoIzquierda;
    }

    public int getCantidadDedos() {
        return CantidadDedos;
    }
    public String getDerechaoIzquierda() {
        return DerechaoIzquierda;
    }
    public void setDerechaoIzquierda(String DerechaoIzquierda) {
        this.DerechaoIzquierda = DerechaoIzquierda;
    }

    @Override
    public String toString() {
        return "Pierna" + DerechaoIzquierda + "con " + CantidadDedos;
    }
}
