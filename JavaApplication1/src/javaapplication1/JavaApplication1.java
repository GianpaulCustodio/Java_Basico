/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author giant
 */
public class JavaApplication1 {
    
    public static void main(String[] args) {
        //Clase8
        //Scanner entrada = new Scanner(System.in);
        //Guardar Números:
        //float numero;
        //System.out.println("Digite un número: ");
            //numero=entrada.nextInt(); //Para los datos Int
        //numero = entrada.nextFloat(); //Guarda Float
        //System.out.println("El número es: "+numero);
        
        //Guardar cadenas:
        /*String cadena;
        System.out.println("Ingrese cadena:");
        cadena = entrada.nextLine();
        System.out.println("Lo que escribió fue: "+cadena);*/
        
        //Guardar una letra
        /*char letra;
        System.out.println("Ingrese una letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("Letra: "+letra);*/
        
        //Clase9
        /*String cadena;
        int entero;
        char letra;
        double decimal;
        //JOptionPane muestra los datos por medio de una ventana. NO usa consola.
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un decimal: "));
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El Entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "Decimal: "+decimal);*/
        
        //Clase10 Suma,resta, mult, div
        Scanner entrada = new Scanner(System.in);
        float n1,n2,suma,resta,mult,division;
        System.out.println("Primer número: ");
        n1=entrada.nextFloat();
        System.out.println("Segundo número: ");
        n2=entrada.nextFloat();
        suma = n1+n2;
        resta= n1-n2;
        mult= n1*n2;
        division= n1/n2;
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+mult);
        System.out.println("Division: "+division);
    }
    
}
         