public class Cuillere extends Ustensile{
    private double longueur;
    public Cuillere(int a, double l) {
        super(a);
        longueur = l;
    }
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double l) {
        longueur = l;
    }

}
