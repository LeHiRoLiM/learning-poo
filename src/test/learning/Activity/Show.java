package Activity;

import java.util.Scanner;

public class Show
{
    public static  int untimaConta = 0;

    public static void main(String[] args)
    {
        ContaBanco c2 = new ContaBanco("Lys Rolim", 'c');
        ContaBanco c1 = new ContaBanco("Lys Rolim", 'c');
        ContaBanco c3 = new ContaBanco("Lys Rolim", 'c');
        System.out.println("\n-- Bem-vindo ao Banco Tycoon -- \n" +"\n" + "O que deseja ?\n" +"[DIGITE]"+"\n");
        System.out.println("[1]  Saldo\n" + "[2]  Status\n" + "[3]  Todas as inforações");
        System.out.print(" x ");
        Scanner fe = new Scanner(System.in);
        int fec = fe.nextInt();

        if (fec == 1)
        {
            System.out.println("-------------------------");
            System.out.println("Seu Saldo é: R$" + c1.sald());
            System.out.println("-------------------------");
        }
        if ( fec ==2) {
            System.out.println("-------------------------");
            System.out.println("Status : " + c2.stat());
            System.out.println("Sua conta está Aberta. ");
            System.out.println("-------------------------");
        }
        if (fec == 3)
        {
            System.out.println(c3.toString());
        }
    }
}
