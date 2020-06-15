/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1looping;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercicio1looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double base = numero.nextDouble();
        double expoente = numero.nextDouble();
        double potencia = numero.nextDouble();
        
        base = 3;
        expoente = 0;
        
    while (expoente <= 15)
    {
        if (expoente == 0)
        {
            potencia = 1;
        }
        else
        {
        if (expoente == 1)
        {
            potencia = base;
        }
        else
        {
            potencia *= base;
        }
            System.out.println("Oresultao é: "+ potencia);
        }
    }
    }
    
}
