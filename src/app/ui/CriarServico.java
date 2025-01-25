/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.ui;

import app.model.Cliente;
import app.model.Funcionario;
import app.model.Servico;
import app.model.Veiculo;
import app.utils.Objetos;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author henri
 */
public class CriarServico extends javax.swing.JFrame {
    
    HashMap<String, Cliente> clientesCpf = new HashMap<>();
    HashMap<String, Funcionario> funcionariosCpf = new HashMap<>();
    /**
     * Creates new form CriarServico
     */
    public CriarServico() {
        initComponents();
        for (Map.Entry<Integer, Cliente> cliente : (Objetos.clientes).entrySet()) {
            clientesCpf.put(cliente.getValue().getCpf(), cliente.getValue());
        }
        for (Map.Entry<Integer, Funcionario> funcionario : Objetos.funcionarios.entrySet()) {
            funcionariosCpf.put(funcionario.getValue().getCpf(), funcionario.getValue());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlServico = new javax.swing.JPanel();
        lblDadosServico = new javax.swing.JLabel();
        lblCpfCliente = new javax.swing.JLabel();
        textCpfCliente = new javax.swing.JFormattedTextField();
        lblCpfFuncionario = new javax.swing.JLabel();
        textCpfFuncionario = new javax.swing.JFormattedTextField();
        lblNomeCliente = new javax.swing.JLabel();
        textNomeCliente = new javax.swing.JTextField();
        lblVeiculo = new javax.swing.JLabel();
        selectVeiculo = new javax.swing.JComboBox<>();
        lblNomeFuncionario = new javax.swing.JLabel();
        textNomeFuncionario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Serviço");

        lblDadosServico.setText("Dados do Serviço");

        lblCpfCliente.setText("CPF do Cliente:");

        try {
            textCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfClienteActionPerformed(evt);
            }
        });

        lblCpfFuncionario.setText("CPF do Funcionário:");

        try {
            textCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfFuncionarioActionPerformed(evt);
            }
        });

        lblNomeCliente.setText("Nome:");

        textNomeCliente.setEnabled(false);

        lblVeiculo.setText("Veículos:");

        selectVeiculo.setEnabled(false);
        selectVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectVeiculoActionPerformed(evt);
            }
        });

        lblNomeFuncionario.setText("Nome:");

        textNomeFuncionario.setEnabled(false);
        textNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeFuncionarioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Criar Serviço");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCancelar)
                .addComponent(btnConfirmar))
        );

        javax.swing.GroupLayout pnlServicoLayout = new javax.swing.GroupLayout(pnlServico);
        pnlServico.setLayout(pnlServicoLayout);
        pnlServicoLayout.setHorizontalGroup(
            pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServicoLayout.createSequentialGroup()
                .addComponent(lblDadosServico)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlServicoLayout.createSequentialGroup()
                        .addGroup(pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpfFuncionario)
                            .addComponent(lblCpfCliente)
                            .addComponent(lblVeiculo)
                            .addGroup(pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(selectVeiculo, javax.swing.GroupLayout.Alignment.LEADING, 0, 184, Short.MAX_VALUE)
                                .addComponent(textCpfFuncionario, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(92, 92, 92)
                        .addGroup(pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(textNomeFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlServicoLayout.createSequentialGroup()
                                .addGroup(pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeFuncionario)
                                    .addComponent(lblNomeCliente))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlServicoLayout.setVerticalGroup(
            pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServicoLayout.createSequentialGroup()
                .addComponent(lblDadosServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCliente)
                    .addComponent(lblNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfFuncionario)
                    .addComponent(lblNomeFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void selectVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectVeiculoActionPerformed

    }//GEN-LAST:event_selectVeiculoActionPerformed

    private void textCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfFuncionarioActionPerformed
        Funcionario funcionario;
        if ((funcionario = funcionariosCpf.get(textCpfFuncionario.getText())) != null) {
            textNomeFuncionario.setText(funcionario.getNome());
        }
    }//GEN-LAST:event_textCpfFuncionarioActionPerformed

    private void textNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeFuncionarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void textCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfClienteActionPerformed
        Cliente cliente;
        if ((cliente = clientesCpf.get(textCpfCliente.getText())) != null) {
            textNomeCliente.setText(cliente.getNome());
            selectVeiculo.removeAllItems();
            if (!cliente.getVeiculos().isEmpty()) {
                selectVeiculo.setEnabled(true);
                selectVeiculo.addItem(new Veiculo());
                for (Veiculo veiculo : cliente.getVeiculos())
                    selectVeiculo.addItem(veiculo);
            }
        }
    }//GEN-LAST:event_textCpfClienteActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String cpfCliente, cpfFuncionario;
        Veiculo veiculo;
        
        if ((cpfCliente = textCpfCliente.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Você precisa informar o CPF do cliente!", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else if ((cpfFuncionario = textCpfFuncionario.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Você precisa informar o CPF do funcionário!", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else if ((veiculo = (Veiculo) selectVeiculo.getSelectedItem()).getTipo().equals("Selecione")){
            JOptionPane.showMessageDialog(this, "Você precisa selecionar um veículo!", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else {
            Servico servico = new Servico(clientesCpf.get(cpfCliente), veiculo, funcionariosCpf.get(cpfFuncionario));
            Objetos.servicos.put(servico.getId(), servico);
            JOptionPane.showMessageDialog(this, "Serviço criado com sucesso!");
            this.dispose();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed
    
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
            java.util.logging.Logger.getLogger(CriarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblCpfFuncionario;
    private javax.swing.JLabel lblDadosServico;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JPanel pnlServico;
    private javax.swing.JComboBox<Veiculo> selectVeiculo;
    private javax.swing.JFormattedTextField textCpfCliente;
    private javax.swing.JFormattedTextField textCpfFuncionario;
    private javax.swing.JTextField textNomeCliente;
    private javax.swing.JTextField textNomeFuncionario;
    // End of variables declaration//GEN-END:variables
}
