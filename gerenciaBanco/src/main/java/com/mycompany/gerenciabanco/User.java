package com.mycompany.gerenciabanco;

import java.util.*;

public class User {
    
    public char name;
    public char lastName;
    public long  document;

    public User(){} // Metodo construtor

    public long coletaDados(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Digite o seu documento (apenas numeros)");

        document = myObj.nextLong();  // Read user input
        System.out.println("Voce digitou o documento: " + document);  // Output user input
        return document;

}
}
