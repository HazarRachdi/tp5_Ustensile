public class AssietteRond extends Assiette{
    private double rayon;

    public AssietteRond(int a, double r) {
        super(a);
        rayon = r;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double r) {
        rayon = r;
    }
    public  double calculer_surface(){
        return 3.14*rayon*rayon;
    }
}
