class ManoAGL {
    private int CantidadDedos;
    private String DerechaOIzquierda;

    public ManoAGL(String DerechaOIzquierda) {
        this.CantidadDedos = 5;
        this.DerechaOIzquierda = DerechaOIzquierda;
    }

    public int getCantidadDedos() {
        return CantidadDedos;
    }

    public String getDerechaOIzquierda() {
        return DerechaOIzquierda;
    }

    public void setDerechaOIzquierda(String DerechaOIzquierda) {
       this.DerechaOIzquierda = DerechaOIzquierda;
    }

    @Override
    public String toString() {
        return "Mano " + getDerechaOIzquierda() + ", " + getCantidadDedos() + " dedos.";
    }
}