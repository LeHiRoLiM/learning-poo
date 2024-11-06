package Activity;

public class Show
{
    public static  int untimaConta = 0;

    public static void main(String[] args)
    {
        ContaBanco c1 = new ContaBanco("Mick Hill", 'c');
        ContaBanco c2 = new ContaBanco("Everton Hill", 'c');
        ContaBanco c3 = new ContaBanco("Priscila Hill", 'p');

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
