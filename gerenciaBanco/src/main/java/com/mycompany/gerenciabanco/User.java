package com.mycompany.gerenciabanco;

import java.util.*;

public class User {
    
    public String name; // Declara as variaveis
    public String lastName;
    public String document;
    public int inputMenu;

    public User(){} // Metodo construtor

    public String[] coletaDados(){
        Scanner myObj = new Scanner(System.in);  // Scanner para ler inputs

        System.out.println("Digite o seu documento (apenas numeros)");
        document = myObj.nextLine();  // Leitura do input do usuario
        /*System.out.println("Voce digitou o documento: " + document + "\n");*/
        
        System.out.println("Digite o seu nome (minusculo)");
        name = myObj.nextLine();  // Leitura do input do usuario
        /*System.out.println("Voce digitou o nome: " + name + "\n");*/

        System.out.println("Digite o seu sobrenome (minusculo)");
        lastName = myObj.nextLine();  // Leitura do input do usuario
        /*System.out.println("Voce digitou o sobrenome: " + lastName + "\n");*/
        
        String[] tempString = {document, name, lastName}; 
        return tempString;
    }

    public int opcoesMenu(){
        Scanner myObj = new Scanner(System.in);  // Scanner para ler inputs

        //System.out.println("Pressione enter para acessar o sistema.");
        //myObj.nextLine();
        
        System.out.println("\n" + "Para acessar seu saldo digite 1 \n"+
                           "Para fazer um deposito digite 2 \n"+
                           "Para fazer um saque digite 3 \n"+
                           "Para sair digite 0 \n");                           
        
        inputMenu = myObj.nextInt();  // Leitura do input do usuario
        return inputMenu;
    }

}
