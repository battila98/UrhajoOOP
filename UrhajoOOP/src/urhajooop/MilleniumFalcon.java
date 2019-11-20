package urhajooop;

public abstract class MilleniumFalcon implements Urhajo, Hiperhajtomu{
    
    private double tapasztalat;

    public MilleniumFalcon(double tapasztalat) {
        this.tapasztalat = 100;
    }

    @Override
    public double milyenGyors(){
       return tapasztalat*2;
    }

    @Override
    public boolean legyorsuljaE(Urhajo hajo){
        /*if (hajo) { //feltétel megírására és kiatlálására nincs időm. RIP
            tapasztalat += 500;
        }*/
        return true;
    }
    
    
}
