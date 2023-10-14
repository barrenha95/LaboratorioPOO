package com.mycompany.gerenciabanco;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DbFunctions {
        public void checaBd(){
        try{
            File f = new File("database.txt"); // Indica qual arquivo queremos manipular
            if(f.createNewFile()){ //Tenta criar um arquivo com o nome dado
                System.out.println("Database criado!"); //Se nao der erro ele cria
            }else{
                //System.out.println("Database ja existe!"); //Se arquivo ja existir ele avisa
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

            String wtString  =  "\n"+ tmpCpf + ";" + tmpNome + ";" + tmpSobreNome;
            //System.out.println("Voce esta salvando esses dados no banco: " + wtString);

            try {
                FileWriter myWriter = new FileWriter("database.txt", true);
                myWriter.write(wtString);
                myWriter.close();
                System.out.println("Dados salvos com sucesso");
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao salvar.");
                e.printStackTrace();
            }

        }

        public void leituraBd(String[] StringInserida) {
            File f = new File("database.txt"); /*Indica o arquivo que deve ser lido*/

            try{
                FileReader fr = new FileReader(f); /*Usado para fazer leitura de arquivos*/    
                BufferedReader br = new BufferedReader(fr); /*Traz uma serie de funcionalidade na leitura de texto*/
                //System.out.println("BufferReader criado com sucesso!");  
                String st;
                while ((st = br.readLine()) != null){ /*Enquanto a linha lida nao for nula*/
                if(st.matches(StringInserida[0]+"(.*)")){ /*Confere se  o documento inserido pelo usuario esta no bd*/
                    System.out.println("Documento localizado com sucesso!");
                    break; /*Encerra o loop para que nao fique executando ja tendo achado o documento*/
                }
                if((st = br.readLine()) == null){
                    escreveBd(StringInserida);
                }
                }
                
          }catch(FileNotFoundException ex){
                System.out.println("Bd nao encontrado!");  
                
          }catch(IOException e){
                System.out.println("Erro!");  
          }        
                        
       }
}
