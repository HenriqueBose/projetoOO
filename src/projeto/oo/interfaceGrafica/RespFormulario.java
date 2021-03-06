/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.oo.interfaceGrafica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import projeto.oo.Formulario;
import projeto.oo.PerguntaAberta;
import projeto.oo.PerguntaAlternativa;
import projeto.oo.PerguntaExclusiva;
import projeto.oo.PerguntaLista;
import projeto.oo.PerguntaOpcional;

/**
 *
 * @author Daniel1
 */
public class RespFormulario extends javax.swing.JFrame {

    /**
     * Creates new form RespFormulario
     */
    public RespFormulario() {
        initComponents();
    }
    public Formulario form1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Selecione o formulario");

        txtFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFileActionPerformed(evt);
            }
        });

        jButton1.setText("Arquivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            JFileChooser formulario = new JFileChooser();
            formulario.setDialogTitle("Procurar formulario");
            formulario.setFileSelectionMode(JFileChooser.FILES_ONLY);
            
            FileNameExtensionFilter filter = new FileNameExtensionFilter("formulario", "txt");
            
            formulario.setFileFilter(filter);
            int retorno = formulario.showOpenDialog(this);
            
            if(retorno == JFileChooser.APPROVE_OPTION){
              
                File file = formulario.getSelectedFile();
                txtFile.setText(file.getPath());
                
                
                
                
            }
            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileActionPerformed
        
        
        
        
        
        
        
    }//GEN-LAST:event_txtFileActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Menu().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       form1 = Formulario.getInstance();
       
       //form1.Ler(txtFile.getText());
       try{
           String arquivo = txtFile.getText();
           FileReader isr;
           isr = new FileReader(arquivo);
           BufferedReader br =new BufferedReader(isr);
           String s = br.readLine();
           form1.setNomeFormulario(s);  //Preencher info basicas do formulario
           s = br.readLine();
           form1.setDescricaoFormulario(s);
           s = br.readLine();
           form1.setDataInicio(s);
           s = br.readLine();
           form1.setDataFim(s);
           //Agora tem q ler as perguntas
           s = br.readLine();
        do{ 
           if(s=="$".toString()){
           
            }else{
                 switch(Integer.parseInt(s)){ //Estranho esse erro, se s=="$" entao essa parte nao deveria rodar
                 case 0:    //Pergunta Aberta     
                     PerguntaAberta p = new PerguntaAberta();
                     s = br.readLine();
                     p.setEnunciado(s);
                     s = br.readLine(); // ; = lixo
                      form1.addPergunta(p);
                       break;            
                 case 1:    //Pergunta Alternativa
                     PerguntaAlternativa u = new PerguntaAlternativa();
                     s = br.readLine();
                     u.setEnunciado(s);
                        for(int i=0; i < 5; i++){
                        s = br.readLine();
                        u.addAlternativa(s);
                        }
                     s = br.readLine(); // ; = lixo  
                      form1.addPergunta(u);
                       break;
                 case 4:    //Pergunta Opcional
                     PerguntaOpcional v = new PerguntaOpcional();
                     s = br.readLine();
                     v.setEnunciado(s);
                     for(int i=0; i < 5; i++){
                        s = br.readLine();
                        v.addAlternativa(s);
                        }
                     s = br.readLine(); // ; = lixo 
                      form1.addPergunta(v);
                       break;
                 case 3:    //Pergunta Lista
                     PerguntaLista w = new PerguntaLista();
                     s = br.readLine();
                     w.setEnunciado(s);
                     for(int i=0; i < 5; i++){
                        s = br.readLine();
                        w.addAlternativa(s);
                        }
                     s = br.readLine(); // ; = lixo 
                      form1.addPergunta(w);
                        break;
                 case 2:    //Pergunta Exclusiva
                     PerguntaExclusiva x = new PerguntaExclusiva();
                     s = br.readLine();
                     x.setEnunciado(s);
                     for(int i=0; i < 5; i++){
                        s = br.readLine();
                        x.addAlternativa(s);
                        }
                     s = br.readLine(); // ; = lixo 
                      form1.addPergunta(x);
                        break;
              }//Fim do switch
            }
           s = br.readLine();
        }while(s!=null);
       }catch (IOException ex) {
           Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex); 
       }
     //  JF_Formulario novo;   
      // novo = new JF_Formulario();
       
     //  novo.formName.setText("Ola Mundo 2");
       Formulario.cont = 0;
       new JF_Formulario().setVisible(true);
       dispose();
            
            //JOptionPane.showMessageDialog(null, form1.perguntas.get(Formulario.cont).getTipo());
            //JOptionPane.showMessageDialog(null, Formulario.cont);
            
      //dispose();
            
        
    }//GEN-LAST:event_jButton2ActionPerformed
                
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RespFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RespFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RespFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RespFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RespFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables
}
