public class MainExercice3 {
    public static void main(String[] argv){
        IntSet set=null;
        try {
            set = new IntSet(10,50);//essayer plusieurs valeurs
        }
        catch (WrongDimensionException e){
            System.out.println("Erreur de dimension: la valeur high est plus petit que la valeur low");
        }
        try{
            set.addValue(40);//essayer plusieurs valeurs

        } catch (NotInTheLimitsException e) {
            System.out.println("Erreur: La valeur ne fait partie de l'ensemble");
        }
        try{
            set.removeValue(new Integer(40));//essayer plusieurs valeurs

        } catch (NotInTheLimitsException e) {
            System.out.println("Erreur 2: La valeur ne fait partie de l'ensemble");
        }
    }
    // J'ai un problème entre l'indice d'une liste et Integer qui est l'objet dans notre cas  et je n'ai pas eu le temps
    // de gerer ceci
}
