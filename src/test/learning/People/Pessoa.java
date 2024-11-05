package People;

public class Pessoa
{
    private String nome;
    private float altura;
    private float peso;

    public Pessoa(String n, float a, float p){
        this.nome = n;
        this.altura = a;
        this.peso = p;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float xuxa){
        this.altura = xuxa;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String status(){
        return "O sujeito é " + this.getNome() + ". O peso dele é "+ this.getPeso()+ ". Sua altura é "+ this.getAltura();
    }
}
