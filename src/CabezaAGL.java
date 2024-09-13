public class CabezaAGL {
    private String TipoVision;
    private boolean VisionActiva;

    public CabezaAGL(String TipoVision, boolean VisionActiva) {
        this.TipoVision = TipoVision;
        this.VisionActiva = VisionActiva;
        }

        public String getTipoVision() {
            return TipoVision;
        }

        public void setTipoVision(String TipoVision) {
        this.TipoVision = TipoVision;
        }

        public boolean getVisionActiva() {
        return VisionActiva;
        }

        public void setVisionActiva(boolean VisionActiva) {
        this.VisionActiva = VisionActiva;
        }

        @Override
        public String toString() {
        String var = "";
        if (VisionActiva == true){
            var = "ON";}
        else{
            var = "OFF";
        }
            return "La visión es " + TipoVision + " y es se encuentra " + var;
        }

}
