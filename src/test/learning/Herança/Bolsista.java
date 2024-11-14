package Herança;

public class Bolsista extends Aluno
{
    private float bolsa;

    public void  RenovarBolsa()
    {
        System.out.println("Renovando bolsa de: " + this.getNome());
    }

    @Override
    public void pagarMensalidade()
    {
        System.out.println( this.getNome() +" Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
