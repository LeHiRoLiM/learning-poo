package Luta;

public class Lutador
{
    private String nome ;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int ida, float al, float pe, int vi, int de, int em)
    {
        nome = no;
        nacionalidade = na;
        idade = ida;
        altura = al;
        setPeso(pe);
        vitoria = vi;
        derrotas = de;
        empates = em;

    }

    private String getNome() {
        return nome;
    }

    private void setNome(String no){
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String na){
        this.nacionalidade= na;
    }

    private void setPeso(float pe) {
        peso = pe;
        setCategoria();
    }

    private void setCategoria() {
    }


    public void apresentar () {

    }
    public void status() {

    }
    public void ganharLuta() {

    }
    public void perderLuta() {

    }
    public void empatarLuta(){

    }
}
