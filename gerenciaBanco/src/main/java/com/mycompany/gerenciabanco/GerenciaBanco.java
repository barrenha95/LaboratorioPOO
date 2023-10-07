package com.mycompany.gerenciabanco;

public class GerenciaBanco {

    public static void main(String[] args) {
        System.out.println("Ola! Seja bem vindo ao sistema bancário");

        User usr;
        usr = new User();
        String[] tempString = usr.coletaDados();
        System.out.println("O documento digitado foi: " + tempString[0]);
        System.out.println("O nome digitado foi: " +tempString[1]);
        System.out.println("O sobrenome digitado foi: " +tempString[2]);
        
        DbFunctions dbf;
        dbf = new DbFunctions();
        dbf.checaBd(); 
    }
}
