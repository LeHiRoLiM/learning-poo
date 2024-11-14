package Herança;

public class Show
{
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Lehi");
        v1.setIdade(23);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Tutu");
        a1.setIdade(18);
        a1.setMatricula("Engenharia");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula("1112");
        b1.setNome("Gabriel");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Lys");
        p1.setEspecialidade("Ba");
        System.out.println(
                p1.getEspecialidade()
        );
    }
}
