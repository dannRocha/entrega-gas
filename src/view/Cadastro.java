package view;

import core.Cliente;
import core.Data;
import core.Endereco;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        salvarPropriedadesPadroesComponentes();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoEndereco = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoNumero = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoCEP = new javax.swing.JTextField();
        campoContato = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelCEP = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelContato = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        campoEndereco.setToolTipText("Endereço do cliente");
        campoEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoEnderecoFocusGained(evt);
            }
        });

        campoNome.setToolTipText("Nome do cliente");
        campoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeFocusGained(evt);
            }
        });
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        campoNumero.setToolTipText("Somente números");
        campoNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNumeroFocusGained(evt);
            }
        });

        campoBairro.setToolTipText("Bairro do cliente");
        campoBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoBairroFocusGained(evt);
            }
        });

        campoCEP.setToolTipText("Somente números");
        campoCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCEPFocusGained(evt);
            }
        });

        campoContato.setToolTipText("Somente números DDD + NUMERO");
        campoContato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoContatoFocusGained(evt);
            }
        });

        labelNome.setText("Nome");

        labelCEP.setText("CEP");

        labelEndereco.setText("Endereço");

        labelBairro.setText("Bairro");

        labelNumero.setText("Numero");

        labelContato.setText("Contato");

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoEndereco)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco)
                            .addComponent(labelNome))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoContato)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelContato)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(campoBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(219, 219, 219)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCEP)
                            .addComponent(labelCEP)
                            .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNome)
                .addGap(43, 43, 43)
                .addComponent(labelEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCEP)
                    .addComponent(labelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero)
                    .addComponent(labelContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void salvarPropriedadesPadroesComponentes() {
        defaultBorder = campoBairro.getBorder();
    }
    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed
    
    private boolean somenteNumeros(String string) {
        return string != null && string.matches("[-+]?\\d*\\.?\\d+");
    }
    private boolean validarEntradaDeDadosCadastro() {
        
        boolean valido = true;
        
        String bairro = campoBairro.getText();
        String cep = campoCEP.getText();
        String contato = campoContato.getText();
        String endereco = campoEndereco.getText();
        String numero = campoNumero.getText();
        String nome = campoNome.getText();
        
        final int COMPRIMENTO_CEP = 8;
        final int COMPRIMENTO_CONTATO = 11;
        final int COMPRIMENTO_STRING_VAZIA = 0;
        
        if(bairro.trim().length() == COMPRIMENTO_STRING_VAZIA) {
            campoBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 21, 21)));
            valido = false;
        }
        
        if(cep.trim().length() == COMPRIMENTO_STRING_VAZIA || !somenteNumeros(cep) || cep.length() < COMPRIMENTO_CEP) {
            campoCEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 21, 21)));
            valido = false;
        }
        
        if(contato.trim().length() == COMPRIMENTO_STRING_VAZIA || !somenteNumeros(contato) || contato.length() < COMPRIMENTO_CONTATO ) {
            campoContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 21, 21)));
            valido = false;
        }
        
        if(endereco.trim().length() == COMPRIMENTO_STRING_VAZIA) {
            campoEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 21, 21)));
            valido = false;
        }
        
        if(nome.trim().length() == COMPRIMENTO_STRING_VAZIA) {
            campoNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 21, 21)));
            valido = false;
        }
        
        if(numero.trim().length() == COMPRIMENTO_STRING_VAZIA || !somenteNumeros(numero)) {
            campoNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 21, 21)));
            valido = false;
        }
        
        return valido;
    }
    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
       
        Cliente cliente = new Cliente(
                campoNome.getText(), 
                new Endereco(
                        campoEndereco.getText(), 
                        campoNumero.getText(), 
                        campoBairro.getText(),
                        campoCEP.getText()
                ), 
                campoContato.getText()
        );
        
        
        
        if(validarEntradaDeDadosCadastro()) {
            Data.db.put(campoNome.getText(), cliente);
            dispose();
        }
   
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void campoBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoBairroFocusGained
        // TODO add your handling code here:
        campoBairro.setBorder(defaultBorder);
    }//GEN-LAST:event_campoBairroFocusGained

    private void campoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusGained
        // TODO add your handling code here:
        campoNome.setBorder(defaultBorder);
    }//GEN-LAST:event_campoNomeFocusGained

    private void campoEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEnderecoFocusGained
        // TODO add your handling code here:
        campoEndereco.setBorder(defaultBorder);
    }//GEN-LAST:event_campoEnderecoFocusGained

    private void campoCEPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCEPFocusGained
        // TODO add your handling code here:
        campoCEP.setBorder(defaultBorder);
    }//GEN-LAST:event_campoCEPFocusGained

    private void campoNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNumeroFocusGained
        // TODO add your handling code here:
        campoNumero.setBorder(defaultBorder);
    }//GEN-LAST:event_campoNumeroFocusGained

    private void campoContatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoContatoFocusGained
        // TODO add your handling code here:
        campoContato.setBorder(defaultBorder);
    }//GEN-LAST:event_campoContatoFocusGained

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
    
    private Border defaultBorder;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoContato;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    // End of variables declaration//GEN-END:variables
}
