package com.mycompany.gerenciabanco;

import java.util.*;
import java.io.*;

public class User {
    
    public char name; // Declara as variaveis
    public char lastName;
    public long document;
    public int  flagbd;

    public User(){} // Metodo construtor

    public long coletaDados(){
        Scanner myObj = new Scanner(System.in);  // Scanner para ler inputs
        System.out.println("Digite o seu documento (apenas numeros)");

        document = myObj.nextLong();  // Leitura do input do usuario
        System.out.println("Voce digitou o documento: " + document);
        return document;
    }
    
    public void checaBd(){
        try{
            File f = new File("database.txt"); // Indica qual arquivo queremos manipular
            if(f.createNewFile()){ //Tenta criar um arquivo com o nome dado
                System.out.println("Database criado!"); //Se nao der erro ele cria
            }else{
                System.out.println("Database ja existe!"); //Se arquivo ja existir ele avisa
            }
        }catch(IOException e){
            System.out.println("Ocorreu um erro:");
            e.printStackTrace(); // Caso falhe, retorna o erro
        }   
    }

}
