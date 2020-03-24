public class MainExercice2 {
    public static void main(String[] argv){
        try {
            Toutou chien = new Toutou("aa", -10);
        }
        catch(IllegalArgumentException e ){
            System.out.println("erreur du constructeur");
        }
    }
}
