
package modell;

public class Auto extends Jarmu{
    private boolean defekt;

    public Auto(boolean defekt, boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        super(beinditva, uzemanyag, megerkezett);
        this.defekt = defekt;
    }
    
    public void kerekCsere(){}
    public boolean halad(){
        return false;
    }
   
}
