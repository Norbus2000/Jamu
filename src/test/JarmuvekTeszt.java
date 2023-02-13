package test;

import modell.Auto;
import modell.Jarmu;

class Hajo extends Jarmu {
};

public class JarmuvekTeszt {

    public static void main(String[] args) {
        new JarmuvekTeszt();
    }

    public JarmuvekTeszt() {
        // mintaTeszt();
        haladBeinditassalAutoTeszt();
        haladBeinditasNLKTAutoTeszt();
    }

    public void mintaTeszt() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "nem egyeznek";
    }

    private void haladBeinditassalAutoTeszt() {
        Auto auto = new Auto(true, true, true, true);
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "tud haladni, de nincs beinditva";
    }

    private void haladBeinditasNLKTAutoTeszt() {
        Auto auto = new Auto(true, true, true, true);
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "tud haladni, de nincs beinditva";
    }

    private void haladBeinditasNklHajoTeszt() {
        Hajo hajo = new Hajo();
        boolean kapott = hajo.halad();
        boolean vart = false;
        assert kapott == vart : "tud haladni, de nincs beinditva";
    }

    private void haladBeinditassalHajoTeszt() {
        Hajo hajo = new Hajo();
        boolean kapott = hajo.halad();
        boolean vart = false;
        assert kapott == vart : "tud haladni, de nincs beinditva";
    }

    private void haladeHajoTeszt() {
        Hajo hajo = new Hajo();
        boolean kapott = hajo.halad();
        boolean vart = false;
        assert kapott == vart : "a hajo halad pedig nem szabadna";
    }

    private void haladeAutoTeszt() {
        Auto auto = new Auto(true, false, true, true);
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "az auto halad pedig nem halad";
    }

}
