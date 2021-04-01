/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio2;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Caio
 */
public class Desafio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Criar um programa java que recebe um arquivo texto com código via linha de comando, exemplo:
        Prof, não entendi muito bem essa parte, então deixei somente para a pessoa digitar o código que ela quiser.
        java gera prog.txt 
        saída -> prog-check.txt
        */
        String codigo = "";
        Scanner scan = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();
        
        System.out.println("Digite o código:");
        codigo = scan.nextLine();
        for(int i = 0; i < codigo.length(); i++) {
            if(codigo.charAt(i) == '{' || codigo.charAt(i) == '[' || codigo.charAt(i) == '('){
                pilha.push(codigo.charAt(i));
            }
            else if(!pilha.empty() && (
                    (codigo.charAt(i) == '}' && pilha.peek() == '{') || 
                    (codigo.charAt(i) == ']' && pilha.peek() == '[') || 
                    (codigo.charAt(i) == ')' && pilha.peek() == '('))){
                pilha.pop();
            }
            else
            {
                pilha.push(codigo.charAt(i));
            }
        }
        
        if(pilha.empty()){
            System.out.println("Está balanceada!");
        }
        else{
            System.out.println("Não está balanceada!");
        }
    }
    
}
