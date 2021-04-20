/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import core.Cliente;
import core.Data;
import core.Log;


/**
 *
 * @author daniel
 */
public class Entrega extends javax.swing.JFrame {

    /**
     * Creates new form Entrega
     */
    public Entrega() {
        initComponents();
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
        campoTelefone = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        labelPesquisarCliente = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelContato = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        labelBotijao = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        List<Cliente> clientes = new ArrayList<Cliente>();

        for(Cliente cliente : Data.db.values()) {
            clientes.add(cliente);
        }
        listaCliente = new javax.swing.JSpinner();
        buttonEntrega = new javax.swing.JButton();
        botijaoKilos1 = new javax.swing.JComboBox<>();
        campoData = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrega");
        setResizable(false);

        campoEndereco.setEnabled(false);
        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });

        campoTelefone.setEnabled(false);
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });

        campoBairro.setEnabled(false);
        campoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBairroActionPerformed(evt);
            }
        });

        labelPesquisarCliente.setText("Pesquisar cliente");

        labelEndereco.setText("Endereço");

        labelContato.setText("Contato");

        labelBairro.setText("Bairro");

        labelBotijao.setText("Botijão (Kg)");

        labelData.setText("Data de Entrega");

        listaCliente.setModel(new javax.swing.SpinnerListModel(Data.nomeClientes(clientes)));
        listaCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                listaClienteStateChanged(evt);
            }
        });
        listaCliente.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                listaClientePropertyChange(evt);
            }
        });

        buttonEntrega.setText("Agendar Entrega");
        buttonEntrega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntregaActionPerformed(evt);
            }
        });

        botijaoKilos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "13 Kg", "15 Kg", "28 Kg" }));

        campoData.setModel(new javax.swing.SpinnerDateModel());
        campoData.setEditor(new javax.swing.JSpinner.DateEditor(campoData, "dd/MM/YYYY"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEndereco)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelEndereco))
                                        .addGap(0, 107, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelContato)
                                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(listaCliente)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBotijao)
                                    .addComponent(botijaoKilos1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelData)
                                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(buttonEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelBairro)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelPesquisarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(labelContato))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(labelBairro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(labelBotijao)
                        .addGap(4, 4, 4)
                        .addComponent(botijaoKilos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelData)
                        .addGap(4, 4, 4)
                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(buttonEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBairroActionPerformed

    private void definirPropriedadesDaTelaDeEntrega() {
        // Data.db.get(0);
        String clienteSelecionado = listaCliente.getValue().toString();
        Cliente cliente;
        
        campoBairro.setText("");
        campoEndereco.setText("");
        campoTelefone.setText("");
        
        if(!Data.db.containsKey(clienteSelecionado)) {
            return;
        }
        
        cliente = Data.db.get(clienteSelecionado);
        
        campoBairro.setText(cliente.getEndereco().getBairro());
        campoEndereco.setText(cliente.getEndereco().getEndereco());
        campoTelefone.setText(cliente.getContato());
    }
    
    private void buttonEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntregaActionPerformed
        // TODO add your handling code here:
        String tipo = "Agendamento";
        String data = campoData.getValue().toString();
        String mensagem = "Cliente: [" + listaCliente.getValue() + "] entrega de gás";
        StringBuilder m = new StringBuilder();
        
        Log log = new Log(mensagem, tipo, data);
        Data.saveLog(Log.formatarLog(mensagem, tipo, data));
        dispose();
    }//GEN-LAST:event_buttonEntregaActionPerformed

    private void listaClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_listaClienteStateChanged
        // TODO add your handling code here:
        definirPropriedadesDaTelaDeEntrega();
    }//GEN-LAST:event_listaClienteStateChanged

    private void listaClientePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_listaClientePropertyChange
        // TODO add your handling code here:
        definirPropriedadesDaTelaDeEntrega();
    }//GEN-LAST:event_listaClientePropertyChange

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
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> botijaoKilos1;
    private javax.swing.JButton buttonEntrega;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JSpinner campoData;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelBotijao;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelPesquisarCliente;
    private javax.swing.JSpinner listaCliente;
    // End of variables declaration//GEN-END:variables
}
