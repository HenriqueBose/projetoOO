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
 * @author Machado
 */
public class PerguntaAberta extends Pergunta {
    private String resposta;
    
    public PerguntaAberta(){
       super.tipo = 0;
    }
    
    public String getResposta(){
        return this.resposta;
    }
    
    public void setResposta(String arg){
        this.resposta = arg;
    }
    @Override
    public void SalvarPergunta(PrintWriter pw){
        try{
        FileWriter save = new FileWriter("formularios/" + this.nomeFormulario +".txt",true);//cria um arquivo txt.
        pw = new PrintWriter(save);//escreve no arquivo txt as seguintes informações:
        pw.println(this.getEnunciado());
        pw.println(0);
        pw.println(";");
        }catch(IOException ex){
        Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
