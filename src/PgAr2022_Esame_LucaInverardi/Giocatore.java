package PgAr2022_Esame_LucaInverardi;

import java.util.ArrayList;

public class Giocatore {
    private String nome;
    private int vita;
    private int attacco;
    private int difesa;
    private int potenza;
    ArrayList<String> oggetti = new ArrayList<>();


    public double CalcoloDannoG(int potenza, int attacco, int difesa){
        Scontro mod = new Scontro();
        double danni = mod.CalcoloModificatore();
        double danno = ((((2*potenza) * attacco)%(25 * difesa)) + 2) * danni ;
        System.out.println(danno);
        return danno;
    }

    public void InfliggiDannoG(){
        Giocatore giocatore = new Giocatore(nome, vita, attacco, difesa, potenza);
        double danno = giocatore.CalcoloDannoG(potenza, attacco, difesa);
        vita = (int) danno - vita;
        if (vita == 0){
            System.out.println("Il " + nome + "è morto!");
        }
        if (vita != 0){
            giocatore.vita = vita;
        }
    }

    public Giocatore(String nome, int vita, int attacco, int difesa, int potenza) {
        this.nome = nome;
        this.vita = vita;
        this.attacco = attacco;
        this.difesa = difesa;
        this.potenza = potenza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public ArrayList<String> getOggetti() {
        return oggetti;
    }

    public void setOggetti(ArrayList<String> oggetti) {
        this.oggetti = oggetti;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }
}
