package Crazy;

public class Control implements Implement
{
    private String nomeDono;
    private float saldo;
    private Boolean status;

    public Control()
    {
        this.nomeDono = "Lehi Rolim";
        this.saldo = 50;
        this.status = true;
    }

    private String getNomeDono()
    {
        return nomeDono;
    }

    private void setNomeDono(String nomeDono_)
    {
        this.nomeDono = nomeDono_;
    }

    private float getSaldo()
    {
        return saldo;
    }

    private void setSaldo( float totsald)
    {
        this.saldo = totsald;
    }

    private Boolean getStatus()
    {
        return status;
    }

    private void setStatus(Boolean result)
    {
        this.status = result;
    }


    @Override
    public void mostrar()
    {
        System.out.println(" Se aparecer Tõ feliz !");
    }
}
