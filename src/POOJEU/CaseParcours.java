package POOJEU;

public class CaseParcours extends Case {
   private final String couleur = "";

   public CaseParcours(int num) {
      numero = num;
   }

   public void action(Plateau plateau, Joueur joueur) {
   }

   @Override
   public String toString() {
      return "CaseParcours [couleur=" + couleur + "]";
   }; // aucune action

}
