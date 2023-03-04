/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enquanto;

import java.util.Scanner;

/**
 *
 * @author daday
 */
public class Enquanto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        /*Ex1:
        System.out.println("Informe a senha");
        int senha = sc.nextInt();
        while(senha != 2002){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        */
        
        /*Ex2:
        System.out.println("Informe os valores para X e Y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        while(x != 0 && y != 0){
            if(x == 0 && y == 0){
                System.out.println("Origem");
            }
            if(x > 0 && y > 0){
                System.out.println("Primeiro");
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro");
            }
            else{
                System.out.println("Quarto");
            }
            
            x = sc.nextInt();
            y = sc.nextInt();
        }
        */
        
        //Ex3:
        int qtdAlcool=0, qtdGasolina=0, qtdDiesel=0;
        System.out.println("Informe o combustível");
        int c = sc.nextInt();
        while(c != 4){
            while(c<0 || c>4){
                System.out.println("Código Inválido");
                c = sc.nextInt();
            }
            
            if(c == 1){
                qtdAlcool++;
            }
            else if(c == 2){
                qtdGasolina++;
            }
            else{
                qtdDiesel++;
            }
            
            c = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO \nAlcool: " + qtdAlcool + "\nGasolina: " + qtdGasolina + "\nDiesel: " + qtdDiesel);
    }
    
}
