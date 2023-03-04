/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e_vetor;

import javax.swing.JOptionPane;

/**
 *
 * @author daday
 */
public class OperacaoString {
    int i, n=5;
    String v[] = new String[n];
    
    public int menu(){
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a opção desejada:\n" +
                                                                "1 - Cadastrar\n" +
                                                                "2 - Consultar\n" +
                                                                "3 - Alterar\n" +
                                                                "4 - Ordenar crescente\n" +
                                                                "5 - Ordenar decrescente\n" +
                                                                "6 - Excluir\n" +
                                                                "7 - Imprimir\n" +
                                                                "8 - Sair\n", "Menu", 1));
        return op;
    }
    
    public void cadastrar(){
        for(i=0; i<n; i++){
            v[i] = JOptionPane.showInputDialog(null, "Informe a " + (i+1) + "ª palavra", "Palavra", 1);
        }
        JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso");
    }
    
    public void consultar(String palavra){
        int in=0;
        boolean achou = false;
        
        while((in<n) && (achou == false)){
            if(v[in].equals(palavra)){
                achou = true;
            }
            else{
                in++;
            }
        }
        
        if(achou == true){
            JOptionPane.showMessageDialog(null, "A palavra " + palavra + " consta na lista. \nPosição: " + in);
        }
        else{
            JOptionPane.showMessageDialog(null, "A palavra " + palavra + " NÃO consta na lista");
        }
    }
    
    public void alterar(String palavra){
       //Primeiro deve-se verificar se a palavra que o usuário deseja alterar consta na lista
        int in=0;
        boolean achou = false;

        while((in<n) && (achou == false)){
            if(v[in].equals(palavra)){
                achou = true;
            }
            else{
                in++;
            }
        }
        
        if(achou == true){
            v[in] = JOptionPane.showInputDialog(null, "Informe a nova palavra", "Alterar", 1);
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
        }
        else{
            JOptionPane.showMessageDialog(null, "A palavra " + palavra + " NÃO consta na lista");
        }
    }
    
    public void ordenaCrescente(){
        int in, j, z;
        String aux="";
        
        for(in=0; in<n; in++){
            for(j=in+1; j<n; j++){
                z = v[in].compareTo(v[j]);
                if(z>0){
                    aux = v[in];
                    v[in] = v[j];
                    v[j] = aux;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Ordenação crescente concluída", "Ordenação Crescente", 1);
    }
    
    public void ordenaDecrescente(){
        int in, j, z;
        String aux="";
        
        for(in=0; in<n; in++){
            for(j=in+1; j<n; j++){
                z = v[in].compareTo(v[j]);
                if(z<0){
                    aux = v[in];
                    v[in] = v[j];
                    v[j] = aux;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Ordenação decrescente concluída", "Ordenação Decrescente", 1);
    }
    
    public void excluir(String palavra){
        int in=0, j;
        boolean achou = false;

        while((in<n) && (achou == false)){
            if(v[in].equals(palavra)){
                achou = true;
            }
            else{
                in++;
            }
        }
        
        if(achou == true){
            for(j=in; j<n; j++){
                v[in] = v[in+1];
            }
            v[n-1] = "";
            JOptionPane.showMessageDialog(null, "Palavra excluída com sucesso", "Excluir", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "A palavra " + palavra + " NÃO consta na lista");
        }
    }
    
    public void imprimir(){
        String impressaoVetor = "";
        for(i=0; i<n; i++){
            impressaoVetor += "Posição " + i + ": " + v[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, impressaoVetor, "Imprimir", 1);
    }
}
