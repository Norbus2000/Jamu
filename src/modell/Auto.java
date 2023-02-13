
package modell;

public class Auto extends Jarmu{
    private boolean defekt;

    public Auto(boolean defekt, boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        super(beinditva, uzemanyag, megerkezett);
        this.defekt = defekt;
    }
    
    public void kerekCsere(){
        if (this.defekt==true){
            
        }
    }
    @Override
    public boolean halad(){
               if(super.isBeinditva() && super.isUzemanyag()){
        return true;
        }else if (super.isMegerkezett()==true){
            super.setUzemanyag(true);
            return false;
        }
        return false;
    }
   
}
