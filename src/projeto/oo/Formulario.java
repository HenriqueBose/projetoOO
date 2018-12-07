    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.oo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrique
 */
public class Formulario {
    
   String nomeFormulario,
          descricaoFormulario,
          dataInicio, 
          dataFim;
   
   ArrayList<Pergunta> perguntas;
   
        private static Formulario instance;
       
                
                public Formulario(){
       
                    perguntas = new ArrayList<>();
                }
       
    
   public static Formulario getInstance(){
       if(instance == null){
           instance = new Formulario();
           
       }
       return instance;
   }
    public void addPergunta(Pergunta p){
       perguntas.add(p);        
    }   
       
    public String getNomeFormulario() {
        return this.nomeFormulario;
    }

    public void setNomeFormulario(String nomeFormulario) {
        this.nomeFormulario = nomeFormulario;
    }

    public String getDescricaoFormulario() {
        return descricaoFormulario;
    }

    public void setDescricaoFormulario(String descricaoFormulario) {
        this.descricaoFormulario = descricaoFormulario;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
   
   
   public  void  SalvarInicioForm (){
       
       try {

           FileWriter save = new FileWriter("formularios/"+this.nomeFormulario+".txt");//cria um arquivo txt.
           PrintWriter pw = new PrintWriter(save);//escreve no arquivo txt as seguintes informações:
           pw.println(this.nomeFormulario);//primeira linha: nome do formulario.
           pw.println(this.descricaoFormulario);//segunda linha:descricao do formulario.
           pw.println(this.dataInicio);//terceira linha: data de inicio.
           pw.println(this.dataFim);//quarta linha: data de termino.
           pw.close();
           //Pegar agora as perguntas seguindo o formato
           pw.flush();//aramazena todas de uma vez, para nao nada em buffer.
           //pw.close();//fecha a função de escrever.
          // save.close();//fecha o txt para e salva.
           
           
       } catch (IOException ex) {
          Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex); 
       }
        
   }
  
        public void Ler(String nomeForm) throws FileNotFoundException, IOException{
            
            try{
            String arquivo = nomeForm;
            FileReader isr;
                isr = new FileReader(arquivo);
            BufferedReader br =new BufferedReader(isr);
            String s =br.readLine();
            while(!"$".equals(s)){
                System.out.println(s);
                s = br.readLine();
            }
            }catch (IOException ex) {
          Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex); 
       }
   }

    

   
}

  





