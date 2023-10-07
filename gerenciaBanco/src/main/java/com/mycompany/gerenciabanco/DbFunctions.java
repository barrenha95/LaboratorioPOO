package com.mycompany.gerenciabanco;

import java.io.File;
import java.io.IOException;

public class DbFunctions {
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
