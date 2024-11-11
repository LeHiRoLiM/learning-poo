package Luta;

public class Show
{
    public static void main(String[] args)
    {
        Lutador[] lutadors = new Lutador[2];
        lutadors[0] = new Lutador("Lehi", "Brasil", 23, 1.56f,59,2,4,2);
        lutadors[1] = new Lutador("Gabriel","Argentina",20,1.70f,62.6f,1,5,3);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutadors [0], lutadors [1]);
        UEC01.lutar();
    }
}
