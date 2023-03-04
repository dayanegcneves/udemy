/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author daday
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //TESTE 1
        /*
        String product1 = "Computer", product2 = "Office desk";
        int age = 30, code = 5290;
        char gender = 'F';
        double price1 = 2100.0, price2 = 650.50, measure = 53.234567;
        
        System.out.println("Products: \n" + product1 + ", which price is $ " + price1 +
                           "\n" + product2 + ", which price is $ " + price2 + "\n");
        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n");
        System.out.println("Measue with eight decimal places: " + measure);
        System.out.printf("Rounded (three decimal places %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Rounded (three decimal places %.3f\n\n", measure);
        */
        
        //EX1: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
        /*
        int n1, n2, soma;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o 1º valor: ");
        n1 = sc.nextInt();
        
        System.out.println("Informe o 2º valor:");
        n2 = sc.nextInt();
        
        soma = n1+n2;
        
        System.out.println("A soma dos valores é: " + soma);
        */
        
        //EX2: Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
        /*
        float raio;
        double area, pi=3.14159;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor do raio: ");
        raio = sc.nextFloat();
        
        area = pi * Math.pow(raio, 2);
        System.out.printf("Área: %.4f\n", area);
        */
        
        //EX3: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        /*
        int a, b, c, d, diferenca;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os 4 valores:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        
        diferenca = (a*b - c*d);
        
        System.out.println("Diferença: " + diferenca);
        */
        
        //EX4: Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais
        /*
        int numero, horasTrabalho;
        float valorHora, salario;
        
        System.out.println("Infome seu número: ");
        numero = sc.nextInt();
        
        System.out.println("Informe o numero de horas trabalhadas: ");
        horasTrabalho = sc.nextInt();
        
        System.out.println("Informe o valor recebido por hora/trabalho: ");
        valorHora = sc.nextFloat();
        
        salario = horasTrabalho * valorHora;
        
        System.out.println("Número = " + numero);
        System.out.printf("Salário = R$ %.2f\n", salario);
        */
        
        //EX5: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        /*
        int cod1, cod2, qtdpecas1, qtdpecas2;
        float valorUnid1, valorUnid2, valorTotal;
        
        System.out.println("Informe o código da peça 1: ");
        cod1 = sc.nextInt();
        
        System.out.println("Informe a quantidade de peças");
        qtdpecas1 = sc.nextInt();
        
        System.out.println("Informe o valor unitario da peça 1");
        valorUnid1 = sc.nextFloat();
        
        System.out.println("Informe o código da peça 2: ");
        cod2 = sc.nextInt();
        
        System.out.println("Informe a quantidade de peças");
        qtdpecas2 = sc.nextInt();
        
        System.out.println("Informe o valor unitario da peça 2");
        valorUnid2 = sc.nextFloat();
        
        valorTotal = (qtdpecas1 * valorUnid1) + (qtdpecas2 * valorUnid2);
        
        System.out.printf("Valor a pagar: R$%.2f\n", valorTotal);
        */
        
        //EX6: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.
        
        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi= 3.14159;
        
        System.out.println("Informe o valor de A:");
        a = sc.nextDouble();
        
        System.out.println("Informe o valor de B:");
        b = sc.nextDouble();
        
        System.out.println("Informe o valor de C:");
        c = sc.nextDouble();
        
        areaTriangulo = (a*c)/2;
        areaCirculo = pi * Math.pow(c, 2);
        areaTrapezio = ((a+b)*c)/2;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a*b;
        
        System.out.printf("Triângulo: %.3f\n", areaTriangulo);
        System.out.printf("Circulo: %.3f\n", areaCirculo);
        System.out.printf("Trapezio: %.3f\n", areaTrapezio);
        System.out.printf("Quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Retângulo: %.3f\n", areaRetangulo);
    }
    
}
