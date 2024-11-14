package Herança;

public class Tecnico extends Aluno
{
    private String registroProfissional;

    public void pratricar()
    {
        System.out.println("Trabalhando");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
