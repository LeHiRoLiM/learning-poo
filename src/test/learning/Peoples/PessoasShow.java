package Peoples;

public class PessoasShow
{
    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Lehi");
        p1.setSexo("M");
        p1.setIdade(18);

        p2.setNome("Rosa");
        p2.setSexo("F");
        p2.setIdade(51);

        p3.setNome("Flares");
        p3.setSexo("M");
        p4.setIdade(55);

        p4.setNome("Lys");
        p4.setSexo("F");
        p4.setIdade(20);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
