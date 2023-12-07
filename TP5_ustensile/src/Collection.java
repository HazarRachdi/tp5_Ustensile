public class Collection {
    public static void main(String[] args) {
        Ustensile[] us=new Ustensile[5];
        AssietteRond ar1=new AssietteRond(1964,3);
        AssietteRond ar2=new AssietteRond(1977,2.5);
        AssietteCarree ac1=new AssietteCarree(1985,3.5);
        AssietteCarree ac2=new AssietteCarree(1954,2.5);
        Cuillere C1=new Cuillere(1986,1.5);
        us[0]=ar1;
        us[1]=ar2;
        us[2]=ac1;
        us[3]=ac2;
        us[4]=C1;
        afficher_cuillere(us);
        afficher_surfaceAssiettes(us);
        afficher_valeurTotal(us);
    }
    public static void afficher_cuillere(Ustensile[] us){
        int c=0;
        for (int i = 0; i <5 ; i++) {
            if(us[i] instanceof Cuillere){
                c++;
                System.out.println("il y a"+c+"cuilleres");
            }

        }
    }
    public static void afficher_surfaceAssiettes(Ustensile[] us){
        double somme=0;
        for (int i = 0; i < 5; i++) {
            if(us[i] instanceof Assiette){
                somme+=((Assiette) us[i]).calculer_surface();
            }
            System.out.println("la surface totale des assietttes est"+somme);
        }

    }
    public static void afficher_valeurTotal(Ustensile[] us){
        int v=0;
        for (int i = 0; i <5 ; i++) {
            v+=us[i].calculer_valeur(2023);
            System.out.println("la valeur total des ustensiles est"+v);
        }

    }
}
