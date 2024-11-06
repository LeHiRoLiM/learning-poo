package Activity;

public class ContaBanco
{
    private int nConta;
    private char tipo;
    private String nomeDono;
    private float saldo;
    private Boolean status;


    public ContaBanco(String _nome, char _tipo)
    {
        this.nConta = (Show.untimaConta += 1);
        this.nomeDono = _nome;
        this.tipo = _tipo;
        this.status = true;

        switch (tipo)
        {
            case 'c':
                this.saldo = 50;
                break;
            case 'p':
                this.saldo = 150;
                break;
            default:
                throw new RuntimeException("Error: Os tipos validos sao 'c' e 'p'.");
        }
    }

    public String toString()
    {
        return "\n" + "-- Banco Lehinho --" +

            "conta:  " + this.nConta + "\n" +
            "dono:   " + this.nomeDono + "\n" +
            "tipo:   " + this.tipo + "\n" +
            "saldo:  " + this.saldo + "\n" +
            "status: " + this.status;
    }
}

