package Herança;

public class Professor extends Pessoa
{
    private String especialidade;
    private int salaria;

    public void receberSalario()
    {
        System.out.println("Recebendo salário");
    }

    public String getEspecialidade() {
        return especialidade;

    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalaria() {
        return salaria;
    }

    public void setSalaria(int salaria) {
        this.salaria = salaria;
    }
}
