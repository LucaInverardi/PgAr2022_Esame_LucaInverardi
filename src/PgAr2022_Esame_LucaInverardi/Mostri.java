package PgAr2022_Esame_LucaInverardi;

public class Mostri {
    private String nome;
    private int vita;
    private int attacco;
    private int difesa;
    private int arma;


    public double CalcoloDannoM(int arma, int attacco, int difesa){
        Scontro mod = new Scontro();
        double danni = mod.CalcoloModificatore();
        double danno = ((((2*arma) * attacco)%(25 * difesa)) + 2) * danni ;
        System.out.println(danno);
        return danno;
    }

    public void InfliggiDannoM(){
        Mostri mostri = new Mostri(nome, vita, attacco, difesa, arma);
        double danno = mostri.CalcoloDannoM(arma, attacco, difesa);
        vita = (int) danno - vita;
        if (vita == 0){
            System.out.println("Il " + nome + "è morto!");
        }
        if (vita != 0){
            mostri.vita = vita;
        }
    }



    public Mostri(String nome, int vita, int attacco, int difesa, int arma) {
        this.nome = nome;
        this.vita = vita;
        this.attacco = attacco;
        this.difesa = difesa;
        this.arma = arma;
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

    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }
}
