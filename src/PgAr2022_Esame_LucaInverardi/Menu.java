package PgAr2022_Esame_LucaInverardi;
import it.unibs.fp.mylib.InputDati;
import java.util.Random;

public class Menu {
    //Costanti
    private final static String NOME = "Inserire nome del personaggio";
    private final static String VITA = "Inserire vita del personaggio";
    private final static String ATTACCO = "Inserire attacco del personaggio";
    private final static String DIFESA = "Inserire difesa del personaggio";
    private final static String RIINSERIRE_VITA = "Il valore della vita del personaggio deve essere pari a 20";
    private final static String MOVIMENTO_GIOCATORE = "Muovi il giocatore premendo w = su, a = sinstra," +
            " s = giù, d = destra";
    private final static String TURNO_GIOCATORE = "m = apri menu, e = apri cassa, v = muovi giocatore";
    private static final String MESSAGGIO_INIZIALE = "Selezionare un'opzione";



    String[] voci_menu = {"Abbandona partita", "Crea Giocatore", "Turno Giocatore"};
    String[] voci_turno = {"Esci dal menu", "Apri l'inventario", "Statistiche Giocatore"};
    String[] nomi_mostri = {"Zakkrer","Dzeizo", "Gallto", "Bykerk"};



   public void CreaMostro(){
       Random random = new Random();
       int i = random.nextInt(4);
       String nomem = nomi_mostri[i];
       int vitam =(int) (Math.random() * 36) - 10;
       int attaccom = 5;
       int difesam = 5;
       int arma = (int) (Math.random() * 56) - 20;
       Mostri mostri = new Mostri(nomem, vitam, attaccom, difesam, arma);
   }

    public void Menu() {

        int lista_grande;
        do {
            //Stampa opzioni
            for (int i = 0; i < 3; i++) {
                System.out.println(i + ". " + voci_menu[i]);
            }

            lista_grande = 0;
            int scelta = InputDati.leggiIntero(MESSAGGIO_INIZIALE, 0, 2);
            switch (scelta) {
                case 1://Creazione giocatore
                    String nomeg = InputDati.leggiStringa(NOME);
                    int vitag = InputDati.leggiInteroNonNegativo(VITA);
                    boolean check;
                    do {
                        check = true;
                        if (vitag != 20) {
                            System.out.println(RIINSERIRE_VITA);
                            check = false;
                        }
                    } while (check == false);
                    int attaccog = InputDati.leggiInteroNonNegativo(ATTACCO);
                    int difesag = InputDati.leggiInteroNonNegativo(DIFESA);
                    int potenzag = 1;
                    Giocatore giocatore = new Giocatore(nomeg, vitag, attaccog, difesag, potenzag);
                    break;

                case 2://Turno Giocatore
                    char movimento;
                    char scelta_turno;
                    scelta_turno = InputDati.leggiChar(TURNO_GIOCATORE);
                    if (scelta_turno == 'm' || scelta_turno == 'M') {
                        //Stampa opzioni
                        for (int i = 0; i < 3; i++) {
                            System.out.println(i + ". " + voci_turno[i]);
                        }
                        int lista;
                        do {
                            lista = 0;
                            int scelta_menu = 0;
                            switch (scelta_menu) {
                                case 1://Apri Inventario


                                    System.out.println();

                                    break;
                                case 2://Vedi Statistiche
                                    System.out.println("nome: " + giocatore.getNome() + "vita: " + giocatore.getVita() +
                                            "attacco: " + giocatore.getAttacco() + "difesa: " + giocatore.getDifesa() +
                                            "potenza: " + giocatore.getPotenza());
                                    break;
                                case 0://Esci
                                    break;
                            }
                        } while (lista == 0);

                    }
                    //Creiamo la mappa
                    Mappa mappa = new Mappa();

                    int i = 0;
                    int j = 0;
                    movimento = InputDati.leggiChar(MOVIMENTO_GIOCATORE);
                    if (movimento == 'w' || movimento == 'W') {
                        //Avanza di una casella su nella matrice
                        i = i - 1;
                        mappa[i][j];

                    }
                    if (movimento == 'a' || movimento == 'A') {
                        //Avaza di una casella a sinistra nella matrice
                        j = j - 1;
                        mappa[i][j];
                    }
                    if (movimento == 's' || movimento == 'S') {
                        //Avanza di una casella in giu nella matrice
                        i = i + 1;
                        mappa[i][j];
                    }
                    if (movimento == 'd' || movimento == 'D') {
                        //Avanza di una casella a destra nella matrice
                        j = j + 1;
                        mappa[i][j];
                    }


                    break;
                case 0://Abbandona la partita
                    break;
            }
        } while (lista_grande != 0);
    }


    public String[] getVoci_menu() {
        return voci_menu;
    }

    public void setVoci_menu(String[] voci_menu) {
        this.voci_menu = voci_menu;
    }

    public String[] getVoci_turno() {
        return voci_turno;
    }

    public void setVoci_turno(String[] voci_turno) {
        this.voci_turno = voci_turno;
    }

    public String[] getNomi_mostri() {
        return nomi_mostri;
    }

    public void setNomi_mostri(String[] nomi_mostri) {
        this.nomi_mostri = nomi_mostri;
    }


}
