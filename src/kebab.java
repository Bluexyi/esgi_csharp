import java.util.ArrayList;

public class kebab {
    private ArrayList viande;
    private ArrayList legume;
    private ArrayList poisson;
    private ArrayList sauce;
    private ArrayList fromage;

    public kebab(ArrayList viande, ArrayList legume, ArrayList poisson, ArrayList sauce, ArrayList fromage) {
        this.viande = viande;
        this.legume = legume;
        this.poisson = poisson;
        this.sauce = sauce;
        this.fromage = fromage;
    }

    public boolean isVegetarien(){
        if(viande.isEmpty() && poisson.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean isPescetarien(){
        if(viande.isEmpty()){
            return true;
        }
        return false;
    }



}
