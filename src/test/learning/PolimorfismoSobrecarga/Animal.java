package PolimorfismoSobrecarga;

public abstract class Animal
{
    private int numero;

    public void reagir()
    {
    System.out.println("conotando");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public abstract void reagir(int a);
}
