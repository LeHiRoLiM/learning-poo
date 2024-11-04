package Caneta;

public class Caneta
{
    public String modelo;
    public String cor;
    private float ponta = 0.7f;
    protected int carga;
    private boolean tampada;
    public void status()
    {
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A caneta é " + this.cor);
        System.out.println("A Ponta " + this.ponta);
        System.out.println("A Carga " + this.carga);
        System.out.println("Ela está tampada: " + this.tampada );
    }

    public void rabiscar()
    {
        if (this.tampada == true)
        {
            System.out.println("Erro, não posso rabiscar.");
        } else
        {
            System.out.println("estou rabiscando! ");
        }
    }
    public void tampar()
    {
        this.tampada = true;
    }
    public void destampar()
    {
        this.tampada = false;
    }
}
