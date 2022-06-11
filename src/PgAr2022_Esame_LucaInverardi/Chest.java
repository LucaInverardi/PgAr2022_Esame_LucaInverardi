package PgAr2022_Esame_LucaInverardi;

import java.util.Random;

public class Chest {
    String[] armi = {"Spada", "Ascia", "Martello da Guerra"};
    String[] scudi = {"Scudo in legno", "Scudo in ferro", "Scudo in oro"};
    String[] pozioni = {"Pozione curativa"};



    public String SceltaOggetto(){
        Random rand = new Random();
        //String oggetti = null;
        String trovato = null;
        double scelta = rand.nextDouble(11);
        if (scelta <= 4){
            int i = rand.nextInt(armi.length) + 1;
            trovato = armi[i];
            System.out.println(trovato);
        }
        if(scelta > 4){
            if (scelta <= 7.5){
                int i = rand.nextInt(scudi.length) + 1;
                trovato = scudi[i];
                System.out.println(trovato);
            }else{
                int i = rand.nextInt(pozioni.length) + 1;
                trovato = pozioni[i];
                System.out.println(trovato);
            }
        }
        //oggetti.add(trovato);
    return trovato;
    }

    public void ValoreOggetto(){
        Random random = new Random();
        Chest trovato = new Chest();
        trovato.SceltaOggetto();
        int potenzaArma = 0;
        int recuperaVita = 0;
        if (trovato.equals(armi[1])){
            potenzaArma = random.nextInt(56) -20;
        }
        if(trovato.equals(armi[2])){
            potenzaArma = random.nextInt(56) -20;
        }
        if(trovato.equals(armi[3])){
            potenzaArma = random.nextInt(56) -20;
        }
        if(trovato.equals(scudi[1])){
            potenzaArma = random.nextInt(56) -20;
        }
        if(trovato.equals(scudi[2])){
            potenzaArma = random.nextInt(56) -20;
        }
        if(trovato.equals(scudi[3])){
            potenzaArma = random.nextInt(56) -20;
        }
        if(trovato.equals(pozioni[1])){
           // recuperaVita = getVita()/2 ;
        }
    }






    public String[] getArmi() {
        return armi;
    }

    public void setArmi(String[] armi) {
        this.armi = armi;
    }

    public String[] getScudi() {
        return scudi;
    }

    public void setScudi(String[] scudi) {
        this.scudi = scudi;
    }

    public String[] getPozioni() {
        return pozioni;
    }

    public void setPozioni(String[] pozioni) {
        this.pozioni = pozioni;
    }
}
