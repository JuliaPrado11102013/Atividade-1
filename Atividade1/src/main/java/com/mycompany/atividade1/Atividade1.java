/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Definição de dois números
        double num1 = 8;
        double num2 = 6;
        
        // Realizando operações matemáticas
        
        double soma = num1 + num2;
        double subtracao = num1 -num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN;  // Evita que a divisão dê errado.
        double resto = num1 % num2;
        double areaQuadrado = num1 * num1;
        double areaRetangulo = num1 * num2;
        double areaTriangulo = num1 * num2 / 2;
        double areaLosango = (num1 * num2) / 2;
        double areaCircunferencia = Math.PI * num1 * num1;
        double media = areaQuadrado + areaRetangulo + areaTriangulo + areaLosango + areaCircunferencia / 5;
        
        // Exibindo os resultados das contas
        
        System.out.println("Resultado das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao: "Indefinido (divisão por zero)"));
        System.out.println("Resto da divisão: " + resto);
        System.out.println("Área do Quadrado: " + areaQuadrado);
        System.out.println("Área do Retângulo: " + areaRetangulo);
        System.out.println("Área do Triângulo: " + areaTriangulo);
        System.out.println("Área do Losango: " + areaLosango);
        System.out.println("Área da Circunferência: " + areaCircunferencia);
        System.out.println("Média: " + media);
    }
    
}
