package com.mycompany.gerenciabanco;

import java.io.File;
import java.io.FileWriter;
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
        public void escreveBd(String[] StringInserida){
            String tmpCpf = StringInserida[0];
            String tmpNome = StringInserida[1];
            String tmpSobreNome = StringInserida[2];

            String wtString  =  tmpCpf + ";" + tmpNome + ";" + tmpSobreNome;
            System.out.println("Voce esta salvando esses dados no banco: " + wtString);

            try {
                FileWriter myWriter = new FileWriter("database.txt");
                myWriter.write(wtString);
                myWriter.close();
                System.out.println("Dados salvos com sucesso");
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao salvar.");
                e.printStackTrace();
            }

        }
}
