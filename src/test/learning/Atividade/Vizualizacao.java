package learning.Atividade;

public class Vizualizacao
{
    private Gafanhoto expectador;
    private Video filme;

    public Vizualizacao(Gafanhoto expectador, Video filme)
    {
        this.expectador = expectador;
        this.filme = filme;
        this.expectador.setTotAssistindo(this.expectador.getTotAssistindo() + 1);
        this.filme.setViewa(this.filme.getViewa() + 1);
    }

    public Gafanhoto getExpectador() {
        return expectador;
    }

    public void setExpectador(Gafanhoto expectador) {
        this.expectador = expectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Vizualizacao{" +
                "expectador=" + expectador +
                ", filme=" + filme +
                '}';
    }
}
