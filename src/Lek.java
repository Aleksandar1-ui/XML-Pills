public class Lek {
    private String ime;
    private String jachina;
    private String forma;
    private String nd1;
    private String nd2;
    private String proizvoditel;

    public Lek(String ime, String jachina, String forma, String nd1, String nd2, String proizvoditel)
    {
        this.ime=ime;
        this.jachina=jachina;
        this.forma=forma;
        this.nd1=nd1;
        this.nd2=nd2;
        this.proizvoditel=proizvoditel;
    }
    public String getIme()
    {
        return this.ime;
    }
    public String getJachina()
    {
        return this.jachina;
    }
    public String getForma()
    {
        return this.forma;
    }
    public String getNd1()
    {
        return this.nd1;
    }
    public String getNd2()
    {
        return this.nd2;
    }
    public String getProizvoditel()
    {
        return this.proizvoditel;
    }
}
