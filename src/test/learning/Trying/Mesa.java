package Trying;

public class Mesa
{
    private String marca;
    private float largura;
    private String tipo;


    public Mesa(String m, float l, String t) {
        this.marca = m;
        this.largura = l;
        this.tipo = t;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){
        this.marca = m;
    }
    public float getLargura(){
        return this.largura;
    }
    public void setLargura(float l){
        this.largura = l;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void status (){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Largura: "+ this.getLargura());
        System.out.println("Tipo: "+ this.getTipo());
    }
}