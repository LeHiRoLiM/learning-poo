package Caneta;

public class Caneta
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status()
    {
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A caneta é " + this.cor);
        System.out.println("A Ponta " + this.ponta);
        System.out.println("A Carga " + this.carga);
        System.out.println("Ela está tampada: " + this.tampada );
    }

    void rabiscar()
    {
        if (this.tampada == true)
        {
            System.out.println("Erro, não posso rabiscar.");
        } else
        {
            System.out.println("estou rabiscando! ");
        }
    }
    void tampar()
    {
        this.tampada = true;
    }
    void destampar()
    {
        this.tampada = false;
    }
}
