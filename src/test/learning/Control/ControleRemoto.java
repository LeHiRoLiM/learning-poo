package Control;

public class ControleRemoto implements Controlador
{
    private int volume;
    private Boolean ligado;
    private Boolean tocando;

    public ControleRemoto()
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando= false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private Boolean getLigado() {
        return ligado;
    }

    private void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    private Boolean getTocando() {
        return tocando;
    }

    private void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("      | /");
        System.out.println(".______________.");
        System.out.println("|              |");
        System.out.println("|      TV      |");
        System.out.println("|______________|");
        System.out.println("\n----- MENU -----");
        System.out.println("Está ligado ? " +  this.getLigado());
        System.out.println("Está tocando ? "+ this.getTocando());
        System.out.print("Volume " + getVolume());
        for (int i  = 0; i <= this.getVolume(); i +=10)
        {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maiorVolume() {
        if (this.getLigado())
        {
            this.setVolume(this.getVolume()+5);
        }

    }

    @Override
    public void menorVolume() {
        if (this.getLigado())
        {
            System.out.println(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0)
        {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0)
        {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getLigado() && !(getTocando()))
        {
            this.setTocando(true);;
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando())
        {
            this.setTocando(false);
        }
    }
}
