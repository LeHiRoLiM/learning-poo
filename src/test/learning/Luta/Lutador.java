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

    public String getNome()
    {
        return nome;
    }

    public void setNome(String no)
    {
        this.nome = no;
    }

    public String getNacionalidade()
    {
        return nacionalidade;
    }

    public void setNacionalidade(String na)
    {
        this.nacionalidade= na;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int ida)
    {
        this.idade = ida;
    }

    public float getAltura()
    {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float pe)
    {
        peso = pe;
        setCategoria();
    }

    public String getCategoria()
    {
        return categoria;
    }
    private void setCategoria()
    {
        if (peso < 52.2)
        {
            categoria = "Inválido";
        }else if (peso <= 70.3)
        {
            categoria = "Levinho";
        } else if (peso <= 83.9)
        {
            categoria = "Brabo";
        } else if (peso <= 120.2)
        {
            categoria = "Mamute";
        } else
        {
            categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vi) {
        this.vitoria = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public void ganharLuta() {
        setVitoria(getVitoria() + 1);
    }
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
    public void status() {
        System.out.println("\n");
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitoria() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
    }
    public void apresentar () {
        System.out.println("\nUEFA\n-- Lutador -----");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem:  " + getNacionalidade());
        System.out.println("Idadee:  " + getIdade() + " anos");
        System.out.println("Altura:  " + getAltura() + " m ");
        System.out.println("Peso:    " + getPeso() + " Kg");
        System.out.println("Ganhou:  " + getVitoria());
        System.out.println("Perdeu:  " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }
}
