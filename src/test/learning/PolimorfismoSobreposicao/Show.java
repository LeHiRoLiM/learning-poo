package PolimorfismoSobreposicao;

public class Show
{
    public static void main(String[] args)
    {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();

        c.locomover();

    }
}
