package learning.PolimorfismoSobrecarga;

public class Mamiferoo extends Animall
{
    protected String corPelo;


    @Override
    public void emitirSom()
    {
        System.out.println("Som do mamífero");
    }
}
