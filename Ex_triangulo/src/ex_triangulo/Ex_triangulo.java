/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_triangulo;

import java.util.Scanner;

/**
 *
 * @author Boliclan
 */
public class Ex_triangulo {
static Scanner scn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definindo o tipo das variáveis
        double base;
        double altura;
        
        //Solicitação dos dados que serão utilizados para realizar o cálculo
        System.out.println("Digite o valor da base do triângulo: ");
        base = scn.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = scn.nextDouble();
        System.out.println("");
        
        //Calculando a sua área utilizando os dados fornecidos
         double area = (base * altura) / 2;
        //Retorno do resultado ao usuário
         System.out.println("A base do triângulo é: " + base );
         System.out.println("A altura do triângulo é: " + altura);
         System.out.println("A área do triângulo é: " + area);
    }
    
}
