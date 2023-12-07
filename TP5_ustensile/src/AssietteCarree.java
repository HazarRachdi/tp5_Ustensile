public class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int a, double c) {
        super(a);
        cote = c;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double c) {
        cote = c;
    }
    public int calculer_valeur(int annee_actuelle){
        return (5*super.calculer_valeur(annee_actuelle));
    }
    public  double calculer_surface(){
        return cote*cote;

    }
}
