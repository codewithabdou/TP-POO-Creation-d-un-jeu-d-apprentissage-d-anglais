package POOJEU;
public class CaseFin extends Case {

    public CaseFin(){
        numero=99;
    }

    private  final String couleur="noir";
    public void action(Plateau plateau , Joueur joueur ){

    }
    @Override
    public String toString() {
        return "CaseFin [couleur=" + couleur + "]";
    };
    

}
