import skin.AdamantiumAGL;
import skin.CueroAGL;
import skin.OutfitAGL;

public class Main {
    public static void main(String[] args) {

        RobotAGL Robot = new RobotAGL();


        ManoAGL ManoDerecha = new ManoAGL( "Derecha ");
        ManoAGL ManoIzquierda = new ManoAGL( "Izquierda ");
        PiernaAGL PiernaIzquierda = new PiernaAGL("Izquierda ");
        PiernaAGL PiernaDerecha = new PiernaAGL("Derecha ");
        CabezaAGL Cabeza = new CabezaAGL("Termica ", true);
        TorsoAGL Torso = new TorsoAGL("Aluminio ", "105 ");
        CueroAGL outfit = new CueroAGL(320, "Cuero fino. ");
        AdamantiumAGL outfit2 = new AdamantiumAGL(750, " Placas de alta calidad. ");


        Robot.setManoDerecha(ManoDerecha);
        Robot.setManoIzquierda(ManoIzquierda);
        Robot.setPiernaIzquierda(PiernaIzquierda);
        Robot.setPiernaDerecha(PiernaDerecha);
        Robot.setCabeza(Cabeza);
        Robot.setTorso(Torso);
        Robot.setOutfit(outfit2);


        System.out.println(Robot.toString());
    }

}
