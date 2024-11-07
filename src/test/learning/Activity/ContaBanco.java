package Activity;

public class ContaBanco
{
    private int nConta;
    private char tipo;
    private String nomeDono;
    private float saldo;
    private Boolean status;
    private int depositar;
    private int sacar;


    public ContaBanco(String _nome, char _tipo)
    {
        this.nConta = (Show.untimaConta += 1);
        this.nomeDono = _nome;
        this.tipo = _tipo;
        this.status = true;
        this.depositar = 5;
        this.sacar = 0;

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
        if (this.depositar > 0)
        {
            this.saldo += this.depositar;
        }
        if (this.sacar <= saldo)
        {
            this.saldo -= this.sacar;
        }

    }

    public float sald()
    {
        return this.saldo;
    }

    public Boolean stat()
    {
        return this.status;
    }

    public String toString()
    {

        return "---------------------------"+ "\n" + "Informações do Cliente " + "\n" +

            "\nConta:         "+ this.nConta + "\n" +
            "Dono:          "+ this.nomeDono + "\n" +
            "Tipo:          "+ this.tipo + "\n" +
            "Status:        "+ this.status + "\n" +
            "Despositado:   R$"+ this.depositar + "\n" +
            "Sacado:        R$"+ this.sacar + "\n" +
            "Saldo Total:   R$"+ this.saldo;
    }



}

