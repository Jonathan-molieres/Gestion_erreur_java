public class MainExercie1 {
    public static void main(String[] argv) throws PilePleineException, PileVideException {
        try {
            Pile p = new Pile();
            p.empiler(2);
            p.empiler(4);
            p.depilerTout();
            System.out.println(p.sommet());
        } catch (PileVideException e) {
            System.out.println("Le main pense que la pile est vide");
        } catch (PilePleineException e) {
            System.out.println("Le main pense que la pile est pleine");
        } catch (Exception e) {
            System.out.println("Le main est passé par là");
        }
        System.out.println("sortie du main");

    }
}
