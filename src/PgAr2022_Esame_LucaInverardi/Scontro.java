package PgAr2022_Esame_LucaInverardi;

import java.util.Random;

public class Scontro {
    private double modificatore;
    private double danni;

    public double CalcoloModificatore(){
        Random rnd = new Random();
        modificatore = rnd.nextDouble(101);
        if (modificatore >= 92.5){
            danni =  1.5;
        }else {
            danni = 1;
        }
        return danni;
    }

    public double getModificatore() {
        return modificatore;
    }

    public void setModificatore(double modificatore) {
        this.modificatore = modificatore;
    }

    public double getDanni() {
        return danni;
    }

    public void setDanni(double danni) {
        this.danni = danni;
    }
}
