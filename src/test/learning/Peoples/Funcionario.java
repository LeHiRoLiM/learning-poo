package Peoples;

public class Funcionario extends Professor
{
    private String setor;
    private Boolean trabalhando;

    public void mudaTrabalho()
    {
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
