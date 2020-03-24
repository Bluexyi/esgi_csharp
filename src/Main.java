import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------Kebapp------------------------");

        ArrayList viande = new ArrayList();
        ArrayList legume = new ArrayList();
        ArrayList poisson = new ArrayList();
        ArrayList sauce = new ArrayList();
        ArrayList fromage = new ArrayList();

        //viande.add("Steack");
        legume.add("Salade");
        legume.add("Tomate");
        legume.add("Ognion");
        poisson.add("carpe");
        sauce.add("Blache");
        fromage.add("cheddar");

        Kebab kebab = new Kebab(viande, legume, poisson, sauce, fromage);

        if(kebab.isVegetarien())
            System.out.println("Kebab végétarien");

        if(kebab.isPescetarien())
            System.out.println("Kebab pescetarien");











    }
}

