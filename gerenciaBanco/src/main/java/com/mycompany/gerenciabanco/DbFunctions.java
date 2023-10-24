package com.mycompany.gerenciabanco;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DbFunctions {
        public void checaBd(String Arquivo){
        try{
            File f = new File( Arquivo +".txt"); // Indica qual arquivo queremos manipular
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
    
        public void escreveBd(String[] StringInserida, String Arquivo){
            String tmp1 = StringInserida[0];
            String tmp2 = StringInserida[1];
            String tmp3 = StringInserida[2];

            String wtString  =  "\n"+ tmp1 + ";" + tmp2 + ";" + tmp3;
            //System.out.println("Voce esta salvando esses dados no banco: " + wtString);

            try {
                FileWriter myWriter = new FileWriter(Arquivo +".txt", true);
                myWriter.write(wtString);
                myWriter.close();
                System.out.println("Dados salvos com sucesso");
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao salvar.");
                e.printStackTrace();
            }

        }

        public String leituraBd(String[] StringInserida, String Arquivo) {
            File f = new File(Arquivo +".txt"); /*Indica o arquivo que deve ser lido*/
            ArrayList<String> arr = new ArrayList<String>();
            String listaRetornos = new String();

            try{
                FileReader fr = new FileReader(f); /*Usado para fazer leitura de arquivos*/    
                BufferedReader br = new BufferedReader(fr); /*Traz uma serie de funcionalidade na leitura de texto*/
                //System.out.println("BufferReader criado com sucesso!");  
                String line ;

                while ( (line= br.readLine()) != null){ /*Enquanto a linha lida nao for nula*/
                if(line.matches(StringInserida[0]+"(.*)")){ /*Confere se  o documento inserido pelo usuario esta no bd*/
                    //System.out.println("Documento localizado com sucesso!");
                    arr.add(line);
                    //break; /*Encerra o loop para que nao fique executando ja tendo achado o documento*/
                }else{
                    System.out.println("Documento nao localizado!");
                }
                }
                br.close();
                fr.close();
                listaRetornos = String.join(", ", arr);        
                return(listaRetornos);
                
          }catch(FileNotFoundException ex){
                System.out.println("Bd nao encontrado!");
                return(listaRetornos);  
                
          }catch(IOException e){
                System.out.println("Erro!");  
                return(listaRetornos);  
          }
                        
       }
       
}
