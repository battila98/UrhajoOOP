package urhajooop;

public abstract class LazadoGep implements Urhajo{
    private double sebesseg;
    private boolean meghibasodhatE;

    public LazadoGep(double sebesseg, boolean meghibasodhatE) {
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;
    }
            
    abstract boolean elkapjaAVonosugar();

    @Override
    public double milyenGyors(){
        return this.sebesseg;
    }

    @Override
    public boolean legyorsuljaE(Urhajo hajo){
        boolean seged = false;
        if (hajo instanceof LazadoGep && 
                ((LazadoGep) hajo).meghibasodhatE==true &&
                this.sebesseg > hajo.milyenGyors()) { // ellenörzést igényel
            seged = true;
        }
        /*else if (seged) { //nincs befejezve
            seged = true;
        }*/ 
        return false;
        
    }

    public double getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public boolean isMeghibasodhatE() {
        return meghibasodhatE;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }

    @Override
    public String toString() {
        return "LazadoGep{" + "sebesseg=" + sebesseg + ", meghibasodhatE=" + meghibasodhatE + '}';
    }
    
    
    
    
    
}
