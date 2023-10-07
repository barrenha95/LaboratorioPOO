package com.mycompany.gerenciabanco;

public class GerenciaBanco {

    public static void main(String[] args) {
        System.out.println("Ola! Seja bem vindo ao sistema bancário");

        User usr; // Chama a classe user: Centralizei nesta classe tudo que diz respeito ao usuario
        usr = new User(); // Cria uma instancia da classe user
        String[] usrString = usr.coletaDados(); // Cria uma string para armazenar os dados do usuario
        System.out.println("O documento digitado foi: " + usrString[0]);
        System.out.println("O nome digitado foi: " + usrString[1]);
        System.out.println("O sobrenome digitado foi: " + usrString[2]);
        
        DbFunctions dbf; // Chama a classe DbFunctions: Centralizei todas as operacoes com o "banco de dados" (no caso um .txt para simplificar o projeto)
        dbf = new DbFunctions(); 
        dbf.checaBd(); // Checa se o arquivo "database.txt" ja existe, se nao existir ja cria

        dbf.escreveBd(usrString);
        dbf.leituraBd();
    }
}
