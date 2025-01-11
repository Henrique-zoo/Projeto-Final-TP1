/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.ui;

import app.utils.Objetos;
import app.model.Cliente;
import app.model.Funcionario;
import app.model.Servico;
import app.model.Veiculo;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author henri
 */
public class CriarServico extends javax.swing.JFrame {

    /**
     * Creates new form CriarServico
     */
    public CriarServico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDadosServico = new javax.swing.JPanel();
        campoFuncionario = new javax.swing.JPanel();
        lblFuncionario = new javax.swing.JLabel();
        dadosFuncionario = new javax.swing.JPanel();
        pnlId = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        textCod = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        textCPF = new javax.swing.JTextField();
        campoCliente = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        dadosCliente = new javax.swing.JPanel();
        pnlIdCliente = new javax.swing.JPanel();
        lblCodCliente = new javax.swing.JLabel();
        textCodCliente = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        textNomeCliente = new javax.swing.JTextField();
        lblCPFCliente = new javax.swing.JLabel();
        textCPFCliente = new javax.swing.JTextField();
        campoVeiculo = new javax.swing.JPanel();
        lblVeiculo = new javax.swing.JLabel();
        dadosVeiculo = new javax.swing.JPanel();
        pnlIdVeiculo = new javax.swing.JPanel();
        lblCodVeiculo = new javax.swing.JLabel();
        textCodVeiculo = new javax.swing.JTextField();
        lblModeloVeiculo = new javax.swing.JLabel();
        textModeloVeiculo = new javax.swing.JTextField();
        lblPlacaVeiculo = new javax.swing.JLabel();
        textPlacaVeiculo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        campoButtons = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Serviço");

        painelDadosServico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 1, 18))); // NOI18N
        painelDadosServico.setLayout(new javax.swing.BoxLayout(painelDadosServico, javax.swing.BoxLayout.Y_AXIS));

        campoFuncionario.setLayout(new java.awt.GridLayout(2, 0));

        lblFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFuncionario.setText("Escolha um Funcionário:");
        campoFuncionario.add(lblFuncionario);

        dadosFuncionario.setLayout(new java.awt.GridLayout(1, 5, 4, 0));

        lblCod.setText("ID:");

        textCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIdLayout = new javax.swing.GroupLayout(pnlId);
        pnlId.setLayout(pnlIdLayout);
        pnlIdLayout.setHorizontalGroup(
            pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdLayout.createSequentialGroup()
                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlIdLayout.setVerticalGroup(
            pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCod))
            .addComponent(textCod, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dadosFuncionario.add(pnlId);

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNome.setText("Nome:");
        dadosFuncionario.add(lblNome);

        textNome.setEnabled(false);
        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });
        dadosFuncionario.add(textNome);

        lblCPF.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCPF.setText("CPF:");
        dadosFuncionario.add(lblCPF);

        textCPF.setEnabled(false);
        textCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCPFActionPerformed(evt);
            }
        });
        dadosFuncionario.add(textCPF);

        campoFuncionario.add(dadosFuncionario);

        painelDadosServico.add(campoFuncionario);

        campoCliente.setLayout(new java.awt.GridLayout(2, 1));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCliente.setText("Escolha um Cliente:");
        campoCliente.add(lblCliente);

        dadosCliente.setLayout(new java.awt.GridLayout(1, 5, 4, 0));

        lblCodCliente.setText("ID:");

        textCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIdClienteLayout = new javax.swing.GroupLayout(pnlIdCliente);
        pnlIdCliente.setLayout(pnlIdClienteLayout);
        pnlIdClienteLayout.setHorizontalGroup(
            pnlIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdClienteLayout.createSequentialGroup()
                .addComponent(lblCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlIdClienteLayout.setVerticalGroup(
            pnlIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdClienteLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCodCliente))
            .addComponent(textCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dadosCliente.add(pnlIdCliente);

        lblNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNomeCliente.setText("Nome:");
        dadosCliente.add(lblNomeCliente);

        textNomeCliente.setEnabled(false);
        textNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeClienteActionPerformed(evt);
            }
        });
        dadosCliente.add(textNomeCliente);

        lblCPFCliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCPFCliente.setText("CPF:");
        dadosCliente.add(lblCPFCliente);

        textCPFCliente.setEnabled(false);
        textCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCPFClienteActionPerformed(evt);
            }
        });
        dadosCliente.add(textCPFCliente);

        campoCliente.add(dadosCliente);

        painelDadosServico.add(campoCliente);

        campoVeiculo.setLayout(new java.awt.GridLayout(2, 1));

        lblVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVeiculo.setText("Selecione um Veiculo:");
        campoVeiculo.add(lblVeiculo);

        dadosVeiculo.setLayout(new java.awt.GridLayout(1, 5, 4, 0));

        lblCodVeiculo.setText("ID:");

        textCodVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIdVeiculoLayout = new javax.swing.GroupLayout(pnlIdVeiculo);
        pnlIdVeiculo.setLayout(pnlIdVeiculoLayout);
        pnlIdVeiculoLayout.setHorizontalGroup(
            pnlIdVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdVeiculoLayout.createSequentialGroup()
                .addComponent(lblCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlIdVeiculoLayout.setVerticalGroup(
            pnlIdVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdVeiculoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCodVeiculo))
            .addComponent(textCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dadosVeiculo.add(pnlIdVeiculo);

        lblModeloVeiculo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblModeloVeiculo.setText("Modelo:");
        dadosVeiculo.add(lblModeloVeiculo);

        textModeloVeiculo.setEnabled(false);
        textModeloVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textModeloVeiculoActionPerformed(evt);
            }
        });
        dadosVeiculo.add(textModeloVeiculo);

        lblPlacaVeiculo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPlacaVeiculo.setText("Placa:");
        dadosVeiculo.add(lblPlacaVeiculo);

        textPlacaVeiculo.setEnabled(false);
        textPlacaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPlacaVeiculoActionPerformed(evt);
            }
        });
        dadosVeiculo.add(textPlacaVeiculo);

        campoVeiculo.add(dadosVeiculo);

        painelDadosServico.add(campoVeiculo);
        painelDadosServico.add(jSeparator1);

        campoButtons.setPreferredSize(new java.awt.Dimension(307, 29));
        campoButtons.setLayout(new java.awt.GridLayout(1, 0));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        campoButtons.add(btnCancelar);
        campoButtons.add(filler1);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        campoButtons.add(btnCadastrar);

        painelDadosServico.add(campoButtons);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDadosServico, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDadosServico, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!textCod.getText().equals("") && !textCodCliente.getText().equals("") && !textCodVeiculo.getText().equals("")) {
            int idFuncionario = Integer.parseInt(textCod.getText());
            int idCliente = Integer.parseInt(textCodCliente.getText());
            int idVeiculo = Integer.parseInt(textCodVeiculo.getText());
            
            Funcionario funcionario = Objetos.funcionarios.get(idFuncionario);
            Cliente cliente = Objetos.clientes.get(idCliente);
            Veiculo veiculo = cliente.getVeiculoByID(idVeiculo);            
            Objetos.adicionarServico(new Servico(cliente, veiculo, funcionario));
            javax.swing.JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void textCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void textCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCPFActionPerformed

    private void textCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodClienteActionPerformed

    private void textNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeClienteActionPerformed

    private void textCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCPFClienteActionPerformed

    private void textCodVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodVeiculoActionPerformed

    private void textModeloVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textModeloVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textModeloVeiculoActionPerformed

    private void textPlacaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPlacaVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPlacaVeiculoActionPerformed

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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel campoButtons;
    private javax.swing.JPanel campoCliente;
    private javax.swing.JPanel campoFuncionario;
    private javax.swing.JPanel campoVeiculo;
    private javax.swing.JPanel dadosCliente;
    private javax.swing.JPanel dadosFuncionario;
    private javax.swing.JPanel dadosVeiculo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPFCliente;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodCliente;
    private javax.swing.JLabel lblCodVeiculo;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblModeloVeiculo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblPlacaVeiculo;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JPanel painelDadosServico;
    private javax.swing.JPanel pnlId;
    private javax.swing.JPanel pnlIdCliente;
    private javax.swing.JPanel pnlIdVeiculo;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextField textCPFCliente;
    private javax.swing.JTextField textCod;
    private javax.swing.JTextField textCodCliente;
    private javax.swing.JTextField textCodVeiculo;
    private javax.swing.JTextField textModeloVeiculo;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNomeCliente;
    private javax.swing.JTextField textPlacaVeiculo;
    // End of variables declaration//GEN-END:variables
}
