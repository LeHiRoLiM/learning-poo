package PolimorfismoSobreposicao;

public class Ave extends PolimorfismoSobreposicao.Animal
{
    private String corPena;


    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("piado");
    }

    public String getCorPena()
    {
        return corPena;
    }

    public void setCorPena(String corPena)
    {
        this.corPena = corPena;
    }
}
