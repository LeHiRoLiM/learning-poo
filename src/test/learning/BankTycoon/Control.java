package BankTycoon;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Control implements Implement
{
    private int nconta;
    private String nomeDono;
    private char tipo;
    private Boolean status;
    private float saldo;

    public Control(String _dono, char _tipo)
    {
        this.nconta = (Show.uconta + 1);
        this.nomeDono = _dono;
        this.tipo = _tipo;
        this.status = true;

        switch (tipo)
        {
            case 'C':
                this.saldo = 10;
                break;
            case 'P':
                this.saldo = 20;
                break;
            default:
                throw new RuntimeException("Erro, os tipos válidos são 'c' ou 'p'.");
        }
    }

    private String getNomeDono()
    {
        return nomeDono;
    }

    private void setNomeDono(String nomeDono_)
    {
        this.nomeDono = nomeDono_;
    }

    private float getSaldo()
    {
        return saldo;
    }

    private void setSaldo( float totsald)
    {
        this.saldo = totsald;
    }

    private Boolean getStatus()
    {
        return status;
    }

    private void setStatus(Boolean result)
    {
        this.status = result;
    }

    public void mostrar()
    {
        System.out.println("\n-- Bem-vindo ao Banco Tycoon --\n\n[1] Criar Conta");
        Scanner a = new Scanner(System.in);
        int quest1 = a.nextInt();

        if ( quest1 == 1)
        {
            System.out.println("Qual seu nome ?(Primeiro e último)");
            Scanner b = new Scanner(System.in);
            this.nomeDono = b.nextLine();
            System.out.println("Que tipo de conta quer abrir ? (´C´ ou ´P´)");
            Scanner c = new Scanner(System.in);
            this.tipo = (c.next()).charAt(0);
            System.out.println("\n-- Bem-Vindo ao Banco Tycoon --\n");
            System.out.println(nomeDono + ",\n");
            System.out.println("Sua conta é: " + this.nconta);
            System.out.println("Tipo de Conta: " + tipo);
            System.out.println("Seu saldo é: " + saldo);
        }
    }
}
