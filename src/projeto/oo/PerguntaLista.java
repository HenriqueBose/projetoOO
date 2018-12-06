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

/**
 *
 * @author Machado
 */
public class PerguntaLista extends Alternativas{
    ArrayList<Integer> selecionada;
    public PerguntaLista(){
        int i;
        this.selecionada = new ArrayList<Integer>();
        for(i=0;i<super.conjuntoAlternativas.size();i++){
            this.selecionada.add(i,0);
        } 
        super.tipo = 3;
    }
    
    public void Selecionar(int arg){   
         if(arg<super.conjuntoAlternativas.size()){ 
             this.selecionada.add(arg,1);
         }
       }
    
    public int lenght(){
        return this.selecionada.size();
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
     } catch (IOException ex) {
          Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex); 
       }
        
    }
    
}
