package com.mycompany.gerenciabanco;

public class GerenciaBanco {

    public static void main(String[] args) {
        System.out.println("Ola! Seja bem vindo ao sistema bancário");

        User usr;
        usr = new User();

        usr.coletaDados();
        
        usr.checaBd();
    }
}
