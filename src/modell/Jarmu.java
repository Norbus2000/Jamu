package modell;

public abstract class Jarmu {

    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
    }

    public void beindit() {
        if(this.uzemanyag==true){
        this.beinditva = true;
        }else{
             this.beinditva = false;
        }
    }

    public void leallit() {
        if(this.beinditva==true){
            this.beinditva = false;
        }
        if(this.megerkezett==true){
            this.beinditva=false;
        }
    }

    public boolean tankol() {
        this.uzemanyag=true;
        return true;
    }

    public boolean halad() {
        if(this.beinditva && this.uzemanyag==true){
        return true;
        }else if (this.megerkezett==true){
            this.uzemanyag = false;
            return false;
        }
        return false;
        
    }
    
}
