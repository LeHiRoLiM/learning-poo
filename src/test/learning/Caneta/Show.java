package Caneta;

public class Show
{
    public static void main(String[] args)
    {
           Caneta c1 = new Caneta();
           c1.modelo = "Bic Cristal";
           c1.cor = "azul";
           c1.carga = 80;
           c1.destampar();
//         c1.ponta = 0.6f;
           c1.status();
           c1.rabiscar();

//           Caneta c2 = new Caneta();
//           c2.modelo = "Can Lehi";
//           c2.cor = "preta";
//           c2.tampar();
//           c2.rabiscar();
//           c2.status();
    }
}
