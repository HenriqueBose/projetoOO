/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.oo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Machado
 */
public class PerguntaOpcional extends Alternativas {
    
    private int alternativa; // 1->Sim 2->Não
    public PerguntaOpcional(){
      super.addAlternativa("Sim ");
      super.addAlternativa("Não ");
       super.tipo = 2;
    }
    
    public int getResposta(){
        return this.alternativa; //Exeption caso alternativa seja NULL
    }
    
    public void setResposta(int arg){
       this.alternativa = arg;       
    }
    @Override
    public void SalvarPergunta(PrintWriter pw){
        int i;
         try{
         FileWriter save = new FileWriter("formularios/" + this.nomeFormulario +".txt",true);//cria um arquivo txt.
          pw = new PrintWriter(save);//escreve no arquivo txt as seguintes informações:
        pw.println(this.getEnunciado());
        pw.println(this.conjuntoAlternativas.size());
        for(i=0;i<this.conjuntoAlternativas.size();i++){
            pw.println(getAlternativa(i));
        }
        pw.println(";");
         }catch(IOException ex){
        Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
