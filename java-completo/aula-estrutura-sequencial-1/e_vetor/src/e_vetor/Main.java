/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e_vetor;
import javax.swing.JOptionPane;
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
        int opcao;
        
        OperacaoString vetor = new OperacaoString();
        
        do{
            opcao = vetor.menu();
            
            switch (opcao) {
                case 1:
                    vetor.cadastrar();
                    break;
                case 2:
                    if(vetor.i == 0){
                        JOptionPane.showMessageDialog(null, "Não existem palavras cadastradas. Selecione a opção 1 do menu para cadastrar.");
                    }
                    else{
                        String nome = JOptionPane.showInputDialog(null, "Informe a palavra que deseja buscar", "Consultar", 1);
                        vetor.consultar(nome);
                    }
                    break;
                case 3:
                    if(vetor.i == 0){
                        JOptionPane.showMessageDialog(null, "Não existem palavras cadastradas. Selecione a opção 1 do menu para cadastrar.");
                    }
                    else{
                        String nome = JOptionPane.showInputDialog(null, "Informe a palavra que deseja alterar", "Consultar", 1);
                        vetor.alterar(nome);
                    }
                    break;
                case 4:
                    if(vetor.i == 0){
                        JOptionPane.showMessageDialog(null, "Não existem palavras cadastradas. Selecione a opção 1 do menu para cadastrar.");
                    }
                    else{
                        vetor.ordenaCrescente();
                    }
                    break;
                case 5:
                    if(vetor.i == 0){
                        JOptionPane.showMessageDialog(null, "Não existem palavras cadastradas. Selecione a opção 1 do menu para cadastrar.");
                    }
                    else{
                        vetor.ordenaDecrescente();
                    }
                    break;
                case 6:
                    if(vetor.i == 0){
                        JOptionPane.showMessageDialog(null, "Não existem palavras cadastradas. Selecione a opção 1 do menu para cadastrar.");
                    }
                    else{
                        String nome = JOptionPane.showInputDialog(null, "Informe a palavra que deseja excluir", "Consultar", 1);
                        vetor.excluir(nome);
                    }
                    break;
                case 7:
                    if(vetor.i == 0){
                        JOptionPane.showMessageDialog(null, "Não existem palavras cadastradas. Selecione a opção 1 do menu para cadastrar.");
                    }
                    else{
                        vetor.imprimir();
                    }
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }while(opcao != 8);
    }
    
}
