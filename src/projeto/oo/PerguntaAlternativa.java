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
public class PerguntaAlternativa extends Alternativas{
   private ArrayList<Integer> selecionadas;
    public PerguntaAlternativa(){
       super.tipo = 1;
        int i;
        this.selecionadas = new ArrayList<Integer>();
       for(i=0;i<super.conjuntoAlternativas.size();i++){
           this.selecionadas.add(i,0);
       }
        //Todas as posições são pre-des-selecionadas e são inicializadas como 0
        //Posições selecionadas são marcadas como 1
    }
    
    public void addSelecao(int arg){
        if(arg<=super.conjuntoAlternativas.size()){
            this.selecionadas.add(arg, 1); 
        }
    }
    public void rmSelecao(int arg){
        this.selecionadas.add(arg, 0);
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
