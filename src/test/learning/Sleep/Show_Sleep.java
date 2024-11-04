package Sleep;

public class Show_Sleep
{
    public static void main(String[] args)
    {
        Chair c1 = new Chair();
        c1.modelo = "Jantar" + c1;
        c1.cor = "Bege";
        c1.assento = false;
        c1.pernas = 4;
        c1.status();
        c1.sentar();

    }
}
