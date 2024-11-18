package learning.PolimorfismoSobrecarga;

import javax.naming.CompositeName;

public class Cachorro extends Lobo
{
    @Override
    public void emitirSom()
    {
        System.out.printf("AU Au Au");
    }

    public void reagir(String frase)
    {
        if (frase == "toma comida" || frase == "Olá")
        {
            System.out.printf("Abanar e Latir");
        }else
        {
            System.out.printf("Rosnar");
        }
    }

    public void reagir(int hora, int minuto)
    {
        if(hora < 12)
        {
            System.out.printf("Abanar");
        }else if ( hora >= 18)
        {
            System.out.printf("Ignorar");
        }else
        {
            System.out.printf("Abanar e Latir");
        }
    }

    public void reagir(boolean dono)
    {
        if (dono == true)
        {
            System.out.printf("Abanar");
        } else
        {
            System.out.printf("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso)
    {
        if (idade < 5)
        {
            if (idade < 10)
            {
                System.out.printf("Abanar");
            }else
            {
                System.out.printf("Latir");
            }
        } else
        {
            if (peso < 10 )
            {
                System.out.printf("Rosnar");
            } else
            {
                System.out.printf("Ignorar");
            }
        }
    }
}


