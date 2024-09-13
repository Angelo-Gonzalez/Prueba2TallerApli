import skin.OutfitAGL;

public class RobotAGL {

    private ManoAGL ManoDerecha;
    private ManoAGL ManoIzquierda;
    private CabezaAGL Cabeza;
    private PiernaAGL PiernaDerecha;
    private PiernaAGL PiernaIzquierda;
    private TorsoAGL Torso;
    private OutfitAGL Outfit;

    public RobotAGL() {
        this.ManoDerecha = null;
        this.ManoIzquierda = null;
        this.Cabeza = null;
        this.PiernaDerecha = null;
        this.PiernaIzquierda = null;
        this.Torso = null;
        this.Outfit = null;

    }

    public OutfitAGL getOutfit() {
        return Outfit;
    }

    public void setOutfit(OutfitAGL outfit) {
        this.Outfit = outfit;
    }

    public TorsoAGL getTorso() {
        return Torso;
    }
    public void setTorso(TorsoAGL torso) {
        this.Torso = torso;
    }

    public PiernaAGL getPiernaDerecha() {
        return PiernaDerecha;
    }

    public void setPiernaDerecha(PiernaAGL piernaDerecha) {
        this.PiernaDerecha = piernaDerecha;
    }

    public PiernaAGL getPiernaIzquierda() {
        return PiernaIzquierda;
    }

    public void setPiernaIzquierda(PiernaAGL piernaIzquierda) {
        this.PiernaIzquierda = piernaIzquierda;
    }

    public CabezaAGL getCabeza() {
        return this.Cabeza;
    }

    public void setCabeza(CabezaAGL cabeza) {
        this.Cabeza = cabeza;
    }


    public ManoAGL getManoDerecha() {
        return ManoDerecha;
    }

    public ManoAGL getManoIzquierda() {
        return ManoIzquierda;
    }

    public void setManoDerecha(ManoAGL ManoDerecha) {
        this.ManoDerecha = ManoDerecha;
    }

    public void setManoIzquierda(ManoAGL ManoIzquierda) {
        this.ManoIzquierda = ManoIzquierda;
    }

    @Override
    public String toString() {
        return "Caracteristicas:\n----------------------------------------------------------------------\n" + Cabeza.toString() + "\nCuenta con " + ManoDerecha.toString() + "\nY " + ManoIzquierda.toString() +
                "\nAdemas tiene " + PiernaDerecha.toString() + " , " + PiernaIzquierda.toString() + ". \nFinalmente " + Torso.toString() + "\nY esta equipado con " + Outfit.toString() +"\n----------------------------------------------------------------------";
    }

}