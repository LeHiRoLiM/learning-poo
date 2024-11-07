package Crazy;

import java.util.Scanner;

public class Control implements Implement
{
    private int nconta;
    private String nomeDono;
    private char tipo;
    private float depositar;
    private float sacar;
    private Boolean status;
    private float saldo;

    public Control(String _dono, char _tipo)
    {
        this.nconta = (Show.uconta + 1);
        this.nomeDono = _dono;
        this.tipo = _tipo;
        this.saldo = 50;
        this.status = true;
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

    @Override
    public void mostrar()
    {
        System.out.println("\n-- Bem-vindo ao Banco Tycoon -- \n" +"\n" + "O que deseja ?\n" +"[DIGITE]"+"\n");
        System.out.println("[1]  Saldo\n" + "[2]  Status\n" + "[3]  Todas as inforações");
        System.out.print("x ");
        Scanner wi = new Scanner(System.in);
        int wish = wi.nextInt();


    }
}
