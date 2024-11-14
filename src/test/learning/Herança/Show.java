package Herança;

public class Show
{
    public static void main(String[] args) {
//          Pessoa p1 = new Pessoa();
//          Visitante v1 = new Visitante();
//          v1.setNome("Lehi");
//          v1.setIdade(23);
//          v1.setSexo("M");
//          System.out.println(v1.toString());

          Aluno a1 = new Aluno();
          a1.setNome("Tutu");
          a1.setIdade(18);
          a1.setSexo("M");
          a1.setMatricula("Engenharia");
          System.out.println(a1.toString());

//        Bolsista b1 = new Bolsista();
//        b1.setMatricula("1112");
//        b1.setNome("Gabriel");
//        b1.setBolsa(12.5f);
//        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Lys Rolim");
        p1.setEspecialidade(p1.getNome());
        System.out.println(p1.getEspecialidade());

        Tecnico t1 = new Tecnico();
        t1.setMatricula("1113");
        t1.setRegistroProfissional("Técnico em nada");
        System.out.println(t1.getRegistroProfissional() +", "+t1.getMatricula());
    }
}
