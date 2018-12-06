/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.oo;

import java.util.ArrayList;

/**
 *
 * @author Machado
 */
public class Alternativas extends Pergunta {
    ArrayList<String> conjuntoAlternativas;
    Alternativas(){
        conjuntoAlternativas = new ArrayList<String>();
    }
    
    public void addAlternativa(String arg){
    conjuntoAlternativas.add(arg);
    }
    
    
    public int getLenght(){
         return conjuntoAlternativas.size();
    }
    
    public String getAlternativa(int arg){
         return this.conjuntoAlternativas.get(arg);
    }
    
    
}
