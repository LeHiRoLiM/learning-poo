package Sleep;

public class Chair
{
    String modelo;
    String cor;
    int pernas;
    boolean assento;
    void status()
    {
        System.out.println("O modelo é de"+ this.modelo);
        System.out.println("A cor é " + this.cor);
        System.out.println("Quantas pernas: " + this.pernas);
        System.out.println("Tem assento: " + this.assento);
    }
    void sentar()
    {
        if (this.assento == true)
        {
            System.out.println("Tô sentando !!");
        } else
        {
            System.out.println("Bah, conserta aí guri ! ");
        }
    }
}
