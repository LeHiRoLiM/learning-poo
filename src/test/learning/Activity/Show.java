package Activity;

import java.util.Scanner;

public class Show
{
    public static  int untimaConta = 0;

    public static void main(String[] args)
    {
        ContaBanco c1 = new ContaBanco("Lys Rolim", 'c');

        System.out.println("-- Bem-vindo ao Banco Lehinho -- \n" + "O que deseja ?");
        System.out.println("");
        Scanner fe = new Scanner(System.in);
        int fec = fe.nextInt();
        System.out.println(c1.toString());

    }
}
