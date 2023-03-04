/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura.condicional;

/**
 *
 * @author daday
 */
public class Funcoes {
        
    public void positivoNegativo(int num){        
        if(num < 0){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("POSITIVO");
        }
    }
    
    public void parImpar(int num){        
        if(num%2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
    }
    
    public void multiplos(int num1, int num2){        
        if(num1%num2 == 0 || num2%num1 == 0){
            System.out.println("São multiplos");
        }
        else{
            System.out.println("Não são multiplos");
        }
    }
    
    public void duracaoJogo(int horaInicial, int horaFinal){
        int duracao;
        if(horaInicial < horaFinal){
            duracao = horaFinal-horaInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }
        else{
            duracao = 24 - horaInicial + horaFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }
    }
    
    public void tabela(int cod, int qtd){
        float valorTotal;
        
        if(cod == 1){
            valorTotal = (float) (4.00 * qtd);
        }
        else if(cod == 2){
            valorTotal = (float) (4.50 * qtd);
        }
        else if(cod == 3){
            valorTotal = (float) (5.00 * qtd);
        }
        else if(cod == 4){
            valorTotal = (float) (2.00 * qtd);
        }
        else{
            valorTotal = (float) (1.50 * qtd);
        }
        
        System.out.printf("Total: R$ %.2f\n", valorTotal);
    }
    
    public void intervalo(float num){
        if(num>0 && num<=25){
            System.out.println("Intervalo [0,25]");
        }
        else if(num>25 && num<=50){
            System.out.println("Intervalo [25,50]");
        }
        else if(num>50 && num<=75){
            System.out.println("Intervalo [50,75]");
        }
        else if(num>75 && num<=100){
            System.out.println("Intervalo [75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }
    }
    
    public void cartesiano(float x, float y){
        if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if(x == 0){
            System.out.println("Eixo Y");
        }
        else if(y == 0){
            System.out.println("Eixo X");
        }
        else if(x > 0){
            if(y > 0){
                System.out.println("Q1");
            }
            else{
                System.out.println("Q4");
            }
        }
        else{
            if(y > 0){
                System.out.println("Q2");
            }
            else{
                System.out.println("Q3");
            }
        }
    }
    
    public void salarioLisarb(float salario){
        float imposto;
        
        if(salario <= 2000){
            imposto = 0;
        }
        else if(salario <= 3000){
            imposto = (float) ((salario - 2000) * 0.08);
        }
        else if(salario <= 4500){
            imposto = (float) ((salario - 3000) * 0.18 + 1000 * 0.08);
        }
        else{
            imposto = (float) ((salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08);
        }
        
        if (imposto == 0.0) {
            System.out.println("Isento");
	}
	else {
            System.out.printf("R$ %.2f%n", imposto);
	}
    }
    
}
