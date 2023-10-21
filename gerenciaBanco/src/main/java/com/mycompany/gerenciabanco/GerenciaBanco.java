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
        dbf.checaBd("database"); // Checa se o arquivo "database.txt" ja existe, se nao existir ja cria
        dbf.checaBd("transaction"); // Checa se o arquivo "database.txt" ja existe, se nao existir ja cria
    

        String temp = dbf.leituraBd(usrString, "database"); //
//        System.out.println(temp);
        if(temp.isEmpty()){
            dbf.escreveBd(usrString, "database");
        }
        
        int iterador = 0;

        while(iterador != 1){
        
            int inputMenu = usr.opcoesMenu();
            System.out.println(inputMenu);            
            switch(inputMenu){
                case 1:
                    System.out.println("Seu saldo e: ");
                    iterador++;
                    break;
                case 2:
                    System.out.println("Opcao selecionada: Deposito");
                    String[] transactionString = usr.coletaDadosTransacao(usrString[0]);
                    System.out.println(transactionString[0]);
                    System.out.println(transactionString[1]);
                    System.out.println(transactionString[2]);

                    dbf.escreveBd(transactionString, "transaction");
                                                            
                    iterador++;
                    break;
                case 3:
                    System.out.println("Qual valor voce deseja sacar?");
                    iterador++;
                    break;
                case 0:
                    System.out.println("Muito obrigado por ser cliente do banco! \n"+
                    "Ate a proxima!");
                    iterador++;
                    break;
                default:
                    System.out.println("Opcao invalida. Selecione um valor presente nas opcoes abaixo:");
            }
        }

        
    }
}
