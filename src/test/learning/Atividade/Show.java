package learning.Atividade;

public class Show
{
    public static void main(String[] args)
    {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula do HTML4");
        v[2] = new Video("aula de piano");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Lehi", 22, "M", "Ok");


        Vizualizacao vi[] = new Vizualizacao[2];
        vi[0] = new Vizualizacao(g[0], v[2]);
        System.out.println(vi.toString());
        vi[1] = new Vizualizacao(g[0], v[1]);
        System.out.println(vi[0].toString());

          System.out.println("Videos\n-----------------------");
          System.out.printf(v[0].toString());
          System.out.println("\nGafanhotos\n----------------- ");
          System.out.println(g[0].toString());

    }
}
