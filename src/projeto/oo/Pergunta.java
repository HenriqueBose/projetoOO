/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.oo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrique
 */
public class Pergunta extends Formulario {
    
    private String enunciado;
    protected int tipo;

    public void setEnunciado(String arg){
        //teste pra salvar o enunciado da questao
        this.enunciado = arg;
    }
    public String getEnunciado(){
        return this.enunciado;
    }
    public int getTipo(){
    return tipo;
    }
    
     public void SalvarPergunta(PrintWriter pw){
            
    }
 }

