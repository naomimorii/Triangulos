/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

/**
 *
 * @author naomi
 */
import java.util.Scanner;
public class Triangulos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double A, B, C;
        
        System.out.print("Digite as medidas do lado de um triângulo: \n");
        System.out.print ("Lado A: ");
        A = entrada.nextDouble();
        
        System.out.print("Lado B: ");
        B = entrada.nextDouble();
        
        System.out.print("Lado C: ");
        C = entrada.nextDouble();
        
        if((A+B>C) && (A+C>B) && (B+C>A))
        {
           if ((A == B) && (A == C) && (B == C))
            System.out.print("É um triângulo equílatero \n");
           else
            {
             if ((A != B) && (A != C) && (B != C))
             System.out.print("É um triângulo escaleno \n");
             else
               {
                if  ((A == B) && (A != C) || (A == C) && (A != B) || (B == C) && (B != A));
                 System.out.print("É um triângulo isósceles \n");
                }
            }        
       }
        else
            System.out.print("Não é um triângulo \n");
    }
        
    
}
