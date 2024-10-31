package Caneta;

public class Cod
{
    public static void main(String[] args)
    {
           Caneta c1 = new Caneta();
           c1.cor = "Azul";
           c1.ponta = 0.5f;
           c1.destampar();
           c1.rabiscar();
           c1.status();

           Caneta c2 = new Caneta();
           c2.modelo = "Can Lehi";
           c2.cor = "preta";
           c2.tampar();
           c2.rabiscar();
           c2.status();
    }
}
