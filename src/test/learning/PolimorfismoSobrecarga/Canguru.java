package PolimorfismoSobrecarga;

public class Canguru extends Mamifero
{
    @Override
    public void locomover()
    {
        System.out.println("Saltando");
    }

    public void usarBolsa()
    {
        System.out.println("Usando bolsa");
    }

    public void emitirSom()
    {
        System.out.println("Som do canguru");
    }

}
