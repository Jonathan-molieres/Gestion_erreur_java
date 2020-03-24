public class Pile {
    private static final int TAILLE_MAX = 2;// taille maximum de la pile
    private int t[]; // tableau stockant les éléments de la pile
    private int nb; // nombre d’éléments dans la pile

    public Pile() {
        t = new int[TAILLE_MAX];
        nb = 0;
    }

    public boolean estVide() {
        return nb == 0;
    }

    public void empiler(int i) throws PilePleineException {
        if (nb + 1 <= TAILLE_MAX) {
            t[nb] = i;
            nb = nb + 1;
        } else {
            throw new PilePleineException();

        }

    }

    public int sommet() throws PileVideException {
        if (!this.estVide()) {
            return t[nb];
        } else {
            throw new PileVideException();
        }
    }
    public void depiler() throws PileVideException {
        if (!this.estVide()) {
            nb=nb-1;
        } else {
            throw new PileVideException();
        }
    }
    public void depilerTout() throws PileVideException {
        if (!this.estVide()) {
            while (! this.estVide()) {
                this.depiler();
                System.out.println("valeur de la pile est "+ t[nb]+" .");
                }

        } else {
            throw new PileVideException();
         }
    }
}
