package lista01;

import java.util.Scanner;


public class Exercicio06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um nome:");
        String nome = s.nextLine();
        
//        System.out.println(nome);
//        System.out.println(nome.length());
        
        String contrario = "";
        
//        contrario = contrario + nome.charAt(4);
//        contrario += nome.charAt(4);
//        System.out.println(nome.charAt(4));
//        System.out.println(nome.charAt(3));
//        System.out.println(nome.charAt(2));
//        System.out.println(nome.charAt(1));
//        System.out.println(nome.charAt(0));

        int tamanho = nome.length();

        for (int i = tamanho-1; i >= 0; i--) {
            contrario += nome.charAt(i);
        }
        
        System.out.println(contrario);
    }
}
