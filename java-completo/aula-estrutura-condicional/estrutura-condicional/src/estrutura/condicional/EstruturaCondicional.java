/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author daday
 */
public class EstruturaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcoes funcao = new Funcoes();
        
        System.out.println("Informe o número");
        /*int n = sc.nextInt();
        int x = sc.nextInt();
        float y = sc.nextFloat();
        float z = sc.nextFloat();
        */
        float salario = sc.nextFloat();
        //EXE1: Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        //funcao.positivoNegativo(n);
        
        //EXE2: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        //funcao.parImpar(n);
        
        //EXE3: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
        //funcao.multiplos(n, x);
        
        //EX4: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        //funcao.duracaoJogo(n, x);
        
        //EX5: Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
        //funcao.tabela(n, x);
        
        //EXE6: Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
        //funcao.intervalo(y);
        
        //EX7: Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //funcao.cartesiano(y, z);
        
        //EXE8:
        funcao.salarioLisarb(salario);
    }
    
}
