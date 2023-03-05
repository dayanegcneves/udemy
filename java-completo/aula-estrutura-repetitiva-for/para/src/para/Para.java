/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package para;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author daday
 */
public class Para {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(new Locale("en", "US"));
        
        Scanner sc = new Scanner(System.in);
        
        /*Ex1:
        System.out.println("Insira um número: ");
        int x = sc.nextInt();
        if(x>0 && x<=1000){
            for(int i=1; i<x; i++){
                if(i%2 != 0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Valor não permitido");
        }
        */
        
        /*Ex2:
        int qtdIn=0, qtdOut=0, x;
        System.out.println("Informe a quantidade de números");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            x = sc.nextInt();
            if(x>=10 && x<=20){
                qtdIn++;
            }
            else{
                qtdOut++;
            }
        }
        
        System.out.println(qtdIn + " int \n" + qtdOut + " out\n");
        */
        
        /*Ex3:
        float v1, v2, v3, media;
        System.out.println("Informe a quantidade de números");
        int n = sc.nextInt();
                
        for(int i=0; i<n; i++){
            v1 = sc.nextFloat();
            v2 = sc.nextFloat();
            v3 = sc.nextFloat();
            
            media = ((v1*2) + (v2*3) + (v3*5)) / 10;
            System.out.printf("\n%.1f\n\n", media);
        }
        */
        
        /*Ex4:
        float v1, v2, divisao;
        System.out.println("Informe a quantidade de números");
        int n = sc.nextInt();
                
        for(int i=0; i<n; i++){
            v1 = sc.nextFloat();
            v2 = sc.nextFloat();
            
            if(v2 == 0){
                System.out.println("Divisão impossível");
            }
            else{
                divisao = v1/v2;
                System.out.printf("\n%.1f\n\n", divisao);
            }
        }         
        */
        
        /*Ex5:
        System.out.println("Informe o número");
        int fatorial=1, n = sc.nextInt();
        
        if(n == 0){
            System.out.println("1");
        }
        else{
            for(int i=n; i>=1; i--){
                fatorial *= i;
            }
            System.out.println(fatorial);
        }
        */
        
        /*Ex6:
        System.out.println("Informe o número");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        */
        
        //Ex7:
        System.out.println("Informe o número");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
        }
        
        sc.close();
    }
    
}
