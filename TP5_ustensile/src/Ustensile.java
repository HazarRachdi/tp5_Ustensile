public abstract class Ustensile {
    private int annee_fab;

    public Ustensile(int a) {
        annee_fab = a;
    }

    public int getAnnee_fab() {
        return annee_fab;
    }

    public void setAnnee_fab(int a) {
        annee_fab = a;
    }

    public int calculer_valeur(int annee_actuelle){
        int ans=annee_actuelle-annee_fab;
        if (ans<50){
            return 0;
        }
        else{
            return ans-50;
        }

    }
}
