public class Toutou {
    private String nom;
    private int nombrePuces;

    public Toutou(String nom, int puce) {
        if (puce > 0 && nom != null) {
            this.nom = nom;
            this.nombrePuces = puce;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
